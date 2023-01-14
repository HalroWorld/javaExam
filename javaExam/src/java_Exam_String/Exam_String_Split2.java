package java_Exam_String;
import java.util.*;
public class Exam_String_Split2 {

	public static void main(String[] args) {
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
