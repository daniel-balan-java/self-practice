package selfPractice;

public class ReverseMultidimensionalArray {

    public static void main(String[] args) {

        int[][] numbers = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};


        for (int i = 0; i < numbers.length ; i++) {  // it is gonna check every index

            if (i == 1)  // if index = 1
                for (int j = numbers[i].length - 1; j >= 0; j--) {  // it will reverse
                    System.out.print(numbers[i][j] + " ");
                }

            else {
                System.out.println();  // to get to the next line
                for (int m = 0; m < numbers[i].length ; m++) {   // if index !=0, it is gonna write in ascending oreder
                    System.out.print(numbers[i][m] + " ");
                }
                System.out.println();   // to get to the next line
            }

        }

            }

        }



/*
int [][] numbers = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

output will be 1 2 3 4
               8 7 6 5
               9 10 11 12
*/