package javaExam;

public class StudentDriver {

	public static void main(String[] args) {
		Student stud1 = new Student();
		Student stud2 = new Student();
		
		stud1.name = "선남";
		stud1.assigmentsScore = 91;
		stud1.examScore = 84;
		System.out.println(stud1.toString());

		stud2.name = "선녀";
		stud2.assigmentsScore = 86;
		stud2.examScore = 95;
		System.out.println(stud2.toString());
	}

}
