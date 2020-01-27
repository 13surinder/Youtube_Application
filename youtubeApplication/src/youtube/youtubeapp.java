package youtube;

public class youtubeapp {
public static void main(String[] args)
{
	Channel channel=new Channel("Time and Taste");
	Subscriber subscriber1=new Subscriber("aaa");
	Subscriber subscriber2=new Subscriber("bbb");
	Subscriber subscriber3=new Subscriber("bbb");
	channel.addSubscriber(subscriber1);
	channel.addSubscriber(subscriber2);
	channel.addSubscriber(subscriber3);
	
	Video video=new Video("How to prepare Tea","Ajay");
	channel.setVideo(video);
	channel.notifySubscribers();
}
}
