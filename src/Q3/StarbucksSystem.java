package Q3;
import java.util.HashMap;

public class StarbucksSystem {
    private HashMap<Integer,Member> memberSystem;

    public StarbucksSystem(){
        memberSystem = new HashMap<Integer,Member>();
    }

    public void addMember(Member member){
        memberSystem.put(member.getId(), member);
        //key will be the id associated with this member
    }

    public int size(){
        return memberSystem.size();
    }

    public boolean couponEligible(int id){
        if(memberSystem.get(id).getNumCoffee() == 3){
            memberSystem.get(id).setNumCoffee(0);
            return true;
        }
        return false;
    }

    public void purchase(int id, String coffeeType){
        if(couponEligible(id)){
            System.out.println("You have a free drink!");
            //if coupon eligible, print out the message of having free drinks
            //doesn't have to reset the numcoffee to 0, because it's already done in couponEligible
        }
        memberSystem.get(id).setNumCoffee(memberSystem.get(id).getNumCoffee() + 1);
    }

    
}
