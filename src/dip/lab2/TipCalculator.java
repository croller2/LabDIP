/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author chris
 */
public interface TipCalculator {

    public enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    public abstract int getBagCount();

    public abstract double getBaseTipPerBag();

    public abstract double getTip();

    public abstract void setBagCount(int bagCount);

    public abstract void setBaseTipPerBag(double baseTipPerBag);
    
    public abstract ServiceQuality getServiceQuality();

    public abstract void setServiceRating(ServiceQuality q);
    
    public abstract void setGoodRate();
    
    public abstract double getGoodRate();
    
    public abstract void setFairRate();
    
    public abstract double getFairRate();
    
    public abstract void setPoorRate();
    
    public abstract double getPoorRate();
    
}
