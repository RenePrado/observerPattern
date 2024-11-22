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
        newsAgency.setLatestNews("Tesla has officially landed in Taguig Philippines!");
        newsAgency.setSubscriberList(subscriberList);

        System.out.println("Breaking News!");
        System.out.println(newsAgency.notifySubscribers());

        newsAgency.unSubscribe(angelo);

        Subscriber adam = new Subscriber();
        adam.setSubscriberName("Adam");
        newsAgency.subscribe(adam);

        newsAgency.setLatestNews("Manila declares class suspension!");
        System.out.println("Latest Updates!");
        System.out.println(newsAgency.notifySubscribers());
    }
}
