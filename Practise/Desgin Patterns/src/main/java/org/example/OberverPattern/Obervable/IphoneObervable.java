package org.example.OberverPattern.Obervable;

import org.example.OberverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObervable implements StocksObervable{

    public List<NotificationAlertObserver> oberverList;
    public int stockCount = 0;

    public IphoneObervable(){
        this.oberverList = new ArrayList<>();
    }

    @Override
    public void add(NotificationAlertObserver observer) {
        oberverList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        oberverList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer : oberverList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount == 0)
            notifySubscribers();
        stockCount = stockCount + newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
