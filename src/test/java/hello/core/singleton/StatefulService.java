package hello.core.singleton;

public class StatefulService {

    private int price; //stateful field

    public void order(String name, int price) {
        System.out.println("name = " + name + " price = "+ price);
        this.price = price; // here is the problem
    }

    public int getPrice() {
        return price;
    }
}
