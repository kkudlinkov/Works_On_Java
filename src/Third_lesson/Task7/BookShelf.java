package Third_lesson.Task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookShelf {
    private List<Book> books;
    private int amountbooks;

    public BookShelf() {
        books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }
    public void sort(){
        books = books.stream().sorted(Comparator.comparingInt(Book::getAge)).toList();
    }
    public void reverse(){
        books = books.stream().sorted(Comparator.comparingInt(Book::getAge)).sorted(Collections.reverseOrder()).toList();
    }
}
