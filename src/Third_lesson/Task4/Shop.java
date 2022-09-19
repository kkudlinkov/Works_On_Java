package Third_lesson.Task4;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private final List<Computer> data;

    public void add(Computer computer){
        data.add(computer);
    }
    public Shop(){
        data = new ArrayList<Computer>();
    }
    public List<Computer> getData() {
        return data;
    }
}
