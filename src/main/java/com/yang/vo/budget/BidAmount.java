package com.yang.vo.budget;

/**
 * Created with IntelliJ IDEA.
 * User: Jingyi.Yang
 * Date: 2016/8/11
 **/
public class BidAmount {
    private double amount;

    private String currency;

    public void setAmount(double amount){
        this.amount = amount;
    }
    public double getAmount(){
        return this.amount;
    }
    public void setCurrency(String currency){
        this.currency = currency;
    }
    public String getCurrency(){
        return this.currency;
    }
}
