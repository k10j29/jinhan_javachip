package myutil;

public interface Channel {

	int CHANNEL_MIN = 0;
	int CHANNEL_MAX = 100;
	
	void channelUp();
	void channelDown();
	void setChannel(int channel);
	
}
