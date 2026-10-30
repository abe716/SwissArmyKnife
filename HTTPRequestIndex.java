

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HTTPRequestIndex {

    public void processIndex(String indexURL) {

        System.out.println("\n====================================");
        System.out.println("         HTTP REQUEST INDEX");
        System.out.println("====================================");

        // Retrieve the JSON index
        HttpRequest indexRequest = new HttpRequest();

        if (!indexRequest.readURL(indexURL)) {
            System.out.println("Unable to retrieve index.");
            return;
        }

        // Print original index data
        System.out.println("\nORIGINAL INDEX DATA");
        System.out.println("------------------------------------");
        System.out.println(indexRequest);

        // Find URLs inside the JSON index
        String indexData = indexRequest.toString();

        Pattern pattern = Pattern.compile(
            "https?://[^\\s\"\\\\<>]+",
            Pattern.CASE_INSENSITIVE
        );

        Matcher matcher = pattern.matcher(indexData);

        int count = 0;

        while (matcher.find()) {

            String additionalURL = matcher.group();
            additionalURL = additionalURL.replaceAll("[,;)}]+$", "");

            // Skip the original index URL
            if (additionalURL.equals(indexURL)) {
                continue;
            }

            count++;

            System.out.println("\n====================================");
            System.out.println("ADDITIONAL URL #" + count);
            System.out.println("====================================");

            HttpRequest additionalRequest = new HttpRequest();

            if (additionalRequest.readURL(additionalURL)) {
                System.out.println(additionalRequest);
            } else {
                System.out.println("Unable to retrieve: " + additionalURL);
            }
        }

        System.out.println("\n====================================");
        System.out.println("INDEX PROCESSING COMPLETE");
        System.out.println("Additional URLs found: " + count);
        System.out.println("====================================");
    }
}
