public class HelloApp4 {
    public static void main(String[] args) {

        String message;

        // Check if arguments are provided
        if (args.length == 0) {
            message = "World";
        } else {
            // Join all arguments with comma and space
            message = String.join(", ", args);
        }

        // Display greeting
        System.out.println("Hello, " + message + "!");
    }
}