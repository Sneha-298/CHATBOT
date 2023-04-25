import java.util.Scanner;
import java.util.HashMap;

public class Chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        // Define responses
        HashMap<String, String> responses = new HashMap<String, String>();
        responses.put("hello", "Hi there!");
        responses.put("how are you", "I'm doing well, thank you for asking.");
        responses.put("tell me a joke", "Why don't scientists trust atoms? Because they make up everything.");
        responses.put("what is your name", "My name is Chatbot.");

        // Welcome message
        System.out.println("Hello, I am a chatbot. How can I assist you?");

        // Chatbot loop
        while (true) {
            // Get user input
            userInput = scanner.nextLine();

            // Handle user input
            String response = responses.get(userInput.toLowerCase());
            if (response != null) {
                System.out.println(response);
            } else {
                System.out.println("I'm sorry, I didn't understand what you said.");
            }
        }

        // Close scanner
        scanner.close();
    }
}