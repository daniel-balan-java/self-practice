package groupPractices.day29;

public class Food {

    private String name, origin, texture, temp;
    private char size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public Food(String name, String origin, String texture, String temp, char size) {
        setName(name);
        setOrigin(origin);
        setTexture(texture);
        setTemp(temp);
        setSize(size);
    }

    public void isCooking(){
        System.out.println(name + " is cooking");
    }

    public void eat(){
        System.out.println("I am eating " + name);
    }

    public void buy(){
        System.out.println( "I am buying" + name);
    }


    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", texture='" + texture + '\'' +
                ", temp='" + temp + '\'' +
                ", size=" + size +
                '}';
    }

}
/*
1. Parent class Food
	attributes:
		name, size, origin, texture, tempruture
	methods:
		isCooking(), eat(), buy()

	Child Classes:
		- Burger
		- Sushi
 */