package day08_practices;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 45;
        String result = "";

        String result2 = (age >=1 && age <= 2)? "infant" :(age >=3 && age <=5)? "toddler" :(age >=6 && age <=9)?
                "kid" :(age >= 10 && age <= 12)? "pre-teen" :(age >= 13 && age <= 17)? "teenager"
                :(age >= 18 && age <= 20)? "young adult" :(age >= 21 && age <= 39)? "adult"
                :(age >= 40 && age <= 49)? "young middle-aged adult" :(age >= 50 && age <=54)?
                "middle-aged adult" :(age >= 55 && age <= 64)? "very young senior citizen"
                :(age >= 65 && age <= 74)? "young senior citizen" :(age >= 75 && age <= 84)?
                "senior citizen" : "old senior citizen";
        System.out.println(result2);

    }
}
