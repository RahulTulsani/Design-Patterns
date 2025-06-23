package org.example.OberverPattern.Observer;

import org.example.OberverPattern.Obervable.StocksObervable;

public class MobileAlertObserver implements NotificationAlertObserver{
    String mobileNumber;
    StocksObervable stocksObervable;

    public MobileAlertObserver(String mobileNumber,StocksObervable stocksObervable){
        this.stocksObervable = stocksObervable;
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void update() {
        sendMsgOnMobile(mobileNumber,"product is in stock hurry up!");
    }

    private void sendMsgOnMobile(String mobileNumber, String msg){
        System.out.println("mail sent to:" + mobileNumber);
    }
}
