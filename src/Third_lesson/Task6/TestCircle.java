package Third_lesson.Task6;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1, 2, 3);
        Circle circle2 = new Circle(1, 1, 8);
        Circle circle3 = new Circle(1, 2, 3);

        System.out.println(circle1.findArea());
        System.out.println(circle2.findLength());
    }
}
