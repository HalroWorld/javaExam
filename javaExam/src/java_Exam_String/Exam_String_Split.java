package java_Exam_String;

import java.util.Scanner;

public class Exam_String_Split {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름, 학번과 학과를 입력하세요:");
		String str = scan.next();
		
		String[] strArr = str.split("/");
		System.out.println("이름: " + strArr[0]);
		System.out.println("학번: " + strArr[1]);
		System.out.println("학과: " + strArr[2]);
	 
		System.out.print("이름을 입력하세요: ");
		String name = scan.next();
		System.out.print("생년월일(mm/dd/yy)을 입력하세요: ");
		String birth = scan.next();
		String[] birthArr = birth.split("/");
		
		System.out.println("이름: " + name);
		System.out.print("생년월일: " + birthArr[2] + "년 " + birthArr[0] + "월 " + birthArr[1] + "일");
		scan.close();
	}

}
