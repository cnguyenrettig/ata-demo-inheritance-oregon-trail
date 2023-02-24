package main.java.abilities;

import main.java.items.Inventory;

public interface Trading {

    //abstract method - must implement
    String trade(int food);


    //provided functions - can be static or default
    static Inventory getInventoryItem(){
        return Inventory.getRandomItem();
    }


}
