package javaExam2;
import java.util.*;
public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("과일 입력");
		String f = scan.nextLine();
		String[] arrF = f.split(" ");
		
		
		for(int i=0; i<arrF.length; i++) {
			System.out.print(arrF[arrF.length-(i+1)]+" ");
			
		}
		scan.close();
		
	}

}
