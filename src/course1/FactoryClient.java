package course1;

import course1.factory.complex.AbstractFactory;
import course1.factory.complex.FactoryProducer;
import course1.factory.notification.Notification;
import course1.factory.notification.NotificationFactory;
import course1.factory.shape.Shape;
import course1.factory.shape.ShapeFactory;

public class FactoryClient {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.drawShape();

        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.getNotification("SMS");
        notification.notifyUser();

        // Abstract Factory
        AbstractFactory normalShapeFactory = FactoryProducer.getFactory(false);
        course1.factory.complex.Shape shapeAbstract = normalShapeFactory.getShape("Rectangle");
        shapeAbstract.drawShape();

        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(false);
        course1.factory.complex.Shape roundedShapeAbstract = roundedShapeFactory.getShape("Rectangle");
        roundedShapeAbstract.drawShape();
    }
}
