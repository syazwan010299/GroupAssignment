/**
 * Program Name : Exam Result System - Part B Question 2
 * Description  : This coding 
 * @author      : Mohamad Syazwan Zulfaris bin Zainal - B04180021
 *              : Nor Fariha binti Serzali - B04180022
 * @version 2.BI
 */
package GroupAssignment;

import javax.swing.JOptionPane;//import windows
import java.math.BigDecimal;//import class BigDecimal to convert float into 2 decimal places
import java.time.LocalDateTime;//import class LocalDateTime for date and time
import java.time.format.DateTimeFormatter;//import class DateTimeFormatter to set the structure of date and time
import java.util.Locale;//import class Locale for to specific the region

public class PartBQuestion2 {
    private static final DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    static int mark;//
    static char grad, symbol;
    static float pointer;
    
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("----------------------------------------| WELCOME TO EXAM RESULT SYSTEM |----------------------------------------");
        String num = JOptionPane.showInputDialog(null,"How many students in the class?","Exam Result System",JOptionPane.INFORMATION_MESSAGE);
        System.out.println("\nNumber of students : "+num+"\n");
        System.out.println(date.format(now));
        int nostudent = Integer.parseInt(num);
        int idx;
        float i = 0.0f, c=0.0f, m=0.0f, t=0.0f, d=0.0f;
        PartBQuestion2 a = new PartBQuestion2();
        
        for (idx=0;idx<nostudent;idx++){
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            
            String name = JOptionPane.showInputDialog(null,(idx+1)+" Student name?","Exam Result System",JOptionPane.QUESTION_MESSAGE);
            System.out.print("  NAME : "+name);
            
            int id = 0;
            int counter = 0;
            int length = 0;
            while ( length == 0){// act as counter to loop the process
            String plus = JOptionPane.showInputDialog(null,(idx+1)+" Student Id Number\nConsists of 4 values","Exam Result System",JOptionPane.QUESTION_MESSAGE);
            counter = Integer.parseInt(plus);
            id = counter;
            //to calculate the total of digit in the number
            while( counter != 0){
                counter /= 10;
                ++length;
            }//end of the while
            if ( length >= 5){//if the total of digit is more than 4
                JOptionPane.showMessageDialog(null,"PLEASE ENTER A VALID ID NUMBER.\nStudent ID must contain 4 digit values","Exam Result Systems",JOptionPane.ERROR_MESSAGE);
                length -= length;//reset the value of counter length as 0
            }else if ( length <= 3){//if the total of digit is less than 4
                JOptionPane.showMessageDialog(null,"PLEASE ENTER A VALID ID NUMBER.\nStudent ID must contain 4 digit values","Exam Result Systems",JOptionPane.ERROR_MESSAGE);
                length -= length;;//reset the value of counter length as 0
            }//end of the if else
            
            }//end of the while
            
            System.out.println("\t\t\tID : "+id);
            
        System.out.println("----------------------------------------------------------------------------------------------------------------");
            
            System.out.println("  Code\t\t\tCourse\t\t\t\t\tCredit\tMarks\tGrade\tPoints\tTotal Points");
            String course1 = JOptionPane.showInputDialog(null,"Intro to Information Systems Mark?","Exam Result System",JOptionPane.QUESTION_MESSAGE);
            int cmark1 = Integer.parseInt(course1);
            a.Marks(cmark1);
            float savepoint1 = (3*pointer);
            savepoint1 = Bundarkan(savepoint1,2);
            System.out.println("  BIS1513\t\tIntro to Information System\t\t  3\t "+cmark1+"\t "+grad+symbol+"\t "+pointer+"\t   "+savepoint1);
            i += cmark1;
            
            String course2 = JOptionPane.showInputDialog(null,"C++ Programming I Mark?","Exam Result System",JOptionPane.QUESTION_MESSAGE);
            int cmark2 = Integer.parseInt(course2);
            a.Marks(cmark2);
            float savepoint2 = (4*pointer);
            savepoint2 = Bundarkan(savepoint2,2);
            System.out.println("  BIT1214\t\tC++ Programming I\t\t\t  4\t "+cmark2+"\t "+grad+symbol+"\t "+pointer+"\t   "+savepoint2 );
            c += cmark2;
            
            String course3 = JOptionPane.showInputDialog(null,"Interactive Multimedia Mark?","Exam Result System",JOptionPane.QUESTION_MESSAGE);
            int cmark3 = Integer.parseInt(course3);
            a.Marks(cmark3);
            float savepoint3 = (3*pointer);
            savepoint3 = Bundarkan(savepoint3,2);
            System.out.println("  BIT2333\t\tInteractive Multimedia\t\t\t  3\t "+cmark3+"\t "+grad+symbol+"\t "+pointer+"\t   "+savepoint3);
            m += cmark3;
            
            String course4 = JOptionPane.showInputDialog(null,"Multimedia Technology Mark?","Exam Result System",JOptionPane.QUESTION_MESSAGE);
            int cmark4 = Integer.parseInt(course4);
            a.Marks(cmark4);
            float savepoint4 = (2*pointer);
            savepoint4 = Bundarkan(savepoint4,2);
            System.out.println("  BIT1312\t\tMultimedia Technology\t\t\t  2\t "+cmark4+"\t "+grad+symbol+"\t "+pointer+"\t   "+savepoint4);
            t += cmark4;
            
            String course5 = JOptionPane.showInputDialog(null,"Interaction Design Mark?","Exam Result System",JOptionPane.QUESTION_MESSAGE);
            int cmark5 = Integer.parseInt(course5);
            a.Marks(cmark5);
            float savepoint5 = (3*pointer);
            savepoint5 = Bundarkan(savepoint5,2);
            System.out.println("  BIE2243\t\tInteraction Design\t\t\t  3\t "+cmark5+"\t "+grad+symbol+"\t "+pointer+"\t   "+savepoint5);
            d += cmark5;
            
        System.out.println("----------------------------------------------------------------------------------------------------------------");
            float gpa = (savepoint1+savepoint2+savepoint3+savepoint4+savepoint5);
            gpa = Bundarkan(gpa,2);
            float cgpa = (gpa/15);
            cgpa = Bundarkan(cgpa,2);
            System.out.println("  Your GPA : "+cgpa);
            if (cgpa>2.00){
            System.out.println("  Status : PASS");
            }else{
                System.out.println("  Status : FAIL\n");
            }
            }
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        
            System.out.println("  Summary : ");
            float total1,total2, total3, total4, total5;
            total1 = (i/nostudent);
            total1 = Bundarkan(total1,2);
            total2 = (c/nostudent);
            total2 = Bundarkan(total2,2);
            total3 = (m/nostudent);
            total3 = Bundarkan(total3,2);
            total4 = (t/nostudent);
            total4 = Bundarkan(total4,2);
            total5 = (d/nostudent);
            total5 = Bundarkan(total5,2);
            System.out.println("  Intro to Information Systems: "+total1);
            System.out.println("  C++ Programming I           : "+total2);
            System.out.println("  Interactive Multimedia      : "+total3);
            System.out.println("  Multimedia Technology       : "+total4);
            System.out.println("  Interaction Design          : "+total5);
            
