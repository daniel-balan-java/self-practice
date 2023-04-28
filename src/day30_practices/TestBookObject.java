package day30_practices;

public class TestBookObject {
    public static void main(String[] args) {

      EBook eBook = new EBook("A Tale of Two Cities", "Electronic Book", "Charles Dickens", 79);
        System.out.println(eBook);
        eBook.readBook();
        AudioBook audioBook = new AudioBook("Carla is Here", "Audio Book", "James Cvartz", 34);
        System.out.println(audioBook);


    }
}
