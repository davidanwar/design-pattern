package course1;

import course1.observer.BinaryObserve;
import course1.observer.HexaObserve;
import course1.observer.OctalObserve;
import course1.observer.Subject;
import course1.observer.channel.NewsAgency;
import course1.observer.channel.NewsChannel;

public class ObserveClient {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexaObserve(subject);
        new OctalObserve(subject);
        new BinaryObserve(subject);

        // Before Change
        System.out.println("Initial State 20");
        subject.setState(20);

        // After Change
        System.out.println("After Change");
        subject.setState(30);


        // // //
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();
        NewsChannel newsChannel = new NewsChannel();

        observable.addObserver(observer);
        observable.addObserver(newsChannel);

        observable.setNews("Real Madrid Wind");
    }
}
