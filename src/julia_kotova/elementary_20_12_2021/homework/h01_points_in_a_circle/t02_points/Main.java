package julia_kotova.elementary_20_12_2021.homework.h01_points_in_a_circle.t02_points;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static List<Point> points = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        requestPoints();
        requestCircle();
        findPointsCircle();

    }



    public static void requestPoints() throws IOException {

        Point point;
        int x, y;

        System.out.println("Enter point's coordinates:" + "\n" + "x:");
        x = Integer.parseInt(reader.readLine());
        System.out.println("y:");
        y = Integer.parseInt(reader.readLine());
        point = new Point(x, y);
        points.add(point);

        requestMorePoints();

    }

    public static void requestMorePoints() throws IOException {

        System.out.println("Do you want to add more points? (1 - yes, 2 - no):");
        int choice = Integer.parseInt(reader.readLine());

        if (choice == 1) {
            requestPoints();
        } else if (choice == 2) {
            System.out.println("Your points:" + points.toString() + "\n");
        } else {
            System.out.println("Error!");
            requestMorePoints();
        }

    }

    public static void requestCircle() throws IOException {

        Point centre;
        int x, y, radius;

        System.out.println("Enter center's of the circle coordinates:" + "\n" + "x:");
        x = Integer.parseInt(reader.readLine());
        System.out.println("y:");
        y = Integer.parseInt(reader.readLine());
        centre = new Point(x, y);

        System.out.println("Enter circle's radius:");
        radius = Integer.parseInt(reader.readLine());

    }

    public static void findPointsCircle() {

        System.out.println("Points in a circle: ");

    }

    //точка лежит в окружности, если расстояние от центра окружности до точки меньше радиуса окружности
    //расстояние между точками насчитывается по формуле d = корень((x1-x2)^2 + (y1-y2)^2), где x1,y1- координаты первой точки, x2,y2- координаты второй

}
