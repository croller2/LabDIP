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
public class MessageManager {
    
    private MessageOutput msgOut;
    private MessageInput msgIn;
    
    public MessageManager(MessageInput msgIn, MessageOutput msgOut){
        this.msgIn = msgIn;
        this.msgOut = msgOut;
    }
    
    
    public final void sendMessage(){
        this.msgOut.displayMessage(this.msgIn.getMessage());
        
    }
}
