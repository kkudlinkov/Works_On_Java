package Firts_Lesson;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int size = 10;

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < size; i++) {
            System.out.printf("%d ", array[i]);
        }
        Arrays.sort(array);

        for (int i = 0; i < size; i++) {
            System.out.printf("%d ", array[i]);
        }

    }
}
