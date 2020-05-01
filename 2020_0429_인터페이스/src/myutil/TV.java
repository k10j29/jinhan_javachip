package myutil;

public class TV implements RemoteCon{

	boolean bOn = false;//��������
	boolean bVolumeOff = false;//���ҰŻ��³�?
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
		//Toggle��� : true<->false
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
		
		//TV���� ����
		System.out.println("--TV On--");
		System.out.printf("ä�� : %d\n", channel);
		
		if(bVolumeOff)
			System.out.println("���� : ���Ұ�");
		else
		    System.out.printf("���� : %d\n", volume);
		
		System.out.println("----------------------------");
		
	}

}









