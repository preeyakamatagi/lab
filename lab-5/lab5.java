// import java.util.Scanner;
// class lab5{
//     public static void main(String[] args){

//     }
// }
import java.util.Scanner;

public class lab5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to select an option
        System.out.println("Please select an option:");
        System.out.println("1. Encrypt a message");
        System.out.println("2. Decrypt a message");
        int option = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character
        
        // Prompt user to enter a message
        System.out.println("Please enter a message:");
        String message = scanner.nextLine();
        
        // Perform the selected operation
        if (option == 1) {
            String encryptedMessage = encrypt(message);
            System.out.println("Encrypted message: " + encryptedMessage);
        } else if (option == 2) {
            String decryptedMessage = decrypt(message);
            System.out.println("Decrypted message: " + decryptedMessage);
        } else {
            System.out.println("Invalid option selected.");
        }
        
        scanner.close();
    }
    
    public static String encrypt(String message) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            
            // Check if character is a letter
            if (Character.isLetter(c)) {
                // Apply the Caesar cipher shift (3 positions to the right)
                c = (char) ((c - 'A' + 3) % 26 + 'A');
            }
            
            sb.append(c);
        }
        
        return sb.toString();
    }
    
    public static String decrypt(String message) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            
            // Check if character is a letter
            if (Character.isLetter(c)) {
                // Apply the Caesar cipher shift (3 positions to the left)
                c = (char) ((c - 'A'+23) % 26 + 'A');
            }
            
            sb.append(c);
        }
        
        return sb.toString();
    }
}

