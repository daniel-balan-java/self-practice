package WeeklyTasks.week9;

import java.util.ArrayList;
import java.util.List;

public class RemoveSomeValues {

    public List<Integer> remove(List<Integer> list){
        list.removeIf(number -> number > 100);
        return list;

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

    }


}
