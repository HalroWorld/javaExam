package javaExam2;

public class Array2 {

	public static void main(String[] args) {
		
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		if(array[0][0]<array[0][1]) {
			System.out.println("앞이 더작습니다.");
		}
		
		int tmp = 0;
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
			
					sum += array[i][j];
					tmp++;
			}

		}
		System.out.println(sum);
		System.out.println((double)sum/tmp);
	}

}
