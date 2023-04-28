package day08_practices;

public class BiggerNum {

    public static void main(String[] args) {

        int n1 = 3,
                n2 = 8,
                n3 = 5;

        String result = (n1 > n2 && n1 > n3)? "n1 is bigger":(n2 > n1 && n2 > n3)? "n2 is bigger"
                : "n3 is bigger";
        System.out.println(result);




    }

}
