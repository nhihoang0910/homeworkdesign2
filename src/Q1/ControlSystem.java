package Q1;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Iterator;

public class ControlSystem {
    private TreeSet<Meteor> sortedMeteors; //all meteors sorted by size
    private HashMap<String, Integer> allSupermen= new HashMap<>(); 

    public ControlSystem(){
        sortedMeteors = new TreeSet<Meteor>();
    }

    public void addMeteor(Meteor meteor){
        sortedMeteors.add(meteor);
    }

    public int sizeMeteor(){
        return sortedMeteors.size();
    }

    public void addSuperman(Superman superman){ //does this parameter make sense or should it just be String name?
        allSupermen.put(superman.getName(), superman.getHeatVisionPower());
    }

    public int sizeSuperman(){
        return allSupermen.size();
    }

    public String toString(){
        //print out the list of sorted meteors by speed
        return sortedMeteors.toString();
    }

    public String getSuperMan(){
        //print out the list of supermen that distroy meteors in the order from the treeset
        StringBuilder sb = new StringBuilder();
    
        Iterator<Meteor> iterator = sortedMeteors.iterator();
        while (iterator.hasNext()) {
            Meteor meteor = iterator.next(); //retrieve the next element
            boolean supermanFound=false;
            for(String name: allSupermen.keySet()){
                if(allSupermen.get(name) >= meteor.getDamage()){
                    iterator.remove(); //take care of removing this meteor from sortedMeteors
                    sb.append(name + " destroyed " + meteor.getName() + "\n");
                    supermanFound=true;
                    break; //go to the next iteration of while loop
                }
            }
            if(!supermanFound){
                sb.append("No superman can destroy " + meteor.getName() + "\n");
            }
        }
        return sb.toString();
    }
}
