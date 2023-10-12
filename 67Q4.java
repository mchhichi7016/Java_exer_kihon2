public class Main {
    public static void main(String[] args){

        RectAngle rect = new RectAngle(8, 5);
        System.out.println(rect.getMenseki());

        Square square = new Square(10);
        System.out.println(square.getMenseki());

    }

  public class RectAngle {
    int haba;
    int takasa;

    public RectAngle() {
    }

    public RectAngle(int haba, int takasa) {
        this.haba = haba;
        this.takasa = takasa;
    }

    public int getMenseki(){
        return this.haba * this.takasa;
    }
}

 public class Square extends RectAngle {
    public Square( int ippen) {
        super(ippen, ippen);
    }
} 
}
