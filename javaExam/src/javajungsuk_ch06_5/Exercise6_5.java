package javajungsuk_ch06_5;

public class Exercise6_5 {

	public static void main(String[] args) {
		Student s = new Student("홍길동",1,1,100,60,76);
		
		System.out.println(s.info());
	}

}
class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor =kor;
		this.eng = eng;
		this.math = math;
	}
	public int getTotal() {
		return (this.kor + this.eng + this.math);
	}
	public float getAverage() {
		return ((int)(((getTotal()/3f)+0.05)*10))/10f;
	}
	String info() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}
}
