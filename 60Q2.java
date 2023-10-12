package java_exer_kihon2.q56;

public class Main {
    public static void main(String[] args){

        Fighter figher = new Fighter();
        figher.attack();

        MagicFighter magicFighter = new MagicFighter();
        magicFighter.attack();

    }

  public class Fighter {
    String name;
    int atk;

    public Fighter() {
        name = "戦士";
        atk = 10;
    }

    public void attack(){
        System.out.println(name + "の攻撃！");
        System.out.println(" 敵に" + atk + "のダメージ");
    }
}


  public class MagicFighter extends Fighter {
    int mp;

    public MagicFighter() {
        name = "魔法戦士";
        mp = 10;
    }

    @Override
    public void attack(){
        System.out.println(name + "の魔法攻撃！");
        System.out.println(" 敵に" + (atk + mp) + "のダメージ");
    }
}

}
