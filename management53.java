package java_exer_kihon2.q52;

public class Employee {
    String name;

    void operation(){
        System.out.println(this.name + "は通常業務を行います。");
    }


public class Manager extends Employee {
    void management(){
        System.out.println(this.name + "は通常業務を行います。");
    }
}


public class Main {
    public static void main(String[] args){
        Employee taro = new Employee();
        taro.name = "タロウ";

        Manager hanako = new Manager();
        hanako.name = "ハナコ";

        taro.operation();
        hanako.operation();
        hanako.management();
    }

}

}
