package Q3;

public class App {
    public static void main(String[] args) {
        StarbucksSystem system = new StarbucksSystem();
        Member member1 = new Member(1, "Latte");
        Member member2 = new Member(2, "Mocha");
        system.addMember(member1);
        system.addMember(member2);
        System.out.println(system.couponEligible(member1.getId()));
        System.out.println(system.couponEligible(member2.getId()));
        system.purchase(member1.getId(), "Latte");  
        system.purchase(member1.getId(), "Latte");
        system.purchase(member1.getId(), "Espresso");
        system.purchase(member1.getId(), "Espresso");
        //System.out.println(system.couponEligible(member1.getId()));
        System.out.println(member1.getNumCoffee());
        System.out.println(system.couponEligible(member2.getId()));
    }
}
