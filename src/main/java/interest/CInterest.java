package interest;

public class CInterest {

    public static void calcInterest(Interest i) {

        double amt = i.principal * Math.pow(1 + (i.rate / 100), i.time);
        i.interest = amt - i.principal;
    }
}