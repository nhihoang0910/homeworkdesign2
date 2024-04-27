package Q3;

import org.junit.Test;

public class StarbucksTest {
    @Test
    public void testAddMember(){
        StarbucksSystem system = new StarbucksSystem();
        Member member1 = new Member(1, "Latte");
        Member member2 = new Member(2, "Mocha");
        system.addMember(member1);
        system.addMember(member2);
        assert system.size()==2;
        assert system.couponEligible(member1.getId())==false;
        assert system.couponEligible(member2.getId())==false;
    }
    @Test
    public void testCorrectId(){
        StarbucksSystem system = new StarbucksSystem();
        Member member1 = new Member(1, "Latte");
        Member member2 = new Member(2, "Mocha");
        system.addMember(member1);
        system.addMember(member2);
        assert member1.getId()==1;
        assert member2.getId()==2;
    }
    @Test
    public void testPurchase(){
        StarbucksSystem system = new StarbucksSystem();
        Member member1 = new Member(1, "Latte");
        Member member2 = new Member(2, "Mocha");
        system.addMember(member1);
        system.addMember(member2);
        system.purchase(member1.getId(), "Latte");  
        system.purchase(member1.getId(), "Latte");
        system.purchase(member1.getId(), "Espresso");
        assert member1.getNumCoffee()==3;
        assert member2.getNumCoffee()==0;
    }
    
    @Test
    public void testcouponEligible(){
        StarbucksSystem system = new StarbucksSystem();
        Member member1 = new Member(1, "Latte");
        Member member2 = new Member(2, "Mocha");
        system.addMember(member1);
        system.addMember(member2);
        system.purchase(member1.getId(), "Latte");  
        system.purchase(member1.getId(), "Latte");
        system.purchase(member1.getId(), "Espresso");
        assert system.couponEligible(member1.getId())==true;
        system.purchase(member1.getId(), "Espresso");
        assert member1.getNumCoffee()==1;
        assert system.couponEligible(member2.getId())==false;
    }

    @Test
    public void testGetCoffeeType(){
        Member member1 = new Member(1, "Latte");
        Member member2 = new Member(2, "Mocha");
        assert member1.getCoffeeType().equals("Latte");
        assert member2.getCoffeeType().equals("Mocha");
    }
}
