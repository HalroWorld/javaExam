package javajungsuk_ch06_7;

class Mypoint{
	int x;
	int y;
	
	Mypoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1){
		return Math.sqrt(((x1-this.x)*(x1-this.x)) + ((y1-this.y)*(y1-this.y)));
	}
}
public class Exercise6_7 {

	public static void main(String[] args) {
		Mypoint p = new Mypoint(1,1);
		
		System.out.println(p.getDistance(2,2));

	}

}
