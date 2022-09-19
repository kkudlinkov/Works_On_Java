package Third_lesson.Task3;

public class Circle {
    private Point point;

    public Point getPoint() {
        return point;
    }

    public double getRadius() {
        return radius;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double radius;
    public Circle(Point point, double radius) {
        this.point = point;
        this.radius = radius;
    }

}
