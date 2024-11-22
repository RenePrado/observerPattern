import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsSubject {

    private String latestNews;
    private List<Subscriber> subscriberList = new ArrayList<>();

    public String getLatestNews() {
        return latestNews;
    }

    public void setLatestNews(String latestNews) {
        this.latestNews = latestNews;
    }

    public List<Subscriber> getSubscriberList() {
        return subscriberList;
    }

    public void setSubscriberList(List<Subscriber> subscriberList) {
        this.subscriberList = subscriberList;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unSubscribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public String notifySubscribers() {
        String notifications = new String();
        for (Subscriber subscriber : subscriberList) {
            notifications += subscriber.getSubscriberName() + " received news" + "!\n";
            notifications += "Breaking News: " + (latestNews) + "\n\n";
        }
        return notifications;
    }
}
