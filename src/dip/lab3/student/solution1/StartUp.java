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
public class StartUp {
    public static void main(String[] args) {
        
        MessageOutput msgOut = new GUIOutput();
        MessageInput msgIn = new ConsoleInput();
        
        MessageManager msgMgr = new MessageManager(msgIn,msgOut);
        
        msgMgr.sendMessage();
    }
}
