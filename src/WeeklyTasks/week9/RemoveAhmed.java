package WeeklyTasks.week9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveAhmed {

    /*
    Given a list of people's names: "Ahmed", "John", "Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
     */
    /*
    public static List<String> remove(List<String> names) {
        names.removeAll(Arrays.asList("Ahmed"));
        return names;

    }
     */

    /*
    public static List<String> remove(List<String> names){
        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            if (it.next().equals("Ahmed"))
                it.remove();
        }
        return names;
    }

     */

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        System.out.println(removeAhmed("Ahmed",names));
    }

    public static ArrayList<String> removeAhmed (String nameAhmed, ArrayList<String> names){
        names.removeAll(Arrays.asList(nameAhmed));
        return names;
    }

}