package Q3;

public class Member {
    private int id;
    private int numcoffee;
    private String coffeeType;

    public Member (int id, String coffeeType){
        this.id = id;
        this.coffeeType = coffeeType;
        this.numcoffee = 0;
    }

    //only need methods to get the coffeeType and number of purchases
    public String getCoffeeType(){
        return coffeeType;
    }

    public int getNumCoffee(){
        return numcoffee;
    }
    
    public int getId(){
        return this.id;
    }

    public int setNumCoffee(int num){ //to reset numCoffee after 3 purchases
        return this.numcoffee=num;
    }

}
