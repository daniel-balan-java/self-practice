package ConstructorPractices;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int max = nums[0];

        for (int each : nums) {
            if (each > max){
                max = each;
            }
        }
        System.out.println(max);
    }
}
