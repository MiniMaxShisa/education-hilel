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

        requestPoint();
        findPointsCircle();

    }



    public static void requestPoint() throws IOException {

        System.out.println("Enter point's coordinates:" + "\n" + "x:");
        int x = Integer.parseInt(reader.readLine());
        System.out.println("y:");
        int y = Integer.parseInt(reader.readLine());
        Point point = new Point(x, y);
        points.add(point);

        requestMorePoints();

    }

    public static void requestMorePoints() throws IOException {

        System.out.println("Do you want to add more points? (1 - yes, 2 - no):");
        int choice = Integer.parseInt(reader.readLine());

        if (choice == 1) {
            requestPoint();
        } else if (choice == 2) {
            System.out.println("Your points:" + points.toString() + "\n");
        } else {
            System.out.println("Error!");
            requestMorePoints();
        }

    }

    public static Circle requestCircle() throws IOException {

        Point centre = requestCentre();
        int radius = requestRadius();

        return new Circle(centre, radius);

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

    public static void findPointsCircle() throws IOException {

        List<Point> pointsCircle = new ArrayList<>();

        Circle circle = requestCircle();

        for (Point point : points) {

            double distance = calculateDistance(point, circle);

            if (distance < circle.getRadius()) {
                pointsCircle.add(point);
            }

        }

        if (pointsCircle.size() == 0) {
            System.out.println("0 points in a circle.");
        } else {
            System.out.println("Points in a circle: " + pointsCircle);
        }

    }

    public static double calculateDistance(Point point, Circle circle) {
        return Math.sqrt((point.x - circle.getX()) * 2 + (point.y - circle.getY()) * 2);
    }

}
