package java_BAEKJOON;
import java.util.Scanner;
public class Baekjoon_2884 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			int H = scan.nextInt();
			int M = scan.nextInt();
				
			if(M<45 && H==0) {
				H = 23;
				M = 60-(45-M);
				System.out.print(H + " ");	
				System.out.print(M);
			}else if(M<45 && H!=0) {
				H-=1;
				M = 60-(45-M);
				System.out.print(H + " ");	
				System.out.print(M);
			} else {
				M -= 45;
				System.out.print(H + " ");	
				System.out.print(M);
			}
	}

}
