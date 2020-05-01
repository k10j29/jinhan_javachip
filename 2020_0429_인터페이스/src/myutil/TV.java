package myutil;

public class TV implements RemoteCon{

	boolean bOn = false;//꺼진상태
	boolean bVolumeOff = false;//음소거상태냐?
	int volume  = 10;
	int channel = 1;
	
	
	
	
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		volume++;
		if(volume > Volume.VOLUME_MAX)
			volume = Volume.VOLUME_MAX;
		display();
			
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		volume--;
		if(volume < Volume.VOLUME_MIN)
			volume = VOLUME_MIN;
		
		display();
	}

	@Override
	public void volumeZero() {
		// TODO Auto-generated method stub
		bVolumeOff = !bVolumeOff;
		display();
		
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		channel++;
		if(channel > Channel.CHANNEL_MAX)
			channel = Channel.CHANNEL_MIN;
		
		display();
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		channel--;
		if(channel < Channel.CHANNEL_MIN)
			channel = Channel.CHANNEL_MAX;
		
		display();
	}

	@Override
	public void setChannel(int channel) {
		// TODO Auto-generated method stub
		this.channel = channel;
		
		display();
	}

	@Override
	public void onOff() {
		// TODO Auto-generated method stub
		//Toggle방식 : true<->false
		bOn = !bOn;
		display();
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		if(bOn==false) {
			System.out.println("--TV Off--");
			System.out.println("----------------------------");
			return;
		}
		
		//TV켜진 상태
		System.out.println("--TV On--");
		System.out.printf("채널 : %d\n", channel);
		
		if(bVolumeOff)
			System.out.println("볼륨 : 음소거");
		else
		    System.out.printf("볼륨 : %d\n", volume);
		
		System.out.println("----------------------------");
		
	}

}









