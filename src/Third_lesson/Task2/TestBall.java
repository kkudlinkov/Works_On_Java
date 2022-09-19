package Third_lesson.Task2;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Координаты x и y\n");
        double x = in.nextDouble();
        double y = in.nextDouble();

        Ball ball = new Ball(x,y);
        ball.setXY(x,y);
        System.out.println(ball);
        ball.move(5,-10);
        System.out.println(ball);
    }
}
