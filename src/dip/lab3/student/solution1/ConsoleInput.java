/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Scanner;


public class ConsoleInput implements MessageInput{

    @Override
    public final String getMessage() {
        System.out.println("Enter your message then hit enter: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    
   
}
