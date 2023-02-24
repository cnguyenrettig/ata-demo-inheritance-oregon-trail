package main.java.player;

public class Traveller {
    private final static int MAX_HEALTH = 10;
    private final static int DAILY_RATION = 1;

    private String name;
    private int food;
    private int health;

    //constructor
    public Traveller(String name){
        this.name = name;
        this.health = MAX_HEALTH;
        this.food = 0;
    }


    //methods - subclasses inherit
    public void hunt(){
       this.food +=1;
    }

    public void eat(){
        if(this.food >= DAILY_RATION){
            this.food-= DAILY_RATION;
        }
        else{
            this.food=0;
        }
    }

    public String getName() {
        return name;
    }

    public int getFood() {
        return food;
    }

    public int getHealth() {
        return health;
    }
}
