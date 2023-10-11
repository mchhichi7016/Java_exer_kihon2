package java_exer_kihon2.q48;

public class Coupon {
    String name;
    double rate;

    public Coupon(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

  package java_exer_kihon2.q48;

public class Member {
    String name;
    Coupon coupon;

    public Member(String name) {
        this.name = name;
    }

    public void setCoupon(Coupon coupon){
        this.coupon = coupon;
    }

    public int useCoupon(int price){
        return (int)(price * coupon.rate);
    }


  public class Main {
    public static void main(String[] args){
        Member taro = new Member("タロウ");
        Member hanako = new Member("ハナコ");

        Coupon silver = new Coupon("シルバー",0.2);
        Coupon gold = new Coupon("ゴールド",0.5);

        taro.setCoupon(silver);
        hanako.setCoupon(gold);

        int pay = taro.useCoupon(2000);
        System.out.println(pay);

        pay = hanako.useCoupon(2000);
        System.out.println(pay);

    }

}
}

}
