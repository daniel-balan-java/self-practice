package day06_practices;

public class ChooseLanguage {
    public static void main(String[] args) {

        int selection = 3;
        String result = "";

        if (selection >= 6 || selection <= 0){
            result = "Invalid selection";
        }
        if (selection == 1){
            result = "Hello, Thank you for your call";
        }
        if (selection == 2){
            result = "Hola, gracias para llamar";
        }
        if (selection == 3){
            result = "Merhab, aradiginiz icin tesekkurler";
        }
        if (selection == 4){
            result = "Privet, spasibo za vash zvonok";
        }
        if (selection == 5){
            result = "Merci, pour votre appel";
        }
        System.out.println(result);


    }
}
