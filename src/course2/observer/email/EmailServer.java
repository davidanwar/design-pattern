package course2.observer.email;

public class EmailServer {
    public static void main(String[] args) {
        EmailTopic emailTopic = new EmailTopic();
        Subscriber subscriber1 = new Subscriber(emailTopic);
        Subscriber subscriber2 = new Subscriber(emailTopic);

        emailTopic.sendMessage("Hello World");
    }
}
