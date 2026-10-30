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
                return;
            }

            HttpRequest request = new HttpRequest();

            if (request.readURL(args[1])) {
                System.out.println(request);
            } else {
                System.out.println("Unable to retrieve URL.");
            }

        } else if (command.equalsIgnoreCase("-HttpRequestIndex")) {

            if (args.length < 2) {
                System.out.println("Error: Please provide an index URL.");
                return;
            }

            HTTPRequestIndex index = new HTTPRequestIndex();
            index.processIndex(args[1]);

        } else {

            System.out.println("Unknown command: " + command);
            System.out.println("Type java sak -Help for instructions.");

        }
    }
}
