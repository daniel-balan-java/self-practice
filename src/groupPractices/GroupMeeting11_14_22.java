package groupPractices;

public class GroupMeeting11_14_22 {

    public static void main(String[] args) {

        int[] numbers = {1,2,6,4,5};

        boolean is = false;

        for (int i = 0; i < numbers.length -1; i++) {
            if (numbers[i+1] - numbers[i] == 1){
                is = true;
            }else {
                is = false;
                break;
            }

        }
        System.out.println(is);

    }








}

/*
1. Write a program that returns true if a list of integers contains a sequence of consecutive integers and that returns false otherwise. Consecutive integers are integers that come one after the other, as in 5, 6, 7, 8, 9, etc.

2. Write a program that accepts an array of integers as a parameter and rotates the values in the array to the right (i.e., forward in position) by one. Each element moves right by one, except the last element, which moves to the front. For example, if a variable named list refers to an array containing the values {3, 8, 19, 7}, the call of rotateRight(list) should modify it to store {7, 3, 8, 19}. A subsequent call of rotateRight(list) would leave the array as follows: {19, 7, 3, 8}

3. Write a program that accepts an array of integers as a parameter and returns a new array twice as large as the original, replacing every integer from the original array with a pair of integers, each half the original. If a number in the original array is odd, then the first number in the new pair should be one higher than the second so that the sum equals the original number. For example, if a variable named list refers to an array storing the values {18, 7, 4, 24, 11}, the call of stretch(list) should return a new array containing {9, 9, 4, 3, 2, 2, 12, 12, 6, 5}. (The number 18 is stretched into the pair 9, 9, the number 7 is stretched into 4, 3, the number 4 is stretched into 2, 2, the number 24 is stretched into 12, 12 and the number 11 is stretched into 6, 5.)

4. Write a program that accepts an array of doubles as a parameter and returns true if the list is in sorted (nondecreasing) order and false otherwise. For example, if arrays named list1 and list2 store {16.1, 12.3, 22.2, 14.4} and {1.5, 4.3, 7.0, 19.5, 25.1, 46.2} respectively, the calls isSorted(list1) and isSorted(list2) should return false and true respectively. Assume the array has at least one element. A one-element array is considered to be sorted.

5. Write a program that accepts an array of Strings as its argument and returns true if that array is a palindrome (if it reads the same forwards as backwards) and /false if not. For example, the array {"alpha", "beta", "gamma", "delta", "gamma", "beta", "alpha"} is a palindrome, so passing that array to your method would return true. Arrays with zero or one element are considered to be palindromes.

6. Write a static method called minToFront that takes an array of integers as a parameter and that moves the minimum value in the list to the front by swapping its position with whatever is currently at the front of the list.

7. Write a program that accepts two arrays of integers a1 and a2 as parameters and replaces any occurrences of a2 in a1 with zeroes. The sequence of elements in a2 may appear anywhere in a1 but must appear consecutively and in the same order. For example, if variables called a1 and a2 store the following values:

int[] a1 = {1, 2, 3, 4, 1, 2, 3, 4, 5};
int[] a2 = {2, 3, 4};
The program should modify a1's contents to be {1, 0, 0, 0, 1, 0, 0, 0, 5}. Note that the pattern can occur many times, even consecutively. For the following two arrays a3 and a4:

int[] a3 = {5, 5, 5, 18, 5, 42, 5, 5, 5, 5};
int[] a4 = {5, 5};
The call of zeroOut(a3, a4); should modify a3's contents to be {0, 0, 5, 18, 5, 42, 0, 0, 0, 0}.

You may assume that both arrays passed to your method will have lengths of at least 1. If a2 is not found in a1, or if a1's length is shorter than a2's, then a1 is not modified by the call to your method. Please note that a1's contents are being modified in place; you are not supposed to return a new array. Do not modify the contents of a2.
 */
