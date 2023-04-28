package groupPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class Task9 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 8, 2, 5, 19, 24, -3, 0, 4, 4, 8, 205, 42));

        boolean result = true;

        for (int i = 0; i < list.size()-1; i+=2) {
            if (list.get(i) <= list.get(i+1)){
                result = true;
            }else {
                result = false;
                break;
            }
        }
        System.out.println(result);


    }
}
/*
9. Write a program that returns whether or not a list of integers is pairwise
 sorted (true if it is, false otherwise). A list is considered pairwise sorted if each
  successive pair of numbers is in sorted (non-decreasing) order. For example, if a variable
   called list stores the following sequence of values:
        [3, 8, 2, 5, 19, 24, -3, 0, 4, 4, 8, 205, 42]
then the following call:
should return the value true because the successive pairs of this list
 are all sorted: (3, 8), (2, 5), (19, 24), (-3, 0), (4, 4), (8, 205). Notice that the extra
  value 42 at the end had no effect on the result because it is not part of a pair.
If the list had instead stored the following values:
        [1, 9, 3, 17, 4, 28, -5, -3, 0, 42, 308, 409, 19, 17, 2, 4]
then the method should return the value false because the pair [19, 17] is not in sorted
 order. If a list is so short that it has no pairs, then it is considered to be pairwise sorted.
 */
