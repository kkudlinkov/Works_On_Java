package Second_Lesson;

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt(), position = in.nextInt(),current = 2, count = 0, f1 = 0, f2 = 1, f3 = 0;
        while(count < size){
            f3 = f1+f2;
            if(current >= position){
                System.out.println(f3);
                count++;
            }
            f1 = f2;
            f2 = f3;
            current++;
        }

    }
}
