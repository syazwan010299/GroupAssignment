
package GroupAssignment;

import java.lang.Math;
import javax.swing.JOptionPane;

public class Question1A {
    public static void main(String[] args) {
        char a = 0 ;
        while ( a == 'y'){
        String input = JOptionPane.showInputDialog(null,"Enter your 3-digit lottery number : ","Lottery",JOptionPane.QUESTION_MESSAGE);
        int lottery = 0;
        //lottery += (Math.random()*1000);//To calculate random lottery number  
        //System.out.println(lottery);
        
        int user = Integer.parseInt(input);// Take 3 numbers from user
         
        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;
        // TO check the number of digits in the user input
        int number = 0;// variables for counter to calculate the number of digits in the user input
        while ( user != 0){
            user /= 10;
            ++number;
    }//end of the while
        //To check if user input meet the requirement to use this system 
        if (number < 3){//if the number of digits less than 3 the system will ask again
            System.out.println("Error");
        }else if ( number > 3){//if the number of digits more than 3 the system will ask again to put new input
            System.out.println("Error");
        }else{
            System.out.println("Success");
        }
        
        String check = JOptionPane.showInputDialog(null,"Do You Want To Repeat\n y-YES \t n-NO","Lottery",JOptionPane.QUESTION_MESSAGE);
        
        }//end of the while
        
       }//end of the main 
}
