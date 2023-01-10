package javaExam;

import java.util.Scanner;

public class ThisIsJava05_exam_09 {

	public static void main(String[] args) {
		//이것이 자바다 5장 9번 문제
		Scanner scan = new Scanner(System.in);
	
		int[] scores = new int[]{};	

		while(true) {
	
			System.out.print("--------------------------------------------------\n"
			+ "1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료\n"
			+ "--------------------------------------------------\n");
			System.out.print("선택 > ");
			int swit = scan.nextInt();
			if(swit == 5) break;
			
			switch(swit) {

			case 1:
				System.out.print("학생수> " );
				int n = scan.nextInt();
				scores = new int[n];
				break;
	
			case 2:
				for(int i=0; i<scores.length; i++) {
				System.out.print("scores[" + i + "]> " );
				int score = scan.nextInt();
				scores[i] = score;
				}
				break;
				
			case 3:	
				for(int i=0; i<scores.length; i++) {
				System.out.println("scores[" + i + "]: " + scores[i]);
				}
				break;
				
			case 4:	
				int tmp =0;
				int sum = 0;
				
				
				for(int i=0; i<scores.length; i++) {
					
					if(scores[i]>tmp) {
						tmp = scores[i];
					}
					sum += scores[i];
				}
				System.out.println("최고 점수: " + tmp);
				System.out.println("평균 점수: " + (double)sum/scores.length);
				break;
		
		
			default :
				System.out.println("잘못입력");
				break;
			}
		}
		System.out.println("프로그램 종료");
		scan.close();
	}
}

