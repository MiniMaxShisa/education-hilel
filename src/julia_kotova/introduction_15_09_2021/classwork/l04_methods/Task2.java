package julia_kotova.introduction_15_09_2021.classwork.l04_methods;

public class Task2 {

    public static void main(String[] args) {

        double length = 1;
        double width = 2;
        double height = 3;

        double volume = calculateVolume(length, width, height);

        Methods.printMessage("Volume: " + volume);

        Methods.printMessage("New volume: " + calculateVolume(1, 2, 3));

    }

    public static double calculateVolume(double length, double width, double height) {
       return length * width * height;
    }

}
