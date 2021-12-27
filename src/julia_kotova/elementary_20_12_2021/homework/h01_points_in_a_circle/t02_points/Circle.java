package julia_kotova.elementary_20_12_2021.homework.h01_points_in_a_circle.t02_points;

public class Circle {

    public Point centre;
    public int radius;

    public Circle(Point centre, int radius) {
        this.centre = centre;
        this.radius = radius;
    }

    public int getX() {
        return centre.getX();
    }

    public int getY() {
        return centre.getY();
    }

    public int getRadius() {
        return radius;
    }

    public Point getCentre() {
        return centre;
    }

}
