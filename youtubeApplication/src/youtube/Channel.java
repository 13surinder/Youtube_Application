package youtube;
import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public List<Subscriber> getSubscriberlist() {
		return subscriberlist;
	}

	public void setSubscriberlist(List<Subscriber> subscriberlist) {
		this.subscriberlist = subscriberlist;
	}


	private String channelName;
	private Video video;
	private List<Subscriber> subscriberlist;
	

	public void addSubscriber(Subscriber subscriber) {
		// TODO Auto-generated method stub
		this.subscriberlist.add(subscriber);
	}
	public Channel(String channelName) {
		super();
		this.channelName = channelName;
		this.subscriberlist=new ArrayList<>();
	}
	@Override
	public void removeSubscriber(Subscriber subscriber) {
		// TODO Auto-generated method stub
		this.subscriberlist.remove(subscriber);
	}

	@Override
	public void notifySubscribers() {
		this.subscriberlist.
		forEach(subscriber->subscriber.update(video));
		// TODO Auto-generated method stub

	}

}
