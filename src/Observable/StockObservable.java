package Observable;

import Observer.NotificationAlertObserver;

import javax.management.Notification;
import javax.management.NotificationListener;

public interface StockObservable {
    public void add(NotificationAlertObserver notificationListenerObserver);
    public void remove(NotificationAlertObserver notificationListenerObserver);

    public void notifyObserver();

    public void setStockCount(int newStockCount);

    public int getStockCount();

}
