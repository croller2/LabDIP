/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class GUIInput implements MessageInput {

    @Override
    public final String getMessage() {
         JFrame frame = new JFrame("Input Message");
        return JOptionPane.showInputDialog(frame, "Input Message:");
    }
    
}
