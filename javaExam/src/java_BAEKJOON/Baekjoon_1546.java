package java_BAEKJOON;

import java.util.Scanner;

public class Baekjoon_1546 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		double[] score = new double[N];
		for(int i=0; i<score.length; i++) {
			score[i] = scan.nextDouble();
		}
		double max = score[0];
		scan.close();
		
		for(int i=0; i<score.length; i++) {
			if(max<score[i]) {
				max = score[i];
			}
		}
		double sum =0;
		for(int i=0; i<score.length; i++) {
			score[i] = (score[i]/max)	* 100;
			sum += score[i];
		}
		System.out.println(sum/score.length);
	}
}

