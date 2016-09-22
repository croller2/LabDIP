package dip.lab2.student.solution1;

public class BaggageServiceTipCalculator implements TipCalculator {
   
    
    private double minBill = 0.00;
    private double  maxBill = 100.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be between";
    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;

    private double baseTipPerBag;
    private int bagCount;

    private ServiceQuality serviceQuality;
    
    public final ServiceQuality getServiceQuality() {
        return serviceQuality;
    }  
    
    public BaggageServiceTipCalculator(ServiceQuality q, int bags) {
        this.setServiceQuality(q); // perform validation
        this.setBagCount(bags);

        baseTipPerBag = 1.00; // set default value
    }

    public double getMinBill() {
        return minBill;
    }

    public void setMinBill(double minBill) {
        this.minBill = minBill;
    }

    public double getMaxBill() {
        return maxBill;
    }

    public void setMaxBill(double maxBill) {
        this.maxBill = maxBill;
    }

    public final void setServiceQuality(ServiceQuality q) {
        this.serviceQuality = q;
    }
    
    public final void setGoodRate(double goodRate) {
        this.goodRate = goodRate;
    }

    public final double getGoodRate() {
        return goodRate;
    }


    public final void setFairRate(double fairRate) {
        this.fairRate = fairRate;
    }

    public final double getFairRate() {
        return fairRate;
    }


    public final void setPoorRate(double poorRate) {
        this.poorRate = poorRate;
    }


    public final double getPoorRate() {
        return poorRate;
    }

    @Override
    public final double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + goodRate);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + fairRate);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + poorRate);
                break;
        }

        return tip;
    }
    
    public final int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public final double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public final void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

}
