public class Main {
    public static void main(String[] args) {
        Item i1 = new Item("coffee",120);
        Item i2 = new Item("orangejuice",150);

        i1.display();
        i2.display();
    }

public class Item {
    String name;
    int price;


    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void display(){
        System.out.println(name + ":" + price + "円");
    }
}

}
