package groupPractices.day29;

public class Burger extends Food{

    private boolean hasMeat;


    public boolean isHasMeat() {
        return hasMeat;
    }


    public void setHasMeat(boolean hasMeat) {
        this.hasMeat = hasMeat;
    }

    public Burger(String name, String origin, String texture, String temp, char size, boolean hasMeat) {
        super(name, origin, texture, temp, size);
        setHasMeat(hasMeat);
    }

    public void isVegetarian(){
        if(hasMeat){
            System.out.println("It is not vegeteranian");
        }else{
            System.out.println("It is vegeteranian");
        }
    }


    @Override
    public String toString() {
        return super.toString() + " " +
                ", hasMeat='" + hasMeat + '\'' ;
    }




}
