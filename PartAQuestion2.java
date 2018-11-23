/**
 * Program Name : Part A Question 2
 * Description  : 
 * @author      : Mohamad Syazwan Zulfaris bin Zainal - B04180021
 *              : Nor Fariha binti Serzali - B04180022
 * @version 2.AI
 */
package GroupAssignment;

import javax.swing.JOptionPane;//import class JOptionPane

public class PartAQuestion2 {
    public static void main(String[] args) {
        
        char y ='y';
        while ( y == 'y'){
        String input = JOptionPane.showInputDialog(null,"What is your name?","Counter",JOptionPane.QUESTION_MESSAGE);//To ask the user to key in the name
        
        char name;
        char space;
        int length = input.length();
        int c = length;
        int add = 0;
        int minus = 0;
        int counter = 0;
        int size = 0;
        int counter1 = 0;
        //To check if the character more than 3 character
        if(input.length()>3){
            //To calculate the number of character
            while ( c != 0){
              space = input.charAt(counter1);
             if ( space != ' '){
                 ++size;
             }  
             c--;
             counter1++;
            }
            //To calculate 
            while ( length != 0){
                name = input.charAt(counter);
                if ( (name == 'a')||(name == 'e')||(name == 'i')||(name == 'o')||(name == 'u')||(name == 'A')||(name == 'E')||(name == 'I')||(name == 'O')||(name == 'U')){
                    ++add;
                }else if(name != ' '){
                    ++minus;
                }
                length--;
                counter++;
            }//end of the while loop
            JOptionPane.showMessageDialog(null,"Name = "+input+"\nTotal characters = "+size+"\nVowels = "+add+"\nConsonants = "+minus,"Counter",JOptionPane.INFORMATION_MESSAGE);   
        }else{
            JOptionPane.showMessageDialog(null,"Try Again","Counter",JOptionPane.INFORMATION_MESSAGE);
        }
        String check = JOptionPane.showInputDialog(null,"Do you want to try again?\n y-YES \t n-NO","Lottery",JOptionPane.QUESTION_MESSAGE);//ask the user to repeat or not 
        y = check.charAt(0);
        }//end of the while
    }      
   
}//end of the class
