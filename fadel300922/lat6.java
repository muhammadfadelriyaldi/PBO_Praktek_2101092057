/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fadel300922;

import javax.swing.JOptionPane;

/**
 *
 * @author Muhammad Fadel R
 */
public class lat6 {
    public static void main( String[] args ){
 String name1 ="";
 @SuppressWarnings("UnusedAssignment")
 String name2;
        name2 = "";
 String name3 ="";
 
 name1 = JOptionPane.showInputDialog("Enter word 1");
 name2 = JOptionPane.showInputDialog("Enter word 2");
 name3 = JOptionPane.showInputDialog("Enter word 3");

 String msg = name1 + "\t" +  name2 + "\t" + name3;

 JOptionPane.showMessageDialog(null, msg);

 } 
}
