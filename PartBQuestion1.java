/**
 * Program Name : Part B Question 1
 * Description  : 
 * @author      : Mohamad Syazwan Zulfaris bin Zainal - B04180021
 *              : Nor Fariha binti Serzali - B04180022
 * @version 1.BI
 */
package GroupAssignment;

import javax.swing.JOptionPane;//import class JOptionPane to use the windows input and output
import java.math.BigDecimal;//import class BigDecimal to convert float into 2 decimal places
import java.time.LocalDateTime;//import class LocalDateTime for date and time
import java.time.format.DateTimeFormatter;//import class DateTimeFormatter to set the structure of date and time
import java.util.Locale;//import class Locale for to specific the region

public class PartBQuestion1 {
    private static final DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");//set the structure of date and time
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();//create new object to calculate the time and date 
        Rebate rebate = new Rebate();//create new object to calculate the rebate of the transaction
        GST gst = new GST();//create new object to claculate the Government Service Tax
        Discounts g = new Discounts();//create new object to calculate the discounts
        int discount = 0,discount1 = 0,discount2 = 0;//variables for calculate the discounts
        char y = 'y';//To check the user has membership card or not
        int quantity1=0,quantity2=0,quantity3=0,quantity4=0,quantity5=0,quantity6=0,quantity7=0,quantity8=0;//variables for items that user want to buy
        float total1=0.0f,total2=0.0f,total3=0.0f,total4=0.0f,total5=0.0f,total6=0.0f,total7=0.0f,total8=0.0f;//variables for each of items times with how many for every item that user want
        String input = JOptionPane.showInputDialog(null,"Do You Have Membership Card?\nY-Yes    N-No","Transaction System",JOptionPane.INFORMATION_MESSAGE);//ask the user if he or she have membership card or not
        y = input.charAt(0);
        JOptionPane.showMessageDialog(null,"Code Item\n1 - Shoe   2 - Shirt\n3 - Pants   4 - Jeans\n5 - Fan   6 - Iron\n7 - Tray   8 - Rice","Transactio System",JOptionPane.INFORMATION_MESSAGE);
        if ( (y == 'y') || (y == 'Y')){
            System.out.println(date.format(now));
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
             quantity1 = Integer.parseInt(a1);
             total1 = (float)(quantity1 * 34.55);
             if ( total1 > 200.00){
                 discount = rebate.kira(discount);
             }
             System.out.println("1\t\tSHOE\t\tRM34.55\t\t"+quantity1+"\t\t\t"+"RM"+total1);
            }else if ( id == 2){
             String a2 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             quantity2 = Integer.parseInt(a2);
             total2 = (float)(quantity2 * 44.29);
             System.out.println("2\t\tSHIRT\t\tRM44.29\t\t"+quantity2+"\t\t\t"+"RM"+total2); 
            }else if ( id == 3){
             String a3 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             quantity3 = Integer.parseInt(a3);
             total3 = (float)(quantity3 * 64.35);
             if ( total3 > 200.00){
                 discount1 = rebate.kira(discount1);
             }
             System.out.println("3\t\tPANTS\t\tRM64.35\t\t"+quantity3+"\t\t\t"+"RM"+total3); 
            }else if ( id == 4){
             String a4 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             quantity4 = Integer.parseInt(a4);
             total4 = (float)(quantity4 * 84.20);
             if ( total4 > 200.00){
                 discount2 = rebate.kira(discount2);
             }
             System.out.println("4\t\tJEANS\t\tRM84.20\t\t"+quantity4+"\t\t\t"+"RM"+total4);  
            }else if ( id == 5){
             String a5 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             quantity5 = Integer.parseInt(a5);
             total5 = (float)(quantity5 * 51.59);
             System.out.println("5\t\tFAN\t\tRM51.59\t\t"+quantity5+"\t\t\t"+"RM"+total5);  
            }else if ( id == 6){
             String a6 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             quantity6 = Integer.parseInt(a6);
             total6 = (float)(quantity6 * 24.45);
             System.out.println("6\t\tIRON\t\tRM24.45\t\t"+quantity6+"\t\t\t"+"RM"+total6);     
            }else if ( id == 7){
             String a7 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             quantity7 = Integer.parseInt(a7);
             total7 = (float)(quantity7 * 51.99);
             System.out.println("7\t\tTRAY\t\tRM51.99\t\t"+quantity7+"\t\t\t"+"RM"+total7);     
            }else if ( id == 8){
             String a8 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             quantity8 = Integer.parseInt(a8);
             total8 = (float)(quantity8 * 24.76);
             System.out.println("8\t\tRICE\t\tRM24.76\t\t"+quantity8+"\t\t\t"+"RM"+total8);      
            }else if ( id >= 9){
                JOptionPane.showMessageDialog(null,"You key in wrong code !!","Error Message",JOptionPane.ERROR_MESSAGE);
                product++;
            }else if ( id == 0){
                JOptionPane.showMessageDialog(null,"You key in wrong code !!","Error Message",JOptionPane.ERROR_MESSAGE);
                product++;
            }
            --product;
            }//end of the while
            System.out.println("------------------------------------------------------------------------------");
            int totalquantity;
            int totalrebate;
            float totalprice = 0.0f;
            float totalgst = 0.0f;
            float totaldiscounts = 0.0f;
            float memberdiscounts = 0.0f;
            float netpurchased = 0.0f;
            totalprice = (float)(total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8);
            totalrebate = discount + discount1 + discount2;
            totalquantity = quantity1 + quantity2 + quantity3 + quantity4 + quantity5 + quantity6 + quantity7 + quantity8;
            
            
            
            System.out.println("Items Quantity : " + totalquantity);
            System.out.println("Membership : Yes");
            System.out.println("Membership Discount : 10%");
            System.out.println("Total Purchased : RM"+ String.format("%.2f",totalprice));
            System.out.println("Rebates : " + totalrebate);
            totalprice = bundar(totalprice, 2);
            totalgst = gst.count(totalprice);
            totalgst = bundar(totalgst, 2);
            totaldiscounts = g.calc(totalgst);
            totaldiscounts = bundar(totaldiscounts, 2);
            System.out.println("GST(Goverment Service Tax) : 6%");
            
            memberdiscounts = (float)((0.9) * totalgst);
            memberdiscounts = bundar(memberdiscounts, 2);
            System.out.println("------------------------------------------------------------------------------");  
            netpurchased = (float)( memberdiscounts - totalrebate - totaldiscounts);//check balik totaldiscount
            netpurchased = bundar( netpurchased, 2);
            System.out.println("Net Purchased : RM" + String.format("%.2f",netpurchased));
           
            float amountpay = 0.0f;
            while ( amountpay < netpurchased){
            String pay = JOptionPane.showInputDialog(null,"You can pay now :)","Transaction System",JOptionPane.QUESTION_MESSAGE);
            amountpay = Float.parseFloat(pay); 
            if ( amountpay < netpurchased){
                JOptionPane.showMessageDialog(null,"Your cash is not enough!","Transaction System",JOptionPane.ERROR_MESSAGE);
            }//end of the if else
            
            }// end of the while
            System.out.println("Amount Paid : RM" + String.format("%.2f",amountpay));
            float change = 0.0f;
            change = ((-1)*(netpurchased - amountpay));
            System.out.println("Changed : RM" + String.format("%.2f",change));
            System.out.println("------------------------------------------------------------------------------");
            
        }else if( (y == 'n') || (y == 'N')){
            System.out.println("d");
        }//end of the else
        
    }//end of the main
    
    public static float bundar(float q , int c){
        BigDecimal big = new BigDecimal(q);
        big = big.setScale(c,BigDecimal.ROUND_HALF_UP);
        return big.floatValue();
    }
    
    
}
class Rebate{
    
    public int kira(int d){
      d += 25;
      return d;
    }
}
class GST{
    float r = (float) 0.0f;
    float s = (float) 0.0f;
    public float count(float e){
        r = (float) ((0.06f) * e);
        s = (float)(r + e);
        return s;
    }
}
class Discounts{
    
    public float calc( float f){
        float s = (float)0.0;
        if ( (f > 200) && (f <= 500)){
            System.out.println("Discount : 10%");
            s = (float) ((0.1) * f);
        }else if( (f > 500) && (f <= 1000)){
            System.out.println("Discount : 20%");
            s = (float) ((0.2) * f);
            
        }else if ( (f > 1000) && (f <= 2000)){
            System.out.println("Discount : 30%");
            s = (float) ((0.3) * f);
            
        }else if ( f > 2000){
            System.out.println("Discount : 50%");
            s = (float) ((0.5) * f);
           
        }
        return s;
    }
}
