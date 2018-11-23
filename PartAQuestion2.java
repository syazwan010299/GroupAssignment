/**
 * Program Name : Part A Question 2
 * Description  : 
 * @author      : Mohamad Syazwan Zulfaris bin Zainal - B04180021
 *              : Nor Fariha binti Serzali - B04180022
 * @version 2.AI
 */
package GroupAssignment;

import javax.swing.JOptionPane;

public class PartAQuestion2 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null,"What is your name?","Counter",JOptionPane.QUESTION_MESSAGE);
        char name;
        char space;
        int length = input.length();
        int c = length;
        int add = 0;
        int minus = 0;
        int counter = 0;
        int size = 0;
        int counter1 = 0;
        if(input.length()>3){
            System.out.println("Total characters = "+input.length());
            
            
            while ( c != 0){
              space = input.charAt(counter1);
             if ( space != ' '){
                 ++size;
             }  
             c--;
             counter1++;
            }
            

            while ( length != 0){
                name = input.charAt(counter);
                if ( (name == 'a')||(name == 'e')||(name == 'i')||(name == 'o')||(name == 'u')||(name == 'A')||(name == 'E')||(name == 'I')||(name == 'O')||(name == 'U')){
                    ++add;
                }else if(name != ' '){
                    ++minus;
                }
                length--;
                counter++;
            }
            
        }else{
            JOptionPane.showMessageDialog(null,"Try Again","Counter",JOptionPane.INFORMATION_MESSAGE);
        }
        JOptionPane.showMessageDialog(null,"Name = "+input+"\nTotal characters = "+size+"\nVowels = "+add+"\nConsonants = "+minus,"Counter",JOptionPane.INFORMATION_MESSAGE);
    }
   
}//end of the class
