package create_object_practice5;

public class Main {

	public static void main(String[] args) {
		
		//变数名 area1
		Daikei d1 = new Daikei(8.0, 4.0, 10.0);
		
		//出shi
		System.out.println(d1.getArea());
		
		System.out.println("----");
		
		//変数名 area
		Circle c1 = new Circle(2.0);
				
		//呼び出す
		System.out.println(c1.getArea());
		

	}

package create_object_practice5;

public class Daikei {
	//上 边 长
	double top;
	//高
	double height;
	//下 长
	double low;
	
	
	public Daikei(double top, double height, double low) {
		this.top = top;
		this.height = height;
		this.low = low;
	}
	
	public double getArea() {
		return (top + low) * height * 1/2;
	} 
	

}


}
