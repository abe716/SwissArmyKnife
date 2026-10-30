
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HTTPRequestIndex {

    public void processIndex(String indexURL) {

        System.out.println("\n====================================");
        System.out.println("       HTTP REQUEST INDEX");
        System.out.println("====================================");

        System.out.println("Index URL: " + indexURL);

        // Retrieve the JSON index
        HTTPRequest indexRequest = new HTTPRequest();

        indexRequest.retrieveData(indexURL);

        String indexData = indexRequest.getResponseData();

        if (indexData == null) {
            System.out.println("Unable to retrieve index data.");
            return;
        }

        // Print original JSON index
        System.out.println("\n====================================");
        System.out.println("          ORIGINAL INDEX DATA");
        System.out.println("====================================");

        System.out.println(indexData);

        // Find additional URLs inside the JSON
        Pattern pattern = Pattern.compile(
                "https?://[^\\s\"\\\\<>]+",
                Pattern.CASE_INSENSITIVE
        );

        Matcher matcher = pattern.matcher(indexData);

        int count = 0;

        while (matcher.find()) {

            String additionalURL = matcher.group();

            // Remove common trailing punctuation
            additionalURL = additionalURL.replaceAll("[,;)}]+$", "");

            count++;

            System.out.println("\n====================================");
            System.out.println("       ADDITIONAL URL #" + count);
            System.out.println("====================================");

            HTTPRequest additionalRequest = new HTTPRequest();

            additionalRequest.retrieveData(additionalURL);
        }

        System.out.println("\n====================================");
        System.out.println("       INDEX PROCESSING COMPLETE");
        System.out.println("Total URLs found: " + count);
        System.out.println("====================================");

    }
}
