package constCost;
import java.util.logging.Logger;

public class HouseCost {
    int mMaterial;
    double mArea;
    boolean mFullyAutomated;
    double mCost;

    private static final int mSMCost = 1200;
    private static final int mMediumSMCost = 1500;
    private static final int mHighSMCost = 1800;
    private static final int mACost = 700;
    final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public HouseCost(int mMaterial, double mArea, Boolean option) {
        this.mMaterial = mMaterial;
        this.mArea = mArea;
        this.mFullyAutomated = option;
    }

    public void calculateTotalCost() {
        if (this.mArea == 0)
            throw new RuntimeException();


        switch (this.mMaterial) {
            case 1: {
                if (mFullyAutomated)
                    this.mCost = this.mArea * (mSMCost + mACost);
                else
                    this.mCost = this.mArea * mSMCost;

                break;
            }

            case 2: {
                if (mFullyAutomated)
                    this.mCost = this.mArea * (mMediumSMCost + mACost);
                else
                    this.mCost = this.mArea * mMediumSMCost;

                break;
            }


            case 3: {
                if (this.mFullyAutomated)
                    mCost = this.mArea * (mHighSMCost + mACost);
                else
                    mCost = this.mArea * mHighSMCost;

                break;
            }

            default: {
                logger.info("wrong choice ...");
            }
        }
    }

    public void printTotalCost() {

        logger.info("Total cost of construction : " + this.mCost + " \n");
    }
}