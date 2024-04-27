package Q1;

public class Meteor implements Comparable<Meteor> {
    private String name;
    private int speed;
    private int damage;

    public Meteor(String name, int speed, int damage) {
        this.name = name;
        this.speed = speed;
        this.damage = damage;
    }
    public String getName() {
        return name;
    }   

    public int getSpeed() {
        return speed;
    }

    public int getDamage() {
        return damage;
    }

    public String toString(){
        return String.format("Meteor: %s\n Speed: %d \n Damage: %d\n", name, speed, damage);
    }

    @Override
    public int compareTo(Meteor m) {
        return m.speed - this.speed; //the meteor with higher speed should come first
    }
}
