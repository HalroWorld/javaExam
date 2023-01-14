package java_Exam_Array;

public class Exam_Array2_2 {

	public static void main(String[] args) {
		int[][] numArr = new int[4][4];
		
		
		for(int i=0; i<numArr.length; i++) {
			for(int j=0; j<numArr[i].length; j++) {
				numArr[i][j] = numArr[i].length*i+j+1;
		
				System.out.printf("%-3d",numArr[i][j]);
			}
			System.out.println();
	}
}
}
