package java_BAEKJOON;
import java.util.Scanner;
public class Baekjoon_2480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int dice1 = scan.nextInt();
		int dice2 = scan.nextInt();
		int dice3 = scan.nextInt();
		System.out.print(dice1 + " ");
		System.out.print(dice2 + " ");
		System.out.print(dice3 + "\n");
		
		
		if(dice1== dice2 && dice2 == dice3) {
			System.out.println(10_000+(dice1*1_000));
		}else if(dice1 == dice2 || dice2 == dice3) {
			System.out.println(1_000+(dice2*100));
		}else if(dice1 == dice3) {
			System.out.println(1_000+(dice3*100));
		}else{
			if(dice1 > dice2 && dice1 > dice3) {
				System.out.println(dice1*100);
			}else if(dice2 > dice1 && dice2 > dice3) {
				System.out.println(dice2*100);
			}else if(dice3 > dice2 && dice3 > dice1) {
				System.out.println(dice3*100);
			}
	}
	}
}
