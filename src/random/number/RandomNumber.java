/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random.number;

/**
 *
 * @author Jarod Berger
 */
import javax.swing.JOptionPane;
public class RandomNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JOptionPane.showMessageDialog(null, "The number is " +(1+(int)(Math.random() * 10)));
    }
    
}
