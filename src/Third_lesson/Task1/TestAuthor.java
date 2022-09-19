package Third_lesson.Task1;

import Third_lesson.Task1.Author;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Имя Email Гендер\n");
        String name = in.next();
        String email = in.next();
        char gender = in.next().charAt(0);

        Author author = new Author(name, email, gender);
        System.out.println("Имя: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Gender: " +  author.getGender());

        System.out.print("Enter new email: ");
        String newMail = in.next();
        author.setEmail(newMail);

        System.out.println("Имя: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Gender: " +  author.getGender());

    }
}
