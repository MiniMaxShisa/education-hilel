package julia_kotova.introduction_15_09_2021.classwork.l05_if_else_switch;

import java.util.Scanner;

public class SwitchTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int monthNumber = scanner.nextInt();

        switch (monthNumber) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Fab");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
            default:
                System.out.println("i don't know such month");
        }

    }

}
