package Firts_Lesson;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];

        //Enter Size of massive
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        //Sum from cycle FOR
        int sum = 0, i = 0;
        for (i = 0; i < size; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        // Sum from cycle WHILE
        i = 0;
        sum = 0;
        while (i < size) {
            sum += arr[i];
            i++;
        }
        System.out.println(sum);

        // Sum from cycle DO WHILE
        sum = 0;
        i = 0;
        do {
            sum +=arr[i];
            i++;
        } while (i < size);
        System.out.println(sum);
    }
}
