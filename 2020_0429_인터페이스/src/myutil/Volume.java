package myutil;

public interface Volume {
    //상수선언
	int VOLUME_MIN = 0;
	int VOLUME_MAX = 30;
	
	
	void volumeUp();
	void volumeDown();
	void volumeZero();
	
}
