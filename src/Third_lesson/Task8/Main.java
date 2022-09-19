package Third_lesson.Task8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество слов");
        List<String> list = new ArrayList<>();
        int size = in.nextInt();

        for (int i = 0; i < size; i++) {
            list.add(in.next());
        }
        Collections.reverse(list);
        for(String el: list){System.out.print(el + " ");}

    }
}
