
public class Help {

    public static void displayHelp() {

        System.out.println();
        System.out.println("==============================================");
        System.out.println("              SAK APPLICATION");
        System.out.println("==============================================");

        System.out.println("\nWELCOME!");
        System.out.println("SAK is a Java command-line application that");
        System.out.println("retrieves website data and processes JSON indexes.");

        System.out.println("\n----------------------------------------------");
        System.out.println("AVAILABLE COMMANDS");
        System.out.println("----------------------------------------------");

        System.out.println("\n1. Display Help");

        System.out.println("   Command:");
        System.out.println("   java sak -Help");

        System.out.println("   Description:");
        System.out.println("   Displays instructions and examples.");

        System.out.println("\n2. HTTP Request");

        System.out.println("   Command:");
        System.out.println("   java sak -HttpRequest [URL]");

        System.out.println("   Example:");
        System.out.println("   java sak -HttpRequest https://example.com");

        System.out.println("   Description:");
        System.out.println("   Retrieves website data and prints it.");

        System.out.println("\n3. HTTP Request Index");

        System.out.println("   Command:");
        System.out.println("   java sak -HttpRequestIndex [URL]");

        System.out.println("   Example:");
        System.out.println("   java sak -HttpRequestIndex https://thunderbird-index-sp22.azurewebsites.net/index-w0a6zk195d");

        System.out.println("   Description:");
        System.out.println("   Retrieves a JSON index, identifies additional");
        System.out.println("   URLs, and retrieves their website data.");

        System.out.println("\n----------------------------------------------");
        System.out.println("IMPORTANT INFORMATION");
        System.out.println("----------------------------------------------");

        System.out.println("Commands are not case-sensitive.");
        System.out.println("Provide a valid HTTP or HTTPS URL.");
        System.out.println("An internet connection is required.");

        System.out.println("\n==============================================");
        System.out.println("             END OF HELP");
        System.out.println("==============================================");

    }
}
