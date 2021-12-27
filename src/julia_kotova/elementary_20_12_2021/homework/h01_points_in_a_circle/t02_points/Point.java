package julia_kotova.elementary_20_12_2021.homework.h01_points_in_a_circle.t02_points;

import java.util.ArrayList;
import java.util.List;

public class Point {

    public static List<Point> points = new ArrayList<>();
    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "[" + x + "," + y + "]";
    }

    public static List<Point> findPointsCircle(ArrayList points, Circle circle) {
        List<Point> pointsCircle = new ArrayList<>();

        for (Point point : Point.points) {
            double distance = calculateDistance(point, circle.getCentre());

            if (distance < circle.getRadius()) {
                pointsCircle.add(point);
            }
        }

        return pointsCircle;
    }

    public static double calculateDistance(Point point, Point circle) {
        return Math.sqrt((point.x - circle.getX()) * 2 + (point.y - circle.getY()) * 2);
    }

}
