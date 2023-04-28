package groupPractices.day29;

public class TestFoodObjects {
    public static void main(String[] args) {

        Food food = new Food("Pizza", "Italy", "crusty", "hot", 'L');
        System.out.println(food);

        food.buy();
        food.buy();
        food.eat();
        food.isCooking();
        food.setName("Pasta");
        System.out.println(food);

        food.setOrigin("");
        System.out.println(food);

        Burger burger = new Burger("Double Cheese Burger", "America", "juicy", "hot", 'M', true);
        System.out.println(burger);

        burger.isVegetarian();

        Sushi sushi = new Sushi("California", "Japan", "soft", "cold", 'S', false, 6);
        System.out.println(sushi);

        sushi.order();
    }
}
