package main.java.player;

import main.java.items.Inventory;

import java.util.ArrayList;
import java.util.List;

public class Trader {

    private final List<String> availableSupplies;
    private int food;

    public Trader(){
        this.availableSupplies = new ArrayList<>();
    }

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
