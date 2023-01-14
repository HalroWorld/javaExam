package java_Exam_String;
import java.util.*;
public class Exam_String_Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력");
		String str = scan.nextLine();
		
		System.out.println(str.length());
		System.out.println(str.indexOf("어렵다"));
	  
	
		str = str.replace("어렵다", "쉽다");
		System.out.println(str);
		scan.close();
	}

}
