package java_BAEKJOON;

import java.util.Scanner;

public class Baekjoon_2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				int H = scan.nextInt();
				int M = scan.nextInt();
				int cooking = scan.nextInt();
				
				H = (H + cooking/60)%24;
				M = M + cooking%60;
				
				
				if(M>=60) {			
					H = H + M/60;
					M = M%60;
					if(H>23) {
						H = H%24;
						System.out.println(H+" "+M);
					}	else {
						System.out.println(H+" "+M);
					}
				}else {
					System.out.println(H+" "+M);
				}

	}

}
