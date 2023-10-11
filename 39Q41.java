package java_exer_kihon2.q41;

public class Main {
    public static void main(String[] args) {

        Yusha taro = new Yusha("夕口",20,10);
        taro.displayStatus( );
        System.out.println("---");
        taro.buki = new Buki("铁の剑",10);
        taro.displayStatus( );

    }
package java_exer_kihon2.q41;

public class Buki {
    String name;
    int atk;

    public Buki(String name, int atk) {
        this.name = name;
        this.atk = atk;
    }
}
package java_exer_kihon2.q41;

public class Yusha {
    String name;
    int hp; //HP
    int atk; //攻击力
    Buki buki; //武器

    public Yusha(String name, int hp, int atk) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }

    public void displayStatus(){
        System.out.println("勇者：" + name);
        System.out.println("HP: " + hp);

        if (buki == null){//没有武器
            System.out.println("攻击力： " + atk);
        }else {//有武器
            System.out.println("攻击力： " + atk + buki.atk);
        }
    }
}


}
