package com.workspace.src.observer;

import com.workspace.src.observable.StocksObservable;

public class EmailNotficationAlertObserver implements NotificationAlertObserver{

    private String emailId;
    private StocksObservable observable;

    public EmailNotficationAlertObserver(String emailId, StocksObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(emailId , "Product in stock !!!");
    }

    private void sendEmail(String emailId , String message){
        System.out.println("Email sent to : " + emailId);
    }
}
