public class Main {
    public static void main(String[] args){
        Circle circle = new Circle(10);
        System.out.println("半径10ＣＭの円の面積は" + circle.getArea() + "㎠です。");

        Cylinder cylinder = new Cylinder(8,8);
        System.out.println("半径8ＣＭの円の面積は" + cylinder.getArea() + "㎠です。");
        System.out.println("半径8ＣＭ、高さ8ＣＭの円柱の体積は" + cylinder.getVolume() + "立方㎠です。");

    }

public class Circle {
    double PI = 3.14;
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }
}

public class Cylinder extends Circle {
    int height;

    public Cylinder(int radius, int height) {
        super(radius);
        this.height = height;
    }

    public double getVolume(){
        return super.getArea() * height;
    }
}  
  
}
