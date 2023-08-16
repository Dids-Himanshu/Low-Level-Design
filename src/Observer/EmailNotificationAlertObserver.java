package Observer;

import Observable.StockObservable;

public class EmailNotificationAlertObserver implements NotificationAlertObserver{
    String emailId;
    StockObservable stockObservable;

    public EmailNotificationAlertObserver(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendEmail(emailId,"Hurry Up, the stock is available now");
    }

    private void sendEmail(String emailId, String s) {
        System.out.println("Email sent to"+emailId);
    }

}
