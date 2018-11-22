
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
        int i = 0;
            while ( user > 0){
                temp = (user % 10);
           
                for (; i < 3;){
                    a[i] = temp;
                   // System.out.println(temp);
                    i+=1;
                }
                user /= 10;
            }
            for ( int j = 0;j < a.length;j++){
                System.out.print(a[j] + " ");
            }

        
        
        
        
        
       }//end of the main
    
}
