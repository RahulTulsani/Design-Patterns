package org.example.OberverPattern;

import org.example.OberverPattern.Obervable.IphoneObervable;
import org.example.OberverPattern.Obervable.StocksObervable;
import org.example.OberverPattern.Observer.EmailAlertObserver;
import org.example.OberverPattern.Observer.MobileAlertObserver;
import org.example.OberverPattern.Observer.NotificationAlertObserver;

public class Store {

    public static void runStore(){
        StocksObervable iphoneStocksObervable = new IphoneObervable();

        NotificationAlertObserver observer1 = new EmailAlertObserver("xyz1@gmail.com",iphoneStocksObervable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("xyz2@gmail.com",iphoneStocksObervable);
        NotificationAlertObserver observer3 = new MobileAlertObserver("999999999", iphoneStocksObervable);

        iphoneStocksObervable.add(observer1);
        iphoneStocksObervable.add(observer2);
        iphoneStocksObervable.add(observer3);

        iphoneStocksObervable.setStockCount(10);
    }

}
