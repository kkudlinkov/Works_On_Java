package Second_Lesson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumTranslator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число и СС");
        double num = in.nextDouble();
        int base = in.nextInt();

        System.out.println("Число в 2 CC");
        translator(num,2);
        System.out.println("Число в 2 CC");
        translator(num,16);
        System.out.println("Число в 2 CC");
        translator(num,base);
    }


    public static void translator(double num, int base) {
        String config = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        ArrayList<Integer> integer_part = new ArrayList<>();
        ArrayList<Integer> frac_part = new ArrayList<>();
        int tmp = (int)num;

        while (tmp != 0){
            integer_part.add((int)tmp%base);
            tmp /= base;
        }
        Collections.reverse(integer_part);

        for (int j = 0; j < 3; j++) {
            frac_part.add((int) (num * base));
            num = (num * base) - (int) (num * base);
        }

        for (Integer el : integer_part) System.out.print(config.charAt(el));
        for (Integer el : frac_part) System.out.print(config.charAt(el));
        System.out.println();
    }
}