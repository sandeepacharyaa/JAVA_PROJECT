import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {

    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+<>?";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Random Password Generator");
        System.out.println("Enter the desired length of the password:");
        int length = scanner.nextInt();
        
        System.out.println("Include numbers? (yes/no):");
        boolean includeNumbers = scanner.next().equalsIgnoreCase("yes");
        
        System.out.println("Include lowercase letters? (yes/no):");
        boolean includeLowercase = scanner.next().equalsIgnoreCase("yes");
        
        System.out.println("Include uppercase letters? (yes/no):");
        boolean includeUppercase = scanner.next().equalsIgnoreCase("yes");
        
        System.out.println("Include special characters? (yes/no):");
        boolean includeSpecial = scanner.next().equalsIgnoreCase("yes");

        String password = generatePassword(length, includeNumbers, includeLowercase, includeUppercase, includeSpecial);
        System.out.println("Generated Password: " + password);

        scanner.close();
    }

    private static String generatePassword(int length, boolean includeNumbers, boolean includeLowercase, boolean includeUppercase, boolean includeSpecial) {
        String characterSet = "";
        if (includeNumbers) characterSet += DIGITS;
        if (includeLowercase) characterSet += LOWERCASE;
        if (includeUppercase) characterSet += UPPERCASE;
        if (includeSpecial) characterSet += SPECIAL_CHARACTERS;

        if (characterSet.isEmpty()) {
            throw new IllegalArgumentException("At least one character set must be selected.");
        }

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterSet.length());
            password.append(characterSet.charAt(index));
        }

        return password.toString();
    }
}
