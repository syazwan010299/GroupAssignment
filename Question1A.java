
package GroupAssignment;

import java.lang.Math;
import javax.swing.JOptionPane;

public class Question1A {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null,"Enter your 3-digit lottery number : ","Lottery",JOptionPane.QUESTION_MESSAGE);
        int lottery = 0;
        lottery += (Math.random()*1000);//To calculate random lottery number
        System.out.println(lottery);
        
        int user = Integer.parseInt(input);
        
        int [] a = new int [3];//make array to save the elements 
        int temp = 0;
        
            while ( user > 0){
                temp = (user % 10);
                
                
                
                user /= 10;
            }

        
        
        
        
        
       }//end of the main
    
}
