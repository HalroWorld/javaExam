package javaExam2;

import java.util.Scanner;

public class Str2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력");
		String str = scan.nextLine();
		
		String arrStr[] = str.split("/");
	
		System.out.println("이름: " + arrStr[0]);
		System.out.println("학번: " + arrStr[1]);
		System.out.println("학과: " + arrStr[2]);
		
		System.out.print("입력");
		String str2 = scan.next();
		
		System.out.print("생년");
		String str3 = scan.next();
		String arrStr2[] = str3.split("/");
		System.out.println("이름: " + str2);
		System.out.println("생년월일: " + arrStr2[2] + "년" + arrStr2[0]+"월" + arrStr2[1] + "일" );
		
		scan.close();
	}

}
