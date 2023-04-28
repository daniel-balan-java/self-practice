package day17_practices;

public class CarObject {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("BMW","M2-Competition","Long Beach Blue Metallic",2022,480);

        System.out.println(car1);

        Car car2 = new Car();
        car2.setInfo("Toyota","GR-86","Trueno Blue",2022,228);

        System.out.println(car2);

        Car car3 = new Car();
        car3.setInfo("Dodge","Charger-SRT Hellcat","Pitch Black",2022,717);

        System.out.println(car3);

        car1.drive();
        car3.stop();




    }

}
