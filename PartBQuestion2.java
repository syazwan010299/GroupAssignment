/**
 * Program Name : Part B Question 2
 * Description  : 
 * @author      : Mohamad Syazwan Zulfaris bin Zainal - B04180021
 *              : Nor Fariha binti Serzali - B04180022
 * @version 2.BI
 */
package GroupAssignment;

import javax.swing.JOptionPane;

public class PartBQuestion2 {
    int mark;
    char grad;
    double pointer;
    
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog(null,"How many students in the class?","Exam Result System",JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Number of students : "+num);
        int nostudent = Integer.parseInt(num);
        int idx;
        for (idx=0;idx<nostudent;idx++){
            String name = JOptionPane.showInputDialog(null,"Student name?","Exam Result System",JOptionPane.INFORMATION_MESSAGE);
            System.out.print("NAME : "+name);
            String idnum = JOptionPane.showInputDialog(null,"Student ID?","Exam Result System",JOptionPane.INFORMATION_MESSAGE);
            int id = Integer.parseInt(idnum);
            while ((id>4)&&(id<4)){
                System.out.println("\t\t ID NO : "+id);
            }
            System.out.println("--------------------------------------------------------------------------------------");
            String course1 = JOptionPane.showInputDialog(null,"");
            
        }
        
    }
    public void Marks(){
        if ((mark>=80)&&(mark<101)){
            grad = 'A';
            pointer = 4.00;
        }else if ((mark>=75)&&(mark<=79)){
            grad = 'B';
            pointer = 3.67;
            
        }
    }
}
