package Firts_Lesson;

public class Garmonic {
    public static void main(String[] args) {
        double result = 0;

        for (double i = 1; i <= 10 ; i++) {
            double n = 1 / i;
            System.out.printf("%.2f\n", (n));
            result += n;
        }
        System.out.printf("%.2f", result);
    }
}
