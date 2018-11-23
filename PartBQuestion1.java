/**
 * Program Name : Part B Question 1
 * Description  : 
 * @author      : Mohamad Syazwan Zulfaris bin Zainal - B04180021
 *              : Nor Fariha binti Serzali - B04180022
 * @version 1.BI
 */
package GroupAssignment;

import javax.swing.JOptionPane;

public class PartBQuestion1 {
    public static void main(String[] args) {
        char y = 'y';
        String input = JOptionPane.showInputDialog(null,"Do You Have Membership Card\nY-Yes \t N-No","Transaction System",JOptionPane.INFORMATION_MESSAGE);
        y = input.charAt(0);
        if ( (y == 'y') || (y == 'Y')){
            System.out.println("----------------------------UNIMY SUPERMARKET---------------------------------");
            System.out.println("Code\t\tName\t\tPrice\t\tQuantity\t\tTotal");
            System.out.println("------------------------------------------------------------------------------");
            
            String purchase = JOptionPane.showInputDialog(null,"How many products that you want to purchase?","Transaction System",JOptionPane.QUESTION_MESSAGE);
            int product = Integer.parseInt(purchase);
            
            while ( product != 0){
            String code = JOptionPane.showInputDialog(null,"What is the product code?","Transaction System",JOptionPane.QUESTION_MESSAGE);
            int id = Integer.parseInt(code);
            if ( id == 1){
             String a1 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             int quantity1 = Integer.parseInt(a1);
             float total1 = (float)(quantity1 * 34.55);
             System.out.println("1\t\tSHOE\t\tRM34.55\t\t"+quantity1+"\t\t\t"+"RM"+total1);
            }else if ( id == 2){
             String a2 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             int quantity2 = Integer.parseInt(a2);
             float total2 = (float)(quantity2 * 44.29);
             System.out.println("2\t\tSHIRT\t\tRM44.29\t\t"+quantity2+"\t\t\t"+"RM"+total2); 
            }else if ( id == 3){
             String a3 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             int quantity3 = Integer.parseInt(a3);
             float total3 = (float)(quantity3 * 64.35);
             System.out.println("3\t\tPANTS\t\tRM64.35\t\t"+quantity3+"\t\t\t"+"RM"+total3); 
            }else if ( id == 4){
             String a4 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             int quantity4 = Integer.parseInt(a4);
             float total4 = (float)(quantity4 * 84.20);
             System.out.println("4\t\tJEANS\t\tRM84.20\t\t"+quantity4+"\t\t\t"+"RM"+total4);  
            }else if ( id == 5){
             String a5 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             int quantity5 = Integer.parseInt(a5);
             float total5 = (float)(quantity5 * 51.59);
             System.out.println("5\t\tFAN\t\tRM51.59\t\t"+quantity5+"\t\t\t"+"RM"+total5);  
            }else if ( id == 6){
             String a6 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             int quantity6 = Integer.parseInt(a6);
             float total6 = (float)(quantity6 * 24.45);
             System.out.println("6\t\tIRON\t\tRM24.45\t\t"+quantity6+"\t\t\t"+"RM"+total6);     
            }else if ( id == 7){
             String a7 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             int quantity7 = Integer.parseInt(a7);
             float total7 = (float)(quantity7 * 51.99);
             System.out.println("7\t\tTRAY\t\tRM51.99\t\t"+quantity7+"\t\t\t"+"RM"+total7);     
            }else if ( id == 8){
             String a8 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             int quantity8 = Integer.parseInt(a8);
             float total8 = (float)(quantity8 * 24.76);
             System.out.println("8\t\tRICE\t\tRM24.76\t\t"+quantity8+"\t\t\t"+"RM"+total8);      
            }//end of the if else
            
            --product;
            }//end of the while       
                    
                    
        }else if( (y == 'n') || (y == 'N')){
            System.out.println("d");
        }//end of the else
        
    }//end of the main
}
