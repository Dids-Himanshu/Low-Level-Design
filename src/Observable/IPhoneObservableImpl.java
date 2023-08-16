package Observable;

import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservableImpl implements StockObservable{

    public List<NotificationAlertObserver> observerList = new ArrayList<>();

    public  int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver notificationListenerObserver) {
        observerList.add(notificationListenerObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationListenerObserver) {
        observerList.remove(notificationListenerObserver);
    }

    @Override
    public void notifyObserver() {
        for(NotificationAlertObserver notificationAlertObserver:observerList)
        {
            notificationAlertObserver.update();
        }

    }

    @Override
    public void setStockCount(int newStockCount) {
        if(newStockCount==0)
            notifyObserver();
        stockCount = stockCount+newStockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;

    }
}
