package course2.observer.email;

public class Subscriber implements Observer {
    private EmailTopic emailTopic;

    public Subscriber(EmailTopic emailTopic) {
        this.emailTopic = emailTopic;
        emailTopic.register(this);
    }

    @Override
    public void update() {
        String message = emailTopic.getMessage();
        System.out.println("New Message " + message);
    }
}
