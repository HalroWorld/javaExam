package java_Exam_Array;

public class Exam_Array3_2 {

	public static void main(String[] args) {
		int[][] numArr = new int[4][4];
		
		for(int i=numArr.length-1; i>=0; i--) {
			for(int j=numArr[i].length-1; j>=0; j--) {
				numArr[i][j] = numArr[i].length*i+j+1;
		
				System.out.printf("%-3d",numArr[i][j]);
			}
			System.out.println();
	}
}
}
