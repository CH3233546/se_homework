import java.util.ArrayList;

//火锅
public abstract class Hotpot {
    String name;
    String soup;   //汤底
    ArrayList<String> toppings = new ArrayList<String>();

    void prepare() {
        System.out.println("Prepare " + name);
        System.out.println("Adding soup...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

    void boilSoup() {
        System.out.println("Boil soup for 25 minutes");
    }

    void prepareCuisine() {
        System.out.println("Prepare cuisine on menu");
    }

    void serve() {
        System.out.println("Serve variety of dishes");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(soup + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}
