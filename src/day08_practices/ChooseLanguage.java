package day08_practices;

public class ChooseLanguage {

    public static void main(String[] args) {

        int selection = 6;
        String result = "";

        switch (selection){

            case 1 :
                result = "Hello, thank you for your call ";
                break;
            case 2 :
                result = "Hola, gracias para llamar";
                break;
            case 3 :
                result = "Merhaba, aradiginiz icin tesekkurler";
                break;
            case  4 :
                result = "Privet, spasibo za vash zvonok";
                break;
            case 5 :
                result = "Merci ,pour votre appel";
                break;
            default:
                result = "invalid number";

        }
        System.out.println(result);

    }
}
