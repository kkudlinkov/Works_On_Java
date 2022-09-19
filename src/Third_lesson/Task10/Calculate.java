package Third_lesson.Task10;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Напиши что-то");
        String s = in.next();
        var result = s.split(" ");
        System.out.println(result.length);
    }
}
