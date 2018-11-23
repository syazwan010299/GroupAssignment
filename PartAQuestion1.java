/**
 * Program Name : Part A Question 1
 * Description  : 
 * @author      : Mohamad Syazwan Zulfaris bin Zainal - B04180021
 *              : Nor Fariha binti Serzali - B04180022
 * @version 1.AI
 */
package GroupAssignment;

import java.lang.Math;//import Math Class
import javax.swing.JOptionPane;//import windows

public class PartAQuestion1 {
    public static void main(String[] args) {
        char a = 'y';//variable to loop the process until user do not want to play anymore
        while ( a == 'y'){//if the user key in y 
        String input = JOptionPane.showInputDialog(null,"Enter your 3-digit lottery number : ","Lottery",JOptionPane.QUESTION_MESSAGE);//ask the user to key in 3 number
        int user = Integer.parseInt(input);// Take 3 numbers from user
        Lot lot = new Lot();
        int lottery = lot.kira();
    
       
        int replace = user;// copy the user input into replace variable
        int temp1,temp2,temp3;//to save the first, second and third digit of the user input
        int random1,random2,random3;//to save the first, second and third digit of the random numbers
        
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
            temp3 = lot.split(replace);//use the split method to get the third digit of the user input
            replace = lot.delete(replace);//use the delete method to remove the third digit of the user input
            temp2 = lot.split(replace);//use the split method to get the second digit of the user input
            replace = lot.delete(replace);//use the delete methodto remove the second digit of the user input
            temp1 = lot.split(replace);//use the split method to get the first digit of the user input
            
            System.out.print(temp1+ " | ");
            System.out.print(temp2+ " | ");
            System.out.println(temp3);
            
            random3 = lot.split(lottery);//use the split method to get the third digit of the random number
            lottery = lot.delete(lottery);//use delete method to remove the third digit of the random numbers
            random2 = lot.split(lottery);//use the split method to get the second digit of the random number
            lottery = lot.delete(lottery);//use delete method to remove the second digit of the random numbers
            random1 = lot.split(lottery);//use the split method to get the first digit of the random number
            
            System.out.print(random1+ " | ");
            System.out.print(random2+ " | ");
            System.out.println(random3);
            
            //To check the condition to give the reward to the user
            if ((random1==temp1)&&(random2==temp2)&&(random3==temp3)){//if the user input matches the lottery in exact order,the awrd is RM5000
                JOptionPane.showMessageDialog(null,"CONGRATULATION!!\n You have won RM 5000","Lottery Reward",JOptionPane.INFORMATION_MESSAGE);
            }else if (((temp1==random1)||(temp1==random2)||(temp1==random3))&&((temp2==random1)||(temp2==random2)||(temp2==random3))&&((temp3==random1)||(temp3==random2)||(temp3==random3))){//if the user input matches three digits in different order the award is RM2000
                JOptionPane.showMessageDialog(null,"CONGRATULATION!!\n You have won RM2000","Lottery Reward",JOptionPane.INFORMATION_MESSAGE);
            }else if(((temp1==random1)||(temp1==random2)||(temp1==random3))||((temp2==random1)||(temp2==random2)||(temp2==random3))||((temp3==random1)||(temp3==random2)||(temp3==random3))){//if any 1 or 2 digits in the user input matches the lottery, the award is RM500
                JOptionPane.showMessageDialog(null,"CONGRATULATION!!\n You have won RM500","Lottery Reward",JOptionPane.INFORMATION_MESSAGE);
            }else{//if any number does not meet lottery
                JOptionPane.showMessageDialog(null,"HA HA HA You lose.","Lottery Reward",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        String check = JOptionPane.showInputDialog(null,"Do you want to try again?\n y-YES \t n-NO","Lottery",JOptionPane.QUESTION_MESSAGE);//ask the user to repeat or not 
        a = check.charAt(0);
        }//end of the while
       
       }//end of the main 
}//end of the class

    class Lot{//new class specialise for to split the numbers
       int lottery = 0;
       int c = 0;
       public int kira(){//method to calculate the random numbers
        lottery += (Math.random()*1000);//To calculate random lottery number  
        System.out.println("The random number is : " + lottery);  
        return lottery;//return the lottery value to the main class
       }
       public int split(int d){//to get single digit of the number
          c = d % 10;
          return c;
       }
       public int delete(int d){//to delete the digit in the number
           d /= 10;
           return d;
       }
    }
