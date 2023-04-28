package groupPractices.day29;

public class Sushi extends Food{

    private boolean hasRawFish;
    private int numberOfPieces;

    public Sushi(String name, String origin, String texture, String temp, char size, boolean hasRawFish, int numberOfPieces) {
        super(name, origin, texture, temp, size);
        setHasRawFish(hasRawFish);
        setNumberOfPieces(numberOfPieces);
    }

    public boolean isHasRawFish() {
        return hasRawFish;
    }

    public void setHasRawFish(boolean hasRawFish) {
        this.hasRawFish = hasRawFish;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }

    public void setNumberOfPieces(int numberOfPieces) {
        if (numberOfPieces<0){
            System.err.println("Invalid number of pieces!");
            System.exit(1);
        }
        this.numberOfPieces = numberOfPieces;
    }

    public void order(){
        System.out.println("I'm ordering "+getName());
    }


    @Override
    public String toString() {
        return super.toString()+
                ", hasRawFish='" + isHasRawFish() + '\'' +
                ", numberOfPieces='" + getNumberOfPieces() + '\'' ;
    }
}