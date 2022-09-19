package Third_lesson.Task4;

public class Tester {
    public static void main(String[] args) {
        var shop = new Shop();
        shop.add(new Computer("1"));
        shop.add(new Computer("2"));
        shop.add(new Computer("3"));
        shop.add(new Computer("4"));
        shop.add(new Computer("5"));

        for (var computer : shop.getData()) {
            System.out.println(computer.toString());
        }
    }
}
