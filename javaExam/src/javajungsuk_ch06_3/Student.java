package javajungsuk_ch06_3;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public int getTotal() {
		return (this.kor + this.eng + this.math);
	}
	public float getAverage() {
		return ((int)(((getTotal()/3f)+0.05)*10))/10f;
	}
}
