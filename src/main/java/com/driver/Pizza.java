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

    private boolean billGenerate;

    public Pizza(){

    }

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

        this.bill="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){

        return this.price;

    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheeseAdded){
            price=price+cheesePrice;
            cheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppingsAdded){
            price=price+toppingsPrice;
            toppingsAdded=true;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(!bagTaken){
            price=price+bagPrice;
            bagTaken=true;
        }

    }




    public String getBill(){
        // your code goes here

        if(!billGenerate) {

            if(cheeseAdded){
                bill=bill+"Extra Cheese Added: "+this.cheesePrice+"\n";
            }
            if(toppingsAdded){
                bill=bill+"Extra Toppings Added: "+this.toppingsPrice+"\n";
            }
            if(bagTaken){
                bill=bill+"Paperbag Added: "+this.bagPrice+"\n";
            }
            bill = bill + "Total Price: " + this.price + "\n";

            billGenerate = true;
        }

        return bill;
    }
}
