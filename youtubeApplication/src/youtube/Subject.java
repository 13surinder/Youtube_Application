package youtube;

public interface Subject {
void addSubscriber(Subscriber subscriber);
void removeSubscriber(Subscriber subscriber);
void notifySubscribers();
}
