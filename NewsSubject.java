public interface NewsSubject {
    public void subscribe(Subscriber subscriber);
    public void unSubscribe(Subscriber subscriber);
    public void notifySubscribers();
}
