import java.util.ArrayList;
import java.util.List;

public class NewsSubscriptionSystem {
    public static void main(String[] args) {

        Subscriber rene = new Subscriber();
        rene.setSubscriberName("Rene");

        Subscriber angelo = new Subscriber();
        angelo.setSubscriberName("Angelo");

        Subscriber prado = new Subscriber();
        prado.setSubscriberName("Prado");

        List<Subscriber> subscriberList = new ArrayList<>();
        subscriberList.add(rene);
        subscriberList.add(angelo);
        subscriberList.add(prado);

        NewsAgency newsAgency = new NewsAgency();
        newsAgency.setSubscriberList(subscriberList);

        newsAgency.setLatestNews("Tesla has officially landed in Taguig Philippines");
        System.out.println("Breaking News!");
        System.out.println(newsAgency.notifySubscribers());

        newsAgency.unSubscribe(rene);

        newsAgency.setLatestNews("Gilas Pilipinas defeat New Zealand for the first time in eight years");
        System.out.println("Just in!");
        System.out.println(newsAgency.notifySubscribers());

        Subscriber adam = new Subscriber();
        adam.setSubscriberName("Adam");
        newsAgency.subscribe(adam);

        newsAgency.setLatestNews("Manila declares class suspension");
        System.out.println("Update!");
        System.out.println(newsAgency.notifySubscribers());
    }
}
