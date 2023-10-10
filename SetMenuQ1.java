public class Main {
    public static void main(String[] args) {
        Menu sandwitch = new Menu("ハンバーガー", 150);
        Menu drink = new Menu("オレンジジュース", 100);

        SetMenu burgerset = new SetMenu("ハンバーガーセット", sandwitch, drink);

        burgerset.display();
    }
public class Menu {
    String name;
    int price;

    public Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void display(){
        System.out.println(name + ": " + price + "円");
    }

}
public class SetMenu {
    String name;
    Menu sandwitch;
    Menu drink;

    public SetMenu(String name, Menu sandwitch, Menu drink) {
        this.name = name;
        this.sandwitch = sandwitch;
        this.drink = drink;
    }

    public void display(){
        System.out.println(this.name);
        System.out.println("---");
        sandwitch.display();
        drink.display();
        System.out.println("---");

        int price = (int) ((sandwitch.price + drink.price) * 0.8);
        System.out.println("セット価格: " + price + "円");
    }
}


}
