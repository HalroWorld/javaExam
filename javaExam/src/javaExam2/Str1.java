package javaExam2;
import java.util.*;
public class Str1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력");
		String str = scan.nextLine();
		
		System.out.println(str.length());
	
		str = str.replace("가을", "봄");
		System.out.println(str);
		scan.close();
	}

}
