// Main App Ibrahim Mansour 


public class sak {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Welcome to SAK!");
            System.out.println("Type java sak -Help for instructions.");
            return;
        }

        String command = args[0];

        if (command.equalsIgnoreCase("-Help")) {

            Help.displayHelp();

        } else if (command.equalsIgnoreCase("-HttpRequest")) {

            if (args.length < 2) {
                System.out.println("Error: Please provide a URL.");
                System.out.println("Example: java sak -HttpRequest https://example.com");
                return;
            }

            HTTPRequest request = new HTTPRequest();
            request.retrieveData(args[1]);

        } else if (command.equalsIgnoreCase("-HttpRequestIndex")) {

            if (args.length < 2) {
                System.out.println("Error: Please provide the index URL.");
                System.out.println("Example: java sak -HttpRequestIndex https://thunderbird-index-sp22.azurewebsites.net/index-w0a6zk195d");
                return;
            }

            HTTPRequestIndex index = new HTTPRequestIndex();
            index.processIndex(args[1]);

        } else {

            System.out.println("Unknown command: " + command);
            System.out.println("Type java sak -Help for available commands.");
        }
    }
}
