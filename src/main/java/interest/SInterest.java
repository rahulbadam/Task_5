package interest;

public class SInterest {

    public static void calcInterest(Interest i) {

        i.interest = (i.principal * i.rate * i.time) / 100;
    }
}