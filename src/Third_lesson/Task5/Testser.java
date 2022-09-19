package Third_lesson.Task5;

public class Testser {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Pip", 6);
        Dog dog2 = new Dog("Morti", 2);
        Dog dog3 = new Dog("Siso", 12);
        Dog dog4 = new Dog("Kat", 4);
        Dog dog5 = new Dog("Stich", 1);

        System.out.println(dog4.getAgeHuman());

        HomeDog homeDog = new HomeDog();
        homeDog.addDogs(dog1, dog2, dog3, dog4);
        System.out.println(homeDog);
    }
}
