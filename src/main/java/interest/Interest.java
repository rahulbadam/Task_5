package interest;

import java.util.logging.Logger;

public class Interest {

    int principal, time;
    double rate, interest;
    final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public Interest(int principal, double rate, int time) {

        this.principal = principal;
        this.rate = rate;
        this.time = time;
        this.interest = 0;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void printInterest() {
        logger.info("Interest : " + this.interest + " \n");
    }
}
