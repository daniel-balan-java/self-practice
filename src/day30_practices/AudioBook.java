package day30_practices;

public class AudioBook extends Book{

    private int length;
    private String narrator;

    public AudioBook(String title, String type, String author, double price) {
        super(title, type, author, price);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length <= 0){
            System.err.println("Invalid length " + length);
            System.exit(1);
        }
        this.length = length;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "title='" + getTitle() + '\'' +
                ", type='" + getType() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", price=" + getPrice() +
                "length=" + length +
                ", narrator='" + narrator + '\'' +
                '}';
    }
}
/*
3 Create a sub class of Book named AudioBook:
			Extra variables:
				length, narrator

			Encapsulate all the extra fields
					Conditions:
						1. length can not be set to zero or negative

			Add a constructor that can set all the fields

			Extra Methods:
				toString()
 */