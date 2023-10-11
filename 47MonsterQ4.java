package java_exer_kihon2.q44;

public class Monster {
    String name;
    int hp;

    public Monster(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

public class Yusha {
    String name;
    int atk;

    public Yusha(String name, int atk) {
        this.name = name;
        this.atk = atk;
    }

    public void attack(Monster target){
        target.hp -= this.atk;
        System.out.println(target.name + "に" + this.atk);
    }
}

public class Main {
    public static void main(String[] args){
        Yusha taro = new Yusha("太郎",100);
        Monster goblin = new Monster("子プリン",30);

        taro.attack(goblin);
    }
}
}
