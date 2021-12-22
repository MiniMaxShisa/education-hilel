package julia_kotova.introduction_15_09_2021.homework.h23_strings_password_generator;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PasswordGenerator {

    private static final int LENGTH = 8;
    private static final String NUMBER = "0123456789";
    private static final String UNDERSCORE = "_";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = LOWERCASE.toUpperCase();
    private static final String PASSWORD_CONDITION = LOWERCASE + UPPERCASE + NUMBER + UNDERSCORE;
    private static final SecureRandom random = new SecureRandom();

    public static String generatePassword() {

        StringBuilder result = new StringBuilder(LENGTH);

        String randomLowerCase = generateRandom(LOWERCASE, 1);
        result.append(randomLowerCase);

        String randomUppercaseCase = generateRandom(UPPERCASE, 1);
        result.append(randomUppercaseCase);

        String randomNumber = generateRandom(NUMBER, 1);
        result.append(randomNumber);

        String randomSymbols = generateRandom(PASSWORD_CONDITION, LENGTH - 3);
        result.append(randomSymbols);

        String password = result.toString();

        shuffle(password);

        return password;

    }

    private static String generateRandom(String input, int size) {

        if (input == null || input.length() <= 0)
            throw new IllegalArgumentException("Invalid input.");
        if (size < 1) throw new IllegalArgumentException("Invalid size.");

        StringBuilder result = new StringBuilder(size);

        for (int i = 0; i < size; i++) {
            int index = random.nextInt(input.length());
            result.append(input.charAt(index));
        }
        return result.toString();
    }

    private static String shuffle(String input) {

        List<String> result = Arrays.asList(input.split(""));
        Collections.shuffle(result);
        return String.join("", result);

    }

}
