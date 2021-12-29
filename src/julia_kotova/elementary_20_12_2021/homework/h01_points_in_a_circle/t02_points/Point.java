package julia_kotova.elementary_20_12_2021.homework.h01_points_in_a_circle.t02_points;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public double calculateDistance(Point point, Point circle) {
        return Math.sqrt((point.x - circle.getX()) * 2 + (point.y - circle.getY()) * 2);
    }

}
