import constCost.HouseCost;
import interest.CInterest;
import interest.Interest;
import interest.SInterest;

import java.util.Scanner;
import java.util.logging.Logger;

class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

        logger.info("Choices\n");
        logger.info("1 - Interest\n");
        logger.info("2 - CostructionCost\n");
        logger.info(" Enter number of your choice ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1: {
                int principal, time;
                double rate;
                int choice2;

                logger.info("Enter principal amount\n");
                principal = sc.nextInt();

                logger.info("Enter rate of interest\n");
                rate = sc.nextDouble();

                logger.info("Enter time\n");
                time = sc.nextInt();

                logger.info("Choices\n");
                logger.info("1 - Simple Interest\n");
                logger.info("2 - Compound Interest\n");
                logger.info(" Enter number of your choice ");
                choice2 = sc.nextInt();

                switch (choice2) {
                    case 1: {
                        Interest i = new Interest(principal, rate, time);
                        SInterest.calcInterest(i);
                        i.printInterest();
                        break;
                    }

                    case 2: {
                        Interest i = new Interest(principal, rate, time);
                        CInterest.calcInterest(i);
                        i.printInterest();
                        break;
                    }

                    default: {
                        logger.info("Please Enter your choice from the above list");
                    }
                }
                break;
            }

            case 2: {
                int material;

                logger.info("Choices for material :\n");
                logger.info("1 - standard material \n");
                logger.info("2 - above standard \n");
                logger.info("3 - high standard \n");
                logger.info(" Enter number of your choice ");
                material = sc.nextInt();

                logger.info("Enter total area of house\n");
                double area = sc.nextDouble();

                logger.info("Want fully automated home ? (True/False)\n");
                Boolean option = sc.nextBoolean();

                HouseCost obj = new HouseCost(material, area, option);
                obj.calculateTotalCost();
                obj.printTotalCost();

                break;
            }

            default: {
                logger.info("Please Enter  your choice from the above list");
            }
        }
    }
}