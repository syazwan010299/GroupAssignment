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
    static int mark;
    static char grad;
    static double pointer;
    
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog(null,"How many students in the class?","Exam Result System",JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Number of students : "+num);
        int nostudent = Integer.parseInt(num);
        int idx;
        PartBQuestion2 a = new PartBQuestion2();
        
        for (idx=0;idx<nostudent;idx++){
            String name = JOptionPane.showInputDialog(null,"Student name?","Exam Result System",JOptionPane.QUESTION_MESSAGE);
            System.out.print("NAME : "+name);
            String idnum = JOptionPane.showInputDialog(null,"Student ID?","Exam Result System",JOptionPane.QUESTION_MESSAGE);
            int id = Integer.parseInt(idnum);
            if ((id>999)&&(id<10000)){
                System.out.println("\t\t ID NO : "+id);
            }else{
                System.out.println("\nStudent ID must contain 4 digit values");
            }
            
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("Code\t\tCourse\t\t\t\t\tCredit\tMarks\tGrade\tPoints\tTotal Points");
            String course1 = JOptionPane.showInputDialog(null,"Intro to Information Systems Mark?","Exam Result System",JOptionPane.QUESTION_MESSAGE);
            int cmark1 = Integer.parseInt(course1);
            a.Marks(cmark1);
            System.out.println("BIS1513\t\tIntro to Information System\t\t  3\t "+cmark1+"\t "+grad+"\t "+pointer+"\t "+(3*pointer) );
            String course2 = JOptionPane.showInputDialog(null,"C++ Programming I Mark?","Exam Result System",JOptionPane.QUESTION_MESSAGE);
            int cmark2 = Integer.parseInt(course2);
            a.Marks(cmark2);
            System.out.println("BIT1214\t\tC++ Programming I\t\t\t  4\t "+cmark2+"\t "+grad+"\t "+pointer+"\t "+(2*pointer) );
            
            String course3 = JOptionPane.showInputDialog(null,"Interactive Multimedia Mark?","Exam Result System",JOptionPane.QUESTION_MESSAGE);
            int cmark3 = Integer.parseInt(course3);
            a.Marks(cmark3);
            System.out.println("BIT2333\t\tInteractive Multimedia\t\t\t  3\t "+cmark3+"\t "+grad+"\t "+pointer+"\t "+(3*pointer) );
            String course4 = JOptionPane.showInputDialog(null,"Multimedia Technology Mark?","Exam Result System",JOptionPane.QUESTION_MESSAGE);
            int cmark4 = Integer.parseInt(course4);
            a.Marks(cmark4);
            System.out.println("BIT1312\t\tMultimedia Technology\t\t\t  2\t "+cmark4+"\t "+grad+"\t "+pointer+"\t "+(4*pointer) );
            String course5 = JOptionPane.showInputDialog(null,"Interaction Design Mark?","Exam Result System",JOptionPane.QUESTION_MESSAGE);
            int cmark5 = Integer.parseInt(course5);
            a.Marks(cmark5);
            System.out.println("BIE2243\t\tInteraction Design\t\t\t  3\t "+cmark5+"\t "+grad+"\t "+pointer+"\t "+(3*pointer) );
            
            System.out.println("--------------------------------------------------------------------------------------");
            TotalPoint obj = new TotalPoint();
            obj.TotalPoint();
            System.out.println("Your GPA : ");
            System.out.println("Status : ");
            System.out.println("--------------------------------------------------------------------------------------");
            
        }
    }
    
    int Marks(int mark){
        int counter = 0;
        while (counter != 0){
        if ((mark>=80)&&(mark<101)){
            grad = 'A';
            pointer = 4.00;
        }else if ((mark>=75)&&(mark<=79)){
            grad = 'A';
            pointer = 3.67;
        }else if ((mark>=70)&&(mark<=74)){
            grad = 'B';
            pointer = 3.33;
        }else if ((mark>=65)&&(mark<=69)){
            grad = 'B';
            pointer = 3.00;
        }else if ((mark>=60)&&(mark<=64)){
            grad = 'B';
            pointer = 2.67;
        }else if ((mark>=55)&&(mark<=59)){
            grad = 'C';
            pointer = 2.33;
        }else if ((mark>=50)&&(mark<=54)){
            grad = 'C';
            pointer = 2.00;
        }else if ((mark>=45)&&(mark<=49)){
            grad = 'C';
            pointer = 1.67;
        }else if ((mark>=40)&&(mark<=44)){
            grad = 'D';
            pointer = 1.33;
        }else{
            grad = 'F';
            pointer = 0.00;
        }        
        }
        counter++;
        return 0;
    }
}

class TotalPoint{
    public void TotalPoint(){
        double total;
        
        
        total = 167/15.0;
        
        if (total > 2.00){
            System.out.println(" Pass");
        }else{
            System.out.println("Fail");
        }
    }
}
