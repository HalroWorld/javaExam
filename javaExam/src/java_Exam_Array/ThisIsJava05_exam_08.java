package java_Exam_Array;

public class ThisIsJava05_exam_08 {
	
	public static void main(String[] args) {
		// 이것이 자바다 5장 8번 문제
		int[][] array = {
			{85, 86},
			{83, 92, 96},
			{78, 83, 93, 87, 88}
			};
		int sum = 0;
		int count = 0;
		
		
		for(int i=0; i<array.length; i++) {
			for(int j = 0; j<array[i].length; j++) {
			 sum += array[i][j];
			 count ++;
			}
		}
		System.out.println(sum);
		System.out.println((double)sum/count);
	}

}
