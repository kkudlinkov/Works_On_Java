package Third_lesson.Task7;

public class Book {
    private String name;
    private String author;
    private int age;

    public Book(String name, String author, int age) {
        this.name = name;
        this.author = author;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", age=" + age +
                '}';
    }
}
