package javaExam;

public class Student {
	String name;
	int assigmentsScore;
	int examScore;
	
	char grade() {
		double total = this.assigmentsScore * 0.4 + this.examScore * 0.6;
		
		char grade = ' ';
		if(total>90) {
			grade = 'A';
		}else if(total>80) {
			grade = 'B';
		}else if(total>70) {
			grade = 'C';
		}else if(total>60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		return grade;
	}
	@Override
	public String toString() {
				String str = "이름: " +  this.name + "\n"; 
		str += "과제 점수: " + this.assigmentsScore + "\n"; 
		str	+= "시험 점수: " + this.examScore + "\n"; 
		str += "학점" + grade(); 
			          
		return str;
	}
}
