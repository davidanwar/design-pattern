package course1.observer.channel;

public class NewsChannel implements Channel {
    public String news;
    NewsAgency newsAgency = new NewsAgency();
    @Override
    public void update(Object object) {
        this.newsAgency.setNews(news);
        System.out.println("Channel Updated");
    }
}
