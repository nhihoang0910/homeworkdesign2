package Q1;

public class App {
    public static void main(String[] args){
        ControlSystem system = new ControlSystem();
        Meteor meteor1 = new Meteor("Toff",100, 200);
        Meteor meteor2 = new Meteor("Taff", 200, 400);
        Meteor meteor3 = new Meteor("Tiff", 300, 450);
        Meteor meteor4 = new Meteor("Puff", 150, 360);
        system.addMeteor(meteor1);
        system.addMeteor(meteor2);
        system.addMeteor(meteor3);
        system.addMeteor(meteor4);
        System.out.println(system.toString());
        Superman Tony = new Superman("Tony", 350);
        Superman Mac = new Superman("Mac", 370);
        system.addSuperman(Tony);
        system.addSuperman(Mac);
        System.out.println(system.getSuperMan());
        System.out.println("These are the meteors left: " + system.toString()); //should print out the remainders
    }
}
