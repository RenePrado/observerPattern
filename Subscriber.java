public class Subscriber implements SubscriberObserver {
    private String subscriberName;

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void updateNews(NewsAgency newsAgency) {
        System.out.println(subscriberName + " received the news: " + newsAgency.getLatestNews() + "\n");
    }
}
