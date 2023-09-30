package course2.observer;

import course2.observer.interfaces.Observer;
import course2.observer.model.EmailTopic;
import course2.observer.model.EmailTopicSubscriber;

public class Main {
    public static void main(String[] args) {
        EmailTopic topic = new EmailTopic();

        Observer firstObserver = new EmailTopicSubscriber("First Observer");
        Observer secondObserver = new EmailTopicSubscriber("Second Observer");
        Observer thisrdObserver = new EmailTopicSubscriber("Third Observer");

        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thisrdObserver);

        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thisrdObserver.setSubject(topic);

        firstObserver.update();
        secondObserver.update();

        topic.postMessage("Hello Subscriber!");
        System.out.println("===========================");

        topic.unregister(firstObserver);

        topic.postMessage("Hello Subscriber!");
    }
}
