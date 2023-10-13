public class Main {
    public static void main(String[] args){

        PercentageCoupon coupon1 = new PercentageCoupon(0.3);
        System.out.println(Casher.payment(5000, coupon1));

        VolumeCoupon coupon2 = new VolumeCoupon(1000);
        System.out.println(Casher.payment(5000, coupon2));

        PercentageCoupon coupon3 = new PercentageCoupon(0.5);
        System.out.println(Casher.payment(5000, coupon3));

        VolumeCoupon coupon4 = new VolumeCoupon(1500);
        System.out.println(Casher.payment(5000, coupon4));

    }

public interface Coupon {
    public int discount(int amount);
}

  public class PercentageCoupon implements Coupon {
    double rate;

    public PercentageCoupon(double rate) {
        this.rate = rate;
    }

    @Override
    public int discount(int amount){
        return (int) (amount * rate);
    }


    public class VolumeCoupon implements Coupon{
    int volume;

    public VolumeCoupon(int volume) {
        this.volume = volume;
    }

    public int discount(int amount){
        return amount - volume;
    }

      public class Casher {
    public static int payment(int amount, Coupon coupon){
        return coupon.discount(amount);
    }
}
}
}


  
  
}
