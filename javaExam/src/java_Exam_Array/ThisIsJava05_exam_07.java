package java_Exam_Array;

public class ThisIsJava05_exam_07 {

	public static void main(String[] args) {
		//이것이 자바다 5장 7번 문제
		int[] array = {1,5,3,8,2};
		int tmp = 0;

		for(int i=0; i<array.length; i++) {
			if(tmp<array[i])
			tmp = array[i];
		}
		System.out.println(tmp);
	}

}
