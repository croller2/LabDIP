/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author chris
 */

import javax.swing.JOptionPane;

public class GUIOutput implements MessageOutput {
    
    

    @Override
    public final void displayMessage(String msg) {
        JOptionPane.showMessageDialog(null,msg);
    }
}
