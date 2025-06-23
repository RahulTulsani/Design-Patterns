package org.example.OberverPattern.Obervable;

import org.example.OberverPattern.Observer.NotificationAlertObserver;

public interface StocksObervable {

    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscribers();
    public void setStockCount(int newStockAdded);
    public int getStockCount();

}
