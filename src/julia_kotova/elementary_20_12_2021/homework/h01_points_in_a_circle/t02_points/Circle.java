package julia_kotova.elementary_20_12_2021.homework.h01_points_in_a_circle.t02_points;

public class Circle extends Point {

    public Point centre;
    public int radius;

    public Circle(Point centre, int radius) {
        this.centre = centre;
        this.radius = radius;
    }

    public Point getCentre() {
        return centre;
    }

    public int getRadius() {
        return radius;
    }

}
