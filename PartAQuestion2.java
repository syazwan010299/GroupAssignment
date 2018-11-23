
package GroupAssignment;

import javax.swing.JOptionPane;
public class PartAQuestion2 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null,"What is your name?","Counter",JOptionPane.QUESTION_MESSAGE);
        //System.out.println("Name : "+input);
        //char name = input.charAt(0);
        char name = 0;
        System.out.println(input);
        int length = input.length();

        if(input.length()>3){
            System.out.println("Total characters = "+input.length());
            
            int add = 0;
            int minus = 0;
            while ( length != 0){
                int counter = 0;
                name = input.charAt(counter);
                if ( (name == 'A')||(name == 'B')){
                    ++add;
                }else{
                    ++minus;
                }
                length--;
                counter++;
            }
            
            
            System.out.println("Vowels = " + add);
            System.out.println("Consonants = " + minus);
        }else{
            System.out.println("try again");
        }
        
    }
}

