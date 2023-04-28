package day04_practices;

public class Square {

    public static void main(String[] args) {

        int side = 5,
                area = side * side,
                perimeter = area - side;

        System.out.println("Area of the square is " + area);
        System.out.println("Perimeter of the square is " + perimeter);

    }
}
