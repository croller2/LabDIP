/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author chris
 */
public class TipCalculatorManager {
    private TipCalculator tipCal;

    public TipCalculatorManager(TipCalculator tipCal) {
        this.tipCal = tipCal;
    }

    public final TipCalculator getTipCal() {
        return tipCal;
    }

    public final void setTipCal(TipCalculator tipCal) {
        this.tipCal = tipCal;
    }
    
    public final double getTip(){
        return tipCal.getTip();
    }
}
