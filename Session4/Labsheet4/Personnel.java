import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

/**
 * The Personnel class represents a user in an user authentication program.
 * A Personnel object does not store the password directly. Instead it stores a hashed version.
 */
public class Personnel
{
    private String firstName;
    private String lastName;
    private String username;
    private String hashedPassword;
    private int salt;
    AccessLevel type;
    
    private static Scanner scanner = new Scanner(System.in);

    /**
     * The constructor method for the Personnel class.
     * This method takes the necessary information from the user, performs the hash and salt encryption on the password,
     * and creates a new Personnel object with the encrypted password.
     */
    public Personnel()
    {
        System.out.println("Enter first name: ");
        String firstName = scanner.next();
        System.out.println("Enter last name: ");
        String lastName = scanner.next();
        System.out.println("Enter password: ");
        String password = scanner.next();
        System.out.println("Re-enter password: ");
        String confirmPassword = scanner.next();

        if (password.equals(confirmPassword))   // Check if the passwords entered match each other.
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.username = (firstName + lastName).toLowerCase();

            // Generate a random number to be used as the salt and store it in the salt attribute.
            SecureRandom rng = new SecureRandom();
            this.salt = rng.nextInt(10000);

            // Prepend the salt to the user given password and encrypt it using the hash() method. Store the returned
            // value in the hashedPassword attribute.
            this.hashedPassword = hash(this.salt + password);
        }
        else
        {
            System.out.println("The passwords you entered do not match.");
        }
    }

    /**
     * The hash() method performs encryption on a String using a Ceaser Cipher.
     * The method is made static since we may need to access it without using a Personnel object.
     * @param toBeHashed The String to be encrypted
     * @return The encrypted String
     */
    private static String hash(String toBeHashed)
    {
        StringBuilder stringBuilder = new StringBuilder();  // Since we are building up the encrypted String character
        // by character, we will be using a StringBuilder instead of a String.
        char c;     // Variable to hold the current character if it is a letter.
        int num;    // Variable to hold the current character if it is a number.
        int shift = 4;  // The shift value to be used in the Caeser Cipher. It can be any integer, as long as it remains
                        // constant.

        // Loop through each character of the String to be hashed.
        for (int i = 0; i < toBeHashed.length(); i++)
        {
            c = toBeHashed.charAt(i);   // Current character
            if (Character.isLetter(c))  // Check if the current character is a letter
            {
                c += shift; // Add the shift value to the current character.

                if (c < 'z')
                {
                    // If adding the shift value to the current character does not take it outside the
                    // alphabet, then we can do it straight away. Append the result to stringBuilder.
                    stringBuilder.append(toBeHashed.charAt(i) + shift);
                }
                else
                {
                    // If adding the shift value to the current character does take it outside the alphabet, then we
                    // need to subtract 26 in order to bring it back inside the alphabet. Append the result to
                    // stringBuilder.
                    stringBuilder.append(toBeHashed.charAt(i) - (26 - shift));
                }
            }
            else    // If the current character is a number
            {
                num = (Character.getNumericValue(c) * 1346);    // To encrypt a number, we simply multiply it by a fixed
                // value.
                stringBuilder.append(Integer.toString(num));
            }
        }
        return stringBuilder.toString();    // Build the String from stringBuilder and return the encrypted String.
    }

    /**
     * This method asks the user to enter their username and password.
     * Performs validation on the user credentials(login information).
     * @return Boolean true if validation successful. Boolean false if validation failed.
     */
    public Boolean validateLogin()
    {
        System.out.println("Enter username: ");
        String userName = scanner.next();

        // The username check is case insensitive. Therefore, the equalsIgnoreCase() method is used.
        if (userName.equalsIgnoreCase(this.username))
        {
            System.out.println("Enter password: ");
            String password = scanner.next();

            // Prepend the salt to the entered password, perform hash function on the result, and check whether it
            // matches the stored hashedPassword.
            if (hash(this.salt + password).equals(this.hashedPassword))
            {
                // If it matches, then validation is successful. Return true.
                return true;
            }
        }
        // The method will only reach the statement below if and only if the validation failed on either the username
        // or the password. Therefore, if the method reaches here, return false.
        return false;
    }

    
    
}
