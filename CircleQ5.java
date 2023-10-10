public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.setHankei(8);
        System.out.println(c1.getEnsyu());
        System.out.println(c1.getMenseki());
    }
  public class Circle {
    double PI = 3.14;
    int hankei;


    public void setHankei(int hankei) {
        this.hankei = hankei;
    }

    public double getEnsyu(){
        return 2 * PI * hankei;
    }

    public double getMenseki(){
        return PI * hankei * hankei;
    }
}


}
