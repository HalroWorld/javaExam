package java_Exam_Array;

public class Exam_Array3_1 {

	public static void main(String[] args) {
		int[][] numArr = new int[4][4];
		int count = 0;
		
		for(int i=0; i<numArr.length; i++) {
			for(int j=0; j<numArr[i].length; j++) {
				count++; 
			}
		}
		
		for(int i=0; i<numArr.length; i++) {
			for(int j=0; j<numArr[i].length; j++) {
				numArr[i][j] = count;
				count--; 
				System.out.printf("%-3d",numArr[i][j]);
			}
			System.out.println();
	}
}
}
