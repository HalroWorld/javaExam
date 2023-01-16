package javajungsuk_ch06_21;
class MyTv{
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANEL = 100;
	final int MIN_CHANEL = 1;
	
	void turnOnOff() {
		if(isPowerOn) {
			this.isPowerOn = false;
		}else {
			this.isPowerOn = true;
		}
	}
	void volumeUp() {
		if(volume < MAX_VOLUME) {
			this.volume++;
		}
	}
	void volumeDown() {
		if(volume > MIN_VOLUME) {
			this.volume--;
		}
	}
	void channelUp() {
		this.channel++;
		if(channel == MAX_CHANEL) {
			this.channel=MIN_CHANEL;
		}
	}
	void channelDown() {
		this.channel--;
		if(channel == MIN_CHANEL) {
			this.channel=MAX_CHANEL;
		}
	}
}
public class Exercise6_21 {

	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH: " + t.channel +", VOL:" + t.volume);

		t.channelDown();
		t.volumeDown();
		System.out.println("CH: " + t.channel +", VOL:" + t.volume);
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH: " + t.channel +", VOL:" + t.volume);
	}

}
