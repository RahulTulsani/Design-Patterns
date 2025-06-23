package org.example.OberverPattern.Observer;

import org.example.OberverPattern.Obervable.StocksObervable;

public class EmailAlertObserver implements NotificationAlertObserver{

    String email;
    StocksObervable stocksObervable;

    public EmailAlertObserver(String email,StocksObervable stocksObervable){
        this.stocksObervable = stocksObervable;
        this.email = email;
    }

    @Override
    public void update() {
        sendEmail(email,"product is in stock hurry up!");
    }

    private void sendEmail(String email, String msg){
        System.out.println("mail sent to:" + email);
    }
}
