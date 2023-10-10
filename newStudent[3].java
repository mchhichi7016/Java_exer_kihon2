public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("タロウ", 80, 75, 90);
        students[1] = new Student("ハナコ", 90, 70, 80);
        students[2] = new Student("二郎", 0, 0, 0);

        System.out.println("成绩表");
        for (int i = 0; i < students.length; i++) {
            students[i].show();
        }
      public class Student {
    String name;
    int kok;
    int su;
    int ei;

    public Student(String name, int kok, int su, int ei) {
        this.name = name;
        this.kok = kok;
        this.su = su;
        this.ei = ei;
    }

    public Student(String name) {
        this(name, 0, 0, 0);
    }

    public void show(){
        System.out.println(name + ":" + kok + "," + su + "," + ei);
    }
}


    }
}
