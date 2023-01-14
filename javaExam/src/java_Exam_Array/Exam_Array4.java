package java_Exam_Array;

public class Exam_Array4 {

	public static void main(String[] args) {
		int[][] numArr = new int[4][4];
		
		for(int i=0; i<numArr.length-1; i++) {
			for(int j=0; j<numArr[i].length-1; j++) {
				 numArr[i][j] = (int)(Math.random()*10)+1;
				 numArr[i][numArr[i].length-1] += numArr[i][j];  
				 numArr[numArr.length-1][j] += numArr[i][j];  
				 numArr[numArr.length-1][numArr[i].length-1] += numArr[i][j];  
				}
			}
				
		for(int i=0; i<numArr.length; i++) {
			for(int j=0; j<numArr[i].length; j++) {				 
				System.out.printf("%3d",numArr[i][j]);
			}System.out.println();
		}
	}
}



