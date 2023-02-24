package main.java.player;

import main.java.items.Inventory;

public class Trader {


    private int food;

    public String trade(int barterFood){
        //enough food left to trade
        if(this.food >= barterFood){
            this.food -= barterFood;

            return Inventory.getRandomItem().name();
        }

        //no trade if not enough food left
        return "";

    }


}
