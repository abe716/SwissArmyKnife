

public class Help {

    public static void displayHelp() {

        System.out.println();
        System.out.println("==============================================");
        System.out.println("              SAK APPLICATION");
        System.out.println("==============================================");

        System.out.println("\nWelcome to SAK!");
        System.out.println("SAK retrieves website information and processes JSON indexes.");

        System.out.println("\n1. HELP FEATURE");
        System.out.println("Command:");
        System.out.println("java sak -Help");

        System.out.println("\n2. HTTP REQUEST FEATURE");
        System.out.println("Command:");
        System.out.println("java sak -HttpRequest [URL]");
        System.out.println("\nExample:");
        System.out.println("java sak -HttpRequest https://example.com");
        System.out.println("Retrieves and displays website information.");

        System.out.println("\n3. HTTP REQUEST INDEX FEATURE");
        System.out.println("Command:");
        System.out.println("java sak -HttpRequestIndex [URL]");
        System.out.println("\nExample:");
        System.out.println("java sak -HttpRequestIndex https://thunderbird-index-sp22.azurewebsites.net/index-w0a6zk195d");
        System.out.println("Retrieves a JSON index and processes additional URLs.");

        System.out.println("\nIMPORTANT INFORMATION");
        System.out.println("- Commands are not case-sensitive.");
        System.out.println("- An internet connection is required.");
        System.out.println("- Use valid HTTP or HTTPS URLs.");

        System.out.println("\n==============================================");
        System.out.println("              END OF HELP");
        System.out.println("==============================================");
    }
}
