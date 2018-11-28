/**
 * Program Name : Alphabets Counter - Part A Question 2
 * @author      : Mohamad Syazwan Zulfaris bin Zainal - B04180021
 *              : Nor Fariha binti Serzali - B04180022
 * @version 2.AI
 */
package GroupAssignment;

import javax.swing.JOptionPane;//import class JOptionPane

public class PartAQuestion2 {
    public static void main(String[] args) {
        
        char y ='y';//declare variable for repeat option
        while ( y == 'y'){//loop to play again
          int check1 = 0;
         while ( check1 == 0){//loop to ask input again
        String input = JOptionPane.showInputDialog(null,"What is your name?","Alphabets Counter",JOptionPane.QUESTION_MESSAGE);//To ask the user to key in the name
        
        char name;//to assign every single word in the user input
        char space;//to assign every single word in the user input
        int length = input.length();//assign the length of input into length variable
        int c = length;//assign the length of input into c variable
        check1 = length;//assign the length of input into check1 variable
        int add = 0;//variable for the number of vowel
        int minus = 0;//variable for the number of consonant
        int counter = 0;//declare counter to access every single word
        int size = 0;//to calculate the number of character
        int counter1 = 0;
        //To check if the character more than 3 characters
        if(input.length()>=3){
            //To calculate the number of character
            while ( c != 0){
              space = input.charAt(counter1);
             if ( space != ' '){//counter is exclude space character
                 ++size;
             }  
             c--;
             counter1++;
            }//end of the while loop
            //To calculate the vowel and the consonant characters
            while ( length != 0){
                name = input.charAt(counter);
                if ( (name == 'a')||(name == 'e')||(name == 'i')||(name == 'o')||(name == 'u')||(name == 'A')||(name == 'E')||(name == 'I')||(name == 'O')||(name == 'U')){
                    ++add;//add 1 to the add variable for each iteration
                }else if(name != ' '){
                    ++minus;//add 1 to minus variable for each iteration
                }//end of if else
                length--;
                counter++;
            }//end of the while loop
            JOptionPane.showMessageDialog(null,"Name = "+input+"\nTotal characters = "+size+"\nVowels = "+add+"\nConsonants = "+minus,"Alphabets Counter",JOptionPane.INFORMATION_MESSAGE);   
        }else{
            JOptionPane.showMessageDialog(null,"Invalid character.\nPlease enter more than 3 alphabets","Alphabets Counter",JOptionPane.ERROR_MESSAGE);
            check1 -= check1;
        }//end of the if else
        }//end of the while loop
        String check = JOptionPane.showInputDialog(null,"Do you want to try again?\n y-YES \t n-NO","Alphabets Counter",JOptionPane.QUESTION_MESSAGE);//ask the user to repeat or not 
        y = check.charAt(0);
        }//end of the while
    }//end of the main      
}//end of the class
