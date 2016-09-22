package dip.lab2.student.solution1;


public class FoodServiceTipCalculator implements TipCalculator {
    private static final double MIN_BILL = 0.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;
    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;
    private int bagCount;
    private double bill;
    private double baseTipPerBag;
    private ServiceQuality serviceQuality;
    
    
    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }
    
    public final ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public final void setServiceQuality(ServiceQuality q) {
        this.serviceQuality = q;
    }

    public final int getBagCount() {
        return bagCount;
    }

    public final double getBaseTipPerBag() {
        return baseTipPerBag;
    }


    public final void setBagCount(int bagCount) {
        this.bagCount = bagCount;
    }


    public final void setBaseTipPerBag(double baseTipPerBag) {
        this.baseTipPerBag = baseTipPerBag;
    }

    
    @Override
    public final void setGoodRate(double goodRate) {
        this.goodRate = goodRate;
    }

    @Override
    public final double getGoodRate() {
        return goodRate;
    }

    @Override
    public final void setFairRate(double fairRate) {
        this.fairRate = fairRate;
    }


    @Override
    public final double getFairRate() {
        return fairRate;
    }

    @Override
    public final void setPoorRate(double poorRate) {
        this.poorRate = poorRate;
    }

    @Override
    public final double getPoorRate() {
        return poorRate;
    }

    @Override
    public final double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * goodRate;
                break;
            case FAIR:
                tip = bill * fairRate;
                break;
            case POOR:
                tip = bill * poorRate;
                break;
        }

        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

}
