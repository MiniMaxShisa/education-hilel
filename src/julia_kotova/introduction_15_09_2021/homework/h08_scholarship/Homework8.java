package julia_kotova.introduction_15_09_2021.homework.h08_scholarship;

import java.util.Scanner;

public class Homework8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Submit your rating (five subjects):");
        int subject1 = scanner.nextInt();
        int subject2 = scanner.nextInt();
        int subject3 = scanner.nextInt();
        int subject4 = scanner.nextInt();
        int subject5 = scanner.nextInt();

        int averageRating = (subject1 + subject2 + subject3 + subject4 + subject5) / 5;

        if (averageRating > 9) {
            System.out.println("Your average rating: " + averageRating + ". You will receive an increased scholarship.");
        } else if (averageRating > 7) {
            System.out.println("Your average rating: " + averageRating + ". You will receive a regular scholarship.");
        } else {
            System.out.println("Your average rating: " + averageRating + ". You will not receive a scholarship.");
        }

    }

}
