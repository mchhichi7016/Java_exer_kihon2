public class Main {
    public static void main(String[] args){
        Member sei = new Member("正会員");
        SeniorMember senior = new SeniorMember();

        LimitedMember daytime = new LimitedMember("デイタイム会員",10,20);
        LimitedMember night = new LimitedMember("ナイト会員",20,9);

        System.out.println("各会員料金");
        System.out.println(sei.getName() + ":" + sei.getMonthlyFee());
        System.out.println(senior.getName() + ":" + senior.getMonthlyFee());
        System.out.println(daytime.getName() + ":" + daytime.getMonthlyFee());
        System.out.println(night.getName() + ":" + night.getMonthlyFee());

        System.out.println();

        System.out.println(sei.getName() + ":" + sei.isUseable(22));
        System.out.println(senior.getName() + ":" + senior.isUseable(22));
        System.out.println(daytime.getName() + ":" + daytime.isUseable(22));
        System.out.println(night.getName() + ":" + night.isUseable(22));


    }
public class Member {
    String name;
    int monthlyFee;

    public Member(String name) {
        this.name = name;
        monthlyFee = 8000;
    }

    public String getName() {
        return name;
    }

    public int getMonthlyFee() {
        return monthlyFee;
    }

    public boolean isUseable(int time){
        return true;
    }
}

 public class SeniorMember extends Member {
    public SeniorMember() {
        super("シニア会員");
    }

    @Override
    public int getMonthlyFee(){
        return (int) (monthlyFee * 0.7);
    }
}

  
 public class LimitedMember extends Member {
    int startTime;
    int endTime;

    public LimitedMember(String name, int startTime, int endTime) {
        super(name);
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public int getMonthlyFee(){
        return (int) (monthlyFee * 0.6);
    }

    @Override
    public boolean isUseable(int time){
        if (time > startTime || time < endTime){
            return true;
        }else {
            return false;
        }
    }
} 
}
