package com.workspace.src;

import com.workspace.src.observable.IphoneObservableImpl;
import com.workspace.src.observable.StocksObservable;
import com.workspace.src.observer.EmailNotficationAlertObserver;
import com.workspace.src.observer.MobileNotificationAlertObserver;
import com.workspace.src.observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneStockObservable = new IphoneObservableImpl();
        NotificationAlertObserver observer1 = new EmailNotficationAlertObserver("xyz@gmail.com" , iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailNotficationAlertObserver("abc@gmail.com" , iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileNotificationAlertObserver("xyz_userName" , iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(100);
        iphoneStockObservable.setStockCount(0);
    }
}
