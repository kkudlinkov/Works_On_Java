package Second_Lesson;

import java.util.*;

public class ArrDel {
    public static void main(String[] args) {
        System.out.println("Enter the arr size");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        var arr = new ArrayList<Integer>(size);

        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr.add(i, r.nextInt(100));
        }
        showArr(arr);

        //Removing number
        System.out.println("Enter number that you want to delete");
        int num = in.nextInt();
        arr.removeIf(n -> n%10 == num);
        showArr(arr);

        System.out.println("Enter the num");
        int tmp = in.nextInt();
        arr.removeIf(n -> n%10 == tmp);
        showArr(arr);

    }

    public static void showArr(ArrayList<Integer> arr) {
        System.out.println("Arr size: " + arr.size());
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
}
