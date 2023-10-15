public class Main {
    public static void main(String[] args){
        Cooler cooler = new Cooler(28);
        AirConditioner airConditioner = new AirConditioner(28);

        cooler.setGoalTemp(27);
        cooler.adjust();
        cooler.adjust();

        airConditioner.setGoalTemp(27);
        airConditioner.adjust();
        airConditioner.setGoalTemp(28);
        airConditioner.adjust();
        airConditioner.adjust();

    }

  public class Cooler {
    protected int nowTemp;
    protected int goalTemp;

    public Cooler(int nowTemp) {
        this.nowTemp = nowTemp;
    }

    public void setGoalTemp(int goalTemp) {
        this.goalTemp = goalTemp;
    }

    public void adjust(){
        if (nowTemp > goalTemp){
            nowTemp--;
            System.out.println("室温を1度下げました。");
        }else {
            System.out.println("適温です。");
        }
    }
}
public class AirConditioner extends Cooler {
    public AirConditioner(int nowTemp) {
        super(nowTemp);
    }

    @Override
    public void adjust(){
        if (nowTemp < goalTemp){
            nowTemp++;
            System.out.println("室温を1度上げました。");
        }
        else {
            System.out.println("適温です。");
        }
    }
}
  
}
