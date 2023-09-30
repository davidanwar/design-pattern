package course2.observer.model;

import course2.observer.interfaces.Observer;
import course2.observer.interfaces.Subject;

public class EmailTopicSubscriber implements Observer {

    private String name;
    private Subject topic;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String message = (String) topic.getUpdate(this);
        if (message == null)
            System.out.println(name + " No New Message on this Topic");
        else
            System.out.println(name + " Retrieving Message " + message);
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
