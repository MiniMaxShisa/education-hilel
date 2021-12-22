package julia_kotova.introduction_15_09_2021.homework.h13_rugby;

public class Homework13 {

    public static void main(String[] args) {

        System.out.println("Команда 1:");
        int[] teamOne = new int[25];
        fillArray(teamOne);
        printAge(teamOne);
        int averageTeamOne = calculateAverageAge(teamOne);

        System.out.println("Команда 2:");
        int[] teamTwo = new int[25];
        fillArray(teamTwo);
        printAge(teamTwo);
        int averageTeamTwo = calculateAverageAge(teamTwo);

        if (averageTeamOne < averageTeamTwo) {
            System.out.println("Средний возраст участников второй команды больше, чем первой.");
        } else if (averageTeamOne > averageTeamTwo) {
            System.out.println("Средний возраст участников первой команды больше, чем второй.");
        } else if (averageTeamOne == averageTeamTwo) {
            System.out.println("Средний возраст участников первой и второй команд одинаковый.");
        }

    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.floor(Math.random() * 100));
        }

    }

    public static void printAge(int[] array) {
        System.out.print("Возраст участников: ");
        for (int i : array) {
            System.out.print(i + "; ");
        }
        System.out.println();
    }

    public static int calculateAverageAge(int[] array) {
        int sumAverage = array[0];
        for (int i = 1; i < array.length; i++) {
            sumAverage = sumAverage + array[i];
        }
        int averageAge = sumAverage / array.length;
        System.out.println("Средний возраст в команде: " + averageAge + ".");
        System.out.println();
        return sumAverage;
    }

}
