package julia_kotova.introduction_15_09_2021.homework.h16_palindrome;

import java.util.Scanner;

public class Homework16 {

    public static void main(String[] args) {

    Scanner scanner = new Scanner (System.in);
    String string = scanner.next();
    isPalindrome(string);
}

    public static void isPalindrome(String string) {

        StringBuilder reverse = new StringBuilder();

        for (int i = string.length() - 1; i >= 0; i--) {
            reverse.append(string.charAt(i));
        }

        if (string.equals(reverse.toString())) {
            System.out.println("Строка является палиндромом.");
        } else {
            System.out.println("Строка не является палиндромом.");
        }

    }

}
