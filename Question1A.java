
package GroupAssignment;

import java.lang.Math;
import javax.swing.JOptionPane;

public class Question1A {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null,"Enter your 3-digit lottery number : ","Lottery",JOptionPane.QUESTION_MESSAGE);
        int lottery = 0;
        lottery += (Math.random()*1000);//To calculate random lottery number
        System.out.println(lottery);
       }//end of the main
    
}
