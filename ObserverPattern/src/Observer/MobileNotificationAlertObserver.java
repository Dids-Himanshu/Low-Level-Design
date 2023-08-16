package Observer;

import Observable.StockObservable;

public class MobileNotificationAlertObserver implements NotificationAlertObserver{
    Integer mobileNo;
    StockObservable stockObservable;

    public MobileNotificationAlertObserver(Integer mobileNo, StockObservable stockObservable) {
        this.mobileNo = mobileNo;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMessage(mobileNo,"Hurry Up, the stock is available now");
    }

    public void sendMessage(Integer mobileNo, String message) {
        System.out.println("Email sent to"+mobileNo);

    }


}
