package com.workspace.src.observer;

import com.workspace.src.observable.StocksObservable;

public class MobileNotificationAlertObserver implements NotificationAlertObserver{

    private String userName;
    private StocksObservable observable;

    public MobileNotificationAlertObserver(String userName, StocksObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(userName , "Product in stock !!!");
    }

    private void sendEmail(String emailId , String message){
        System.out.println("Message sent to : " + emailId);
    }
}
