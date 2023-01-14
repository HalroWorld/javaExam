package java_Exam_Array;

public class Exam_Array1 {

	public static void main(String[] args) {
		String[][] strArr = new String[3][3];
		
		for(int i=0; i<strArr.length; i++) {
			for(int j=0; j<strArr[i].length; j++) {
				System.out.print("("+ i + "," + j +")");
			}
			System.out.println();
		}

	}

}
