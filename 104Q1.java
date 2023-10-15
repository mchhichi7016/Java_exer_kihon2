public class Main {
    public static void main(String[] args){
        Item[] items ={
                new Buki("鉄の剣",20),
                new Armor("皮の服",10)};
        for (Item item: items) {
            item.use();
        }
    }

  public abstract class Item {
     String name;
     int value;

     public Item(String name, int value) {
          this.name = name;
          this.value = value;
     }

     public abstract void use();
}


  public class Buki extends Item {
    public Buki(String name, int value) {
        super(name, value);
    }

    @Override
    public void use(){
        System.out.println(name + "で攻撃！！");
        System.out.println("敵に" + value + "のダメージ！");
    }
}

  public class Armor extends Item {
    public Armor(String name, int value) {
        super(name, value);
    }

    @Override
    public void use(){
        System.out.println(name + "を身に着けた");
        System.out.println("守備力が" + value + "上がった");
    }
}
}