            if ((total1>total2)&&(total1>total3)&&(total1>total4)&&(total1>total5)){
                System.out.println("\n  Best Subject  : Intro to Information Systems");
            }else if((total2>total1)&&(total2>total3)&&(total2>total4)&&(total2>total5)){
                System.out.println("\n  Best Subject  : C++ Programming I");
            }else if((total3>total1)&&(total3>total2)&&(total3>total4)&&(total3>total5)){
                System.out.println("\n  Best Subject  : Interactive Multimedia");
            }else if((total4>total1)&&(total4>total2)&&(total4>total3)&&(total4>total5)){
                System.out.println("\n  Best Subject  : Multimedia Technology");
            }else if((total5>total1)&&(total5>total2)&&(total5>total3)&&(total5>total4)){
                System.out.println("\n  Best Subject  : Interaction Design");
            }else{
                System.out.println("\n  No Best Subject");
            }
            
            
            if ((total1<total2)&&(total1<total3)&&(total1<total4)&&(total1<total5)){
                System.out.println("  Worst Subject  : Intro to Information Systems");
            }else if((total2<total1)&&(total2<total3)&&(total2<total4)&&(total2<total5)){
                System.out.println("  Worst Subject  : C++ Programming I");
            }else if((total3<total1)&&(total3<total2)&&(total3<total4)&&(total3<total5)){
                System.out.println("  Worst Subject  : Interactive Multimedia");
            }else if((total4<total1)&&(total4<total2)&&(total4<total3)&&(total4<total5)){
                System.out.println("  Worst Subject  : Multimedia Technology");
            }else if((total5<total1)&&(total5<total2)&&(total5<total3)&&(total5<total4)){
                System.out.println("  Worst Subject  : Interaction Design");
            }else{
                System.out.println("\n  No Worst Subject");
            }
            
    }
    
    void Marks(int mark){

            if ((mark>=80)&&(mark<=100)){
                grad = 'A';
                symbol = ' ';
                pointer = 4.00f;
            }else if ((mark>=75)&&(mark<=79)){
                grad = 'A';
                symbol = '-';
                pointer = 3.67f;
            }else if ((mark>=70)&&(mark<=74)){
                grad = 'B';
                symbol = '+';
                pointer = 3.33f;
            }else if ((mark>=65)&&(mark<=69)){
                grad = 'B';
                symbol = ' ';
                pointer = 3.00f;
            }else if ((mark>=60)&&(mark<=64)){
                grad = 'B';
                symbol = '-';
                pointer = 2.67f;
            }else if ((mark>=55)&&(mark<=59)){
                grad = 'C';
                symbol = '+';
                pointer = 2.33f;
            }else if ((mark>=50)&&(mark<=54)){
                grad = 'C';
                symbol = ' ';
                pointer = 2.00f;
            }else if ((mark>=45)&&(mark<=49)){
                grad = 'C';
                symbol = '-';
                pointer = 1.67f;
            }else if ((mark>=40)&&(mark<=44)){
                grad = 'D';
                symbol = ' ';
                pointer = 1.33f;
            }else if((mark>=0)&&(mark<=39)){
                grad = 'F';
                symbol = ' ';
                pointer = 0.00f;
            }else{
                System.out.println("Mark invalid.");
            }     
        
    }
    
    public static float Bundarkan(float q , int c){
        BigDecimal b = new BigDecimal(q);//declaration of new object
        b = b.setScale(c,BigDecimal.ROUND_HALF_UP);
        return b.floatValue();//return the value that has two decimal places
    }
    
}