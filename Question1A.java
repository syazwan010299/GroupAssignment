/* Name : 1 ) Mohd Syazwan Zulfaris bin Zainal ( B04180021 )
          2 ) Nor Fariha binti Serzali ( B04180022 )
   Task : Part A Question 1 
   Date : 29/11/2018 
*/
package GroupAssignment;

import java.lang.Math;//import Math Class
import javax.swing.JOptionPane;//import windows

public class Question1A {
    public static void main(String[] args) {
        char a = 'y';//variable to loop the process until user do not want to play anymore
        while ( a == 'y'){//if the user key in y 
        String input = JOptionPane.showInputDialog(null,"Enter your 3-digit lottery number : ","Lottery",JOptionPane.QUESTION_MESSAGE);//ask the user to key in 3 number
        int lottery = 0;
        //lottery += (Math.random()*1000);//To calculate random lottery number  
        //System.out.println(lottery);
        
        int user = Integer.parseInt(input);// Take 3 numbers from user
         
        int replace = user;// copy the ser input into replace variable
        int temp1 = 0;//to save the first digit of the user input
        int temp2 = 0;//to save the second digit of the user input
        int temp3 = 0;//to save the third digit of the user input
        
        // To check the number of digits in the user input
        int number = 0;// variables for counter to calculate the number of digits in the user input
        while ( user != 0){
            user /= 10;
            ++number;
    }//end of the while
        //To check if user input meet the requirement to use this system 
        if ((number < 3)||(number > 3)){//if the number of digits less than 3 the system will ask again
            JOptionPane.showMessageDialog(null,"ERROR: Your number is not available","Lottery",JOptionPane.ERROR_MESSAGE);
        }else{
            temp3 = replace % 10;//to get the third digit of the user input
            replace /= 10;//to remove the third digit of the user input
            temp2 = replace % 10;//to get the second digit of the user input
            replace /= 10;//to remove the second digit of the user input
            temp1 = replace % 10;//to get the first digit of the user input
            System.out.println(temp1);
            System.out.println(temp2);
            System.out.println(temp3);
        }
        String check = JOptionPane.showInputDialog(null,"Do You Want To Repeat\n y-YES \t n-NO","Lottery",JOptionPane.QUESTION_MESSAGE);
        a = check.charAt(0);
        }//end of the while
       
       }//end of the main 
}
