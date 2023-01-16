package javajungsuk_ch06_1;

public class SutdaCard {
	int num;
	boolean isKwang;

public SutdaCard(int num, boolean isKwang) {
	this.num = num;
	this.isKwang = isKwang;
}
public SutdaCard() {
	num = 1;
	isKwang = true;
}
String info(){
	if(this.isKwang) return this.num + "K";
	else return num + "";
}
}
