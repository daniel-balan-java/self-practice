package groupPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7, 2, 8, 9, 4, 13, 7, 1, 9, 10, 11));

        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < list.size(); i+=2) {
            list2.add(list.get(i) + list.get(i+1));

        }
        System.out.println(list2);

    }
}
/*
8. Write a program that collapses a list of integers by replacing each successive pair of integers with the sum of the pair. For example, if a variable called list stores this sequence of values:
        [7, 2, 8, 9, 4, 13, 7, 1, 9, 10]
The first pair should be collapsed into 9 (7 + 2), the second pair should be collapsed into 17 (8 + 9), the third pair should be collapsed into 17 (4 + 13) and so on to yield:
        [9, 17, 17, 8, 19]
If the list stores an odd number of elements, the final element is not collapsed. For example, the sequence:
        [1, 2, 3, 4, 5]
would collapse into:
        [3, 7, 5]
 */