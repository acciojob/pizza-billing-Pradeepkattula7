package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheesePrice;

    private  int toppingsPrice;

    private int bagPrice;

    private boolean cheeseAdded;
    private boolean toppingsAdded;
    private boolean bagTaken;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here

        if(isVeg){
            this.price=300;
            this.toppingsPrice=70;
        }
        else{
            this.price=400;
            this.toppingsPrice=120;
        }
        this.cheesePrice=80;
        this.bagPrice=20;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(cheeseAdded==false){
            price=price+cheesePrice;
            cheeseAdded=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(toppingsAdded==false){
            price=price+toppingsPrice;
            toppingsAdded=true;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(bagTaken==false){
            price=price+bagPrice;
            bagTaken=true;
        }

    }

    public String getBill(){
        // your code goes here
        this.bill=price+"";
        return this.bill;
    }
}
