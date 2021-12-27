package julia_kotova.elementary_20_12_2021.homework.h01_points_in_a_circle.t02_points;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static julia_kotova.elementary_20_12_2021.homework.h01_points_in_a_circle.t02_points.Point.findPointsCircle;
import static julia_kotova.elementary_20_12_2021.homework.h01_points_in_a_circle.t02_points.Point.points;

public class Main {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        printPointsCircle(requestPoints(), requestCircle());
    }



    public static ArrayList requestPoints() throws IOException {
        System.out.println("Enter point's coordinates:" + "\n" + "x:");
        int x = Integer.parseInt(reader.readLine());
        System.out.println("y:");
        int y = Integer.parseInt(reader.readLine());
        Point point = new Point(x, y);
        points.add(point);

        requestMorePoints();

        return (ArrayList) points;
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

    public static Circle requestCircle() throws IOException {
        return new Circle(requestCentre(), requestRadius());
    }

    public static Point requestCentre() throws IOException {
        System.out.println("Enter centre's coordinates:" + "\n" + "x:");
        int x = Integer.parseInt(reader.readLine());
        System.out.println("y:");
        int y = Integer.parseInt(reader.readLine());

        return new Point(x, y);
    }

    public static int requestRadius() throws IOException {
        System.out.println("Enter circle's radius:");
        return Integer.parseInt(reader.readLine());
    }

    public static void printPointsCircle(ArrayList points, Circle circle) {
        ArrayList pointsCircle = (ArrayList) findPointsCircle(points, circle);

        if (pointsCircle.size() == 0) {
            System.out.println("0 points in a circle.");
        } else {
            System.out.println("Points in a circle: " + pointsCircle);
        }
    }

}
