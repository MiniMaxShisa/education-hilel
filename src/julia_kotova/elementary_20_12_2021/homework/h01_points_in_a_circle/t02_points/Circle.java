package julia_kotova.elementary_20_12_2021.homework.h01_points_in_a_circle.t02_points;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Circle extends Point {

    public Point centre;
    public int radius;

    public Circle(Point centre, int radius) {
        this.centre = centre;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public String findPointsCircle() {
        List<Point> pointsCircle = new ArrayList<>();
        String strPointsCircle;

        for (Point point : points) {
            double distance = calculateDistance(point, this);

            if (distance < this.getRadius()) {
                pointsCircle.add(point);
            }
        }

        if (pointsCircle.size() == 0) {
            strPointsCircle = "0 points in a circle.";
        } else {
            strPointsCircle = "Points in a circle: " + pointsCircle;
        }

        return strPointsCircle;
    }

}
