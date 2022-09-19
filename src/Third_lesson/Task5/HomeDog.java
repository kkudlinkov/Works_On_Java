package Third_lesson.Task5;

import java.util.ArrayList;
import java.util.List;

public class HomeDog {
    private final List<Dog> dogList = new ArrayList<>();

    public void addDogs(Dog ... dogs){
        for (Dog dog : dogs){
            dogList.add(dog);
        }
    }

    @Override
    public String toString() {
        return "DogFarm{" +
                "dogList=" + dogList +
                '}';
    }
}
