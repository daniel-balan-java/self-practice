package day06_practices;

public class EqualNumbers {

    public static void main(String[] args) {

        int n1 = 20,
                n2 = 20,
                n3 = 30;

        String result = "";

        if (n1 == n2 && n2 == n3){
            result = "all equal";
        }
        if (n1 == n2 && n1 != n3){
            result = "n1&n2 are equal";
        }
        if (n2 == n3 && n2 != n1){
            result = "n2&n3 are equal";
        }
        if (n3 == n1 && n3 != n2){
            result = "n3&n1 are equal";
        }
        if (n1 != n2 && n2 != n3 && n3 != n1){
            result = "none of the are equal";
        }
        System.out.println(result);

    }
}
