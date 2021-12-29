package julia_kotova.elementary_20_12_2021.homework.h01_points_in_a_circle.t02_points;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Circle {

    public Point centre;
    public int radius;

    public Circle(Point centre, int radius) {
        this.centre = centre;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle: centre = " + centre +
                ", radius = " + radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius && Objects.equals(centre, circle.centre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(centre, radius);
    }

    public List<Point> findPointsCircle() {
        List<Point> pointsCircle = new ArrayList<>();

        for (Point point : Point.points) {
            double distance = point.calculateDistance(point, centre);

            if (distance < radius) {
                pointsCircle.add(point);
            }
        }

        return pointsCircle;
    }

}
