package Third_lesson.Task7;

public class Tester {
    public static void main(String[] args) {
        Book book = new Book("Пушкин", "Евгений Онегин", 1833);
        System.out.println(book.getAuthor());
        System.out.println(book.getName());
        System.out.println(book.getAge());
        book.setName("Война и мир");
        book.setAuthor("Толстой");
        book.setAge(1865);
        System.out.println(book);
    }
}
