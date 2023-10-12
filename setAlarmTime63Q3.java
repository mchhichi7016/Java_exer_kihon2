package java_exer_kihon2.q61;

public class Clock {
    String time;

    Clock(String time) {
        this.time = time;
    }

    void showTime(){
        System.out.println(this.time + "です。");
    }

public class AlarmClock extends Clock {
    String alarmTime;

    AlarmClock(String time) {
        super(time);
    }


    void alarm(){
        if (time.equals(alarmTime)){
            System.out.println("アラームがなりました。");
        }
    }

    void setAlarmTime(String alarmTime) {
        this.alarmTime = time;
    }


  public class Main {
    public static void main(String[] args){
        Clock clock = new Clock("10:30");
        clock.showTime();

        AlarmClock alarmClock = new AlarmClock("14:30");
        alarmClock.showTime();

        alarmClock.setAlarmTime("14:00");
        alarmClock.alarm();

        alarmClock.setAlarmTime("14:00");
        alarmClock.alarm();

    }
}
}
