package javaExam2;

public class Array {

	public static void main(String[] args) {
	  int[] array = {2,5,3,8,1};
	  int tmp = array[0];
	  for(int i=0; i<array.length; i++) {
		  
		  if(array[i]<tmp) {
			  tmp = array[i];
		  }
		  
	  }
	  System.out.println(tmp);
	}

}
