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
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog(null,"How many students in the class?","Exam Result System",JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Number of students : "+num);
        int nostudent = Integer.parseInt(num);
        int idx;
        for (idx=0;idx<nostudent;idx++){
            String name = JOptionPane.showInputDialog(null,"Student name?","Exam Result System",JOptionPane.INFORMATION_MESSAGE);
            System.out.print("NAME : "+name);
            String idnum = JOptionPane.showInputDialog(null,"Student ID?","Exam Result System",JOptionPane.INFORMATION_MESSAGE);
            System.out.println("\t\t ID NO : "+idnum);
        }
        
    }
}
