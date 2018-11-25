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
        JOptionPane.showMessageDialog(null,"       WELCOME TO \n\tUNIMY SUPERMARKET","UNIMY SUPERMARKET",JOptionPane.INFORMATION_MESSAGE);//display the welcome to the unimy market
        String input = JOptionPane.showInputDialog(null,"Do You Have Membership Card?\nY-Yes    N-No","Transaction System",JOptionPane.INFORMATION_MESSAGE);//ask the user if he or she have membership card or not
        y = input.charAt(0);
        JOptionPane.showMessageDialog(null,"Code Item\n1 - Shoe   2 - Shirt\n3 - Pants   4 - Jeans\n5 - Fan   6 - Iron\n7 - Tray   8 - Rice","Transaction System",JOptionPane.INFORMATION_MESSAGE);//To show the user what is the code for every item
        if ( (y == 'y') || (y == 'Y')){
            System.out.println(date.format(now));//To display the date and time
            System.out.println("----------------------------UNIMY SUPERMARKET---------------------------------");
            System.out.println("Code\t\tName\t\tPrice\t\tQuantity\t\tTotal");
            System.out.println("------------------------------------------------------------------------------");
            
            String purchase = JOptionPane.showInputDialog(null,"How many products that you want to purchase?","Transaction System",JOptionPane.QUESTION_MESSAGE);//ask the user how many products that user want to purchase
            int product = Integer.parseInt(purchase);
            //Loop as long the product is not 0
            while ( product != 0){
            String code = JOptionPane.showInputDialog(null,"What is the product code?","Transaction System",JOptionPane.QUESTION_MESSAGE);//ask the user what is the product code for  every item
            int id = Integer.parseInt(code);
            if ( id == 1){//if code item is 1
             String a1 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             quantity1 = Integer.parseInt(a1);
             total1 = (float)(quantity1 * 34.55);//calculate the total price of item 1 times with the quantity of item 1
             //if the total price is more than RM 200 he/she will get the rebate for the item
             if ( total1 > 200.00){
                 discount = rebate.kira(discount);//calculate the rebate 
             }
             System.out.println("1\t\tSHOE\t\tRM34.55\t\t"+quantity1+"\t\t\t"+"RM"+total1);//display the code item 1 
            }else if ( id == 2){//if code item is 2
             String a2 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             quantity2 = Integer.parseInt(a2);
             total2 = (float)(quantity2 * 44.29);//calculate the total price of item 2 times with the quantity of item 2
             System.out.println("2\t\tSHIRT\t\tRM44.29\t\t"+quantity2+"\t\t\t"+"RM"+total2);//display the code item 2 
            }else if ( id == 3){//if code item is 3
             String a3 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             quantity3 = Integer.parseInt(a3);
             total3 = (float)(quantity3 * 64.35);//calculate the total price of item 3 with the quantity of item 3
             //if the total price is more than RM 200 he/she will get the rebate for the item
             if ( total3 > 200.00){
                 discount1 = rebate.kira(discount1);//calculate the rebate
             }
             System.out.println("3\t\tPANTS\t\tRM64.35\t\t"+quantity3+"\t\t\t"+"RM"+total3);//display the code item 3 
            }else if ( id == 4){//if code item is 4
             String a4 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             quantity4 = Integer.parseInt(a4);
             total4 = (float)(quantity4 * 84.20);//calculate the total price of item 4 with the quantity of item 4
             //if the total price is more than RM 200 he/she will get the rebate for the item
             if ( total4 > 200.00){
                 discount2 = rebate.kira(discount2);//calculate the rebate
             }
             System.out.println("4\t\tJEANS\t\tRM84.20\t\t"+quantity4+"\t\t\t"+"RM"+total4);//display the code item 4  
            }else if ( id == 5){//if code item is 5
             String a5 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             quantity5 = Integer.parseInt(a5);
             total5 = (float)(quantity5 * 51.59);//calculate the total price of item 5 with the quantity of item 5
             System.out.println("5\t\tFAN\t\tRM51.59\t\t"+quantity5+"\t\t\t"+"RM"+total5);//display the code item 5  
            }else if ( id == 6){//if code item is 6
             String a6 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             quantity6 = Integer.parseInt(a6);
             total6 = (float)(quantity6 * 24.45);//calculate the total price of item 6 with the quantity of item 6
             System.out.println("6\t\tIRON\t\tRM24.45\t\t"+quantity6+"\t\t\t"+"RM"+total6);//display the code item 6    
            }else if ( id == 7){//if code item is 7
             String a7 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             quantity7 = Integer.parseInt(a7);
             total7 = (float)(quantity7 * 51.99);//calculate the total price of item 7 with the quantity of item 7
             System.out.println("7\t\tTRAY\t\tRM51.99\t\t"+quantity7+"\t\t\t"+"RM"+total7);//display the code item 7      
            }else if ( id == 8){//if code item is 8
             String a8 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             quantity8 = Integer.parseInt(a8);
             total8 = (float)(quantity8 * 24.76);//calculate the total price of item 8 with the quantity of item 8
             System.out.println("8\t\tRICE\t\tRM24.76\t\t"+quantity8+"\t\t\t"+"RM"+total8);//display the code item 8      
            }else if ( id >= 9){//if code item more than 9
                JOptionPane.showMessageDialog(null,"You key in wrong code !!","Error Message",JOptionPane.ERROR_MESSAGE);
                product++;
            }else if ( id == 0){//if code item is 0
                JOptionPane.showMessageDialog(null,"You key in wrong code !!","Error Message",JOptionPane.ERROR_MESSAGE);
                product++;
            }
            --product;
            }//end of the while
            System.out.println("------------------------------------------------------------------------------");
            int totalquantity;//variable to calculate the total of items that user buy
            int totalrebate;//variable to calculate the total of rebate
            float totalprice = 0.0f;//variable to calculate the total of the price
            float totalgst = 0.0f;//variable to calculate the total of Government Service Tax
            float totaldiscounts = 0.0f;//variable to calculate the total of discounts
            float memberdiscounts = 0.0f;//variable to calculate the total of member discount
            float netpurchased = 0.0f;//variable to display the final total of price that need to pay
            totalprice = (float)(total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8);//calculate the total price of product
            totalrebate = discount + discount1 + discount2;//calculate the total rebate
            totalquantity = quantity1 + quantity2 + quantity3 + quantity4 + quantity5 + quantity6 + quantity7 + quantity8;//calculate the total quantity of item 
            
            System.out.println("Items Quantity : " + totalquantity);//display the total quantity of item
            System.out.println("Membership : Yes");//display the membership card
            System.out.println("Membership Discount : 10%");//display the membership discounts
            System.out.println("Total Purchased : RM"+ String.format("%.2f",totalprice));//display the total price before GST and other discounts
            System.out.println("Rebates : " + totalrebate);//display the total rebate that user get
            totalprice = bundar(totalprice, 2);//round off the total price to two decimal places
            totalgst = gst.count(totalprice);//calculate the sum of (total price + GST)
            totalgst = bundar(totalgst, 2);//round off the sum of (total price + GST) to two decimal places
            totaldiscounts = g.calc(totalgst);//calculate the discount that user get
            totaldiscounts = bundar(totaldiscounts, 2);//round off the discount to two decimal places
            System.out.println("GST(Goverment Service Tax) : 6%");
            
            memberdiscounts = (float)((0.9) * totalgst);//calculate the member discount ---> Final value--->memberdiscount=( (total price + GST ) - member discount)
            memberdiscounts = bundar(memberdiscounts, 2);//round off the memberdiscounts to two decimal places
            System.out.println("------------------------------------------------------------------------------");  
            netpurchased = (float)( memberdiscounts - totalrebate - totaldiscounts);//calculate the net total of price that user need to pay
            netpurchased = bundar( netpurchased, 2);//round off the net total price to two decimal places
            System.out.println("Net Purchased : RM" + String.format("%.2f",netpurchased));//display the net of total of price
           
            float amountpay = 0.0f;//variable to insert the value that user give to pay the item
            //If the value less than the net total of price
            while ( amountpay < netpurchased){
            String pay = JOptionPane.showInputDialog(null,"You can pay now :)","Transaction System",JOptionPane.QUESTION_MESSAGE);//display the message for user to key in value to pay the net of total price
            amountpay = Float.parseFloat(pay);
            //To display the error message if the value has not enough to pay the net of total price of item
            if ( amountpay < netpurchased){
                JOptionPane.showMessageDialog(null,"Your cash is not enough!","Transaction System",JOptionPane.ERROR_MESSAGE);//display the error message if the value is not enough
            }//end of the if else
            
            }// end of the while
            System.out.println("Amount Paid : RM" + String.format("%.2f",amountpay));//display the amount the user key in to pay the net of total price
            float change = 0.0f;//variable to calculate the change after the amountpay minus the net of total price
            change = ((-1)*(netpurchased - amountpay));//to calculate the the changes of user money
            System.out.println("Changed : RM" + String.format("%.2f",change));//display the changes of user money
            System.out.println("------------------------------------------------------------------------------");
            
        }else if( (y == 'n') || (y == 'N')){
            System.out.println(date.format(now));//To display the date and time
            System.out.println("----------------------------UNIMY SUPERMARKET---------------------------------");
            System.out.println("Code\t\tName\t\tPrice\t\tQuantity\t\tTotal");
            System.out.println("------------------------------------------------------------------------------");
            
            String purchase = JOptionPane.showInputDialog(null,"How many products that you want to purchase?","Transaction System",JOptionPane.QUESTION_MESSAGE);//ask the user how many products that user want to purchase
            int product = Integer.parseInt(purchase);
            //Loop as long the product is not 0
            while ( product != 0){
            String code = JOptionPane.showInputDialog(null,"What is the product code?","Transaction System",JOptionPane.QUESTION_MESSAGE);//ask the user what is the product code for  every item
            int id = Integer.parseInt(code);
            if ( id == 1){//if code item is 1
             String a1 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             quantity1 = Integer.parseInt(a1);
             total1 = (float)(quantity1 * 34.55);//calculate the total price of item 1 times with the quantity of item 1
             //if the total price is more than RM 200 he/she will get the rebate for the item
             if ( total1 > 200.00){
                 discount = rebate.kira(discount);//calculate the rebate 
             }
             System.out.println("1\t\tSHOE\t\tRM34.55\t\t"+quantity1+"\t\t\t"+"RM"+total1);//display the code item 1 
            }else if ( id == 2){//if code item is 2
             String a2 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             quantity2 = Integer.parseInt(a2);
             total2 = (float)(quantity2 * 44.29);//calculate the total price of item 2 times with the quantity of item 2
             System.out.println("2\t\tSHIRT\t\tRM44.29\t\t"+quantity2+"\t\t\t"+"RM"+total2);//display the code item 2 
            }else if ( id == 3){//if code item is 3
             String a3 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             quantity3 = Integer.parseInt(a3);
             total3 = (float)(quantity3 * 64.35);//calculate the total price of item 3 with the quantity of item 3
             //if the total price is more than RM 200 he/she will get the rebate for the item
             if ( total3 > 200.00){
                 discount1 = rebate.kira(discount1);//calculate the rebate
             }
             System.out.println("3\t\tPANTS\t\tRM64.35\t\t"+quantity3+"\t\t\t"+"RM"+total3);//display the code item 3 
            }else if ( id == 4){//if code item is 4
             String a4 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             quantity4 = Integer.parseInt(a4);
             total4 = (float)(quantity4 * 84.20);//calculate the total price of item 4 with the quantity of item 4
             //if the total price is more than RM 200 he/she will get the rebate for the item
             if ( total4 > 200.00){
                 discount2 = rebate.kira(discount2);//calculate the rebate
             }
             System.out.println("4\t\tJEANS\t\tRM84.20\t\t"+quantity4+"\t\t\t"+"RM"+total4);//display the code item 4  
            }else if ( id == 5){//if code item is 5
             String a5 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             quantity5 = Integer.parseInt(a5);
             total5 = (float)(quantity5 * 51.59);//calculate the total price of item 5 with the quantity of item 5
             System.out.println("5\t\tFAN\t\tRM51.59\t\t"+quantity5+"\t\t\t"+"RM"+total5);//display the code item 5  
            }else if ( id == 6){//if code item is 6
             String a6 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             quantity6 = Integer.parseInt(a6);
             total6 = (float)(quantity6 * 24.45);//calculate the total price of item 6 with the quantity of item 6
             System.out.println("6\t\tIRON\t\tRM24.45\t\t"+quantity6+"\t\t\t"+"RM"+total6);//display the code item 6    
            }else if ( id == 7){//if code item is 7
             String a7 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             quantity7 = Integer.parseInt(a7);
             total7 = (float)(quantity7 * 51.99);//calculate the total price of item 7 with the quantity of item 7
             System.out.println("7\t\tTRAY\t\tRM51.99\t\t"+quantity7+"\t\t\t"+"RM"+total7);//display the code item 7      
            }else if ( id == 8){//if code item is 8
             String a8 = JOptionPane.showInputDialog(null,"What is the quantity that you want to purchased","Transaction System",JOptionPane.QUESTION_MESSAGE);
             quantity8 = Integer.parseInt(a8);
             total8 = (float)(quantity8 * 24.76);//calculate the total price of item 8 with the quantity of item 8
             System.out.println("8\t\tRICE\t\tRM24.76\t\t"+quantity8+"\t\t\t"+"RM"+total8);//display the code item 8      
            }else if ( id >= 9){//if code item more than 9
                JOptionPane.showMessageDialog(null,"You key in wrong code !!","Error Message",JOptionPane.ERROR_MESSAGE);
                product++;
            }else if ( id == 0){//if code item is 0
                JOptionPane.showMessageDialog(null,"You key in wrong code !!","Error Message",JOptionPane.ERROR_MESSAGE);
                product++;
            }
            --product;
            }//end of the while
            System.out.println("------------------------------------------------------------------------------");
            int totalquantity;//variable to calculate the total of items that user buy
            int totalrebate;//variable to calculate the total of rebate
            float totalprice = 0.0f;//variable to calculate the total of the price
            float totalgst = 0.0f;//variable to calculate the total of Government Service Tax
            float totaldiscounts = 0.0f;//variable to calculate the total of discounts
            float memberdiscounts = 0.0f;//variable to calculate the total of member discount
            float netpurchased = 0.0f;//variable to display the final total of price that need to pay
            totalprice = (float)(total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8);//calculate the total price of product
            totalrebate = discount + discount1 + discount2;//calculate the total rebate
            totalquantity = quantity1 + quantity2 + quantity3 + quantity4 + quantity5 + quantity6 + quantity7 + quantity8;//calculate the total quantity of item 
            
            System.out.println("Items Quantity : " + totalquantity);//display the total quantity of item
            System.out.println("Membership : No");//display the membership card
            System.out.println("Membership Discount : 0%");//display the membership discounts
            System.out.println("Total Purchased : RM"+ String.format("%.2f",totalprice));//display the total price before GST and other discounts
            System.out.println("Rebates : " + totalrebate);//display the total rebate that user get
            totalprice = bundar(totalprice, 2);//round off the total price to two decimal places
            totalgst = gst.count(totalprice);//calculate the sum of (total price + GST)
            totalgst = bundar(totalgst, 2);//round off the sum of (total price + GST) to two decimal places
            totaldiscounts = g.calc(totalgst);//calculate the discount that user get
            totaldiscounts = bundar(totaldiscounts, 2);//round off the discount to two decimal places
            System.out.println("GST(Goverment Service Tax) : 6%");
            
            
            System.out.println("------------------------------------------------------------------------------");  
            netpurchased = (float)( totalgst - totalrebate - totaldiscounts);//calculate the net total of price that user need to pay
            netpurchased = bundar( netpurchased, 2);//round off the net total price to two decimal places
            System.out.println("Net Purchased : RM" + String.format("%.2f",netpurchased));//display the net of total of price
           
            float amountpay = 0.0f;//variable to insert the value that user give to pay the item
            //If the value less than the net total of price
            while ( amountpay < netpurchased){
            String pay = JOptionPane.showInputDialog(null,"You can pay now :)","Transaction System",JOptionPane.QUESTION_MESSAGE);//display the message for user to key in value to pay the net of total price
            amountpay = Float.parseFloat(pay);
            //To display the error message if the value has not enough to pay the net of total price of item
            if ( amountpay < netpurchased){
                JOptionPane.showMessageDialog(null,"Your cash is not enough!","Transaction System",JOptionPane.ERROR_MESSAGE);//display the error message if the value is not enough
            }//end of the if else
            
            }// end of the while
            System.out.println("Amount Paid : RM" + String.format("%.2f",amountpay));//display the amount the user key in to pay the net of total price
            float change = 0.0f;//variable to calculate the change after the amountpay minus the net of total price
            change = ((-1)*(netpurchased - amountpay));//to calculate the the changes of user money
            System.out.println("Changed : RM" + String.format("%.2f",change));//display the changes of user money
            System.out.println("------------------------------------------------------------------------------");
            
        }//end of the else
        
    }//end of the main
    
    //method to change the float number into two decimal places
    public static float bundar(float q , int c){
        BigDecimal big = new BigDecimal(q);//declaration of new object
        big = big.setScale(c,BigDecimal.ROUND_HALF_UP);
        return big.floatValue();//return the value that has two decimal places
    }
    
    
}
//class to calculate the rebate 
class Rebate{
    //method to calculate the rebate
    public int kira(int d){
      d += 25;//add RM25 for the rebate
      return d;//return the rebate value 
    }//end of the kira method
}
//class to calculate the GST
class GST{
    float r = (float) 0.0f;//variable to calculate the total GST
    float s = (float) 0.0f;//variable to calculate the total GST
    public float count(float e){
        r = (float) ((0.06f) * e);//calculate the value of GST
        s = (float)(r + e);//the sum of total price + GST
        return s;//return the sum of total price + GST
    }//end of count method
}
//class to calculate the discount
class Discounts{
    //To calculate the total of discount
    public float calc( float f){
        float s = (float)0.0;
        if ( (f > 200) && (f <= 500)){//if the total price more than RM200
            System.out.println("Discount : 10%");//display the 10% discount
            s = (float) ((0.1) * f);//calculate the 10% discount
        }else if( (f > 500) && (f <= 1000)){//if the total price more than 500
            System.out.println("Discount : 20%");//display the 20% discount
            s = (float) ((0.2) * f);//calculate the 20% discount   
        }else if ( (f > 1000) && (f <= 2000)){//if the total price more than 1000
            System.out.println("Discount : 30%");//display the 30% discount
            s = (float) ((0.3) * f);//calculate the 30% discount 
        }else if ( f > 2000){//if the total price more than 2000
            System.out.println("Discount : 50%");//display the 50% discount
            s = (float) ((0.5) * f);//calculate the 50% discount 
        }//end of the if else
        return s;//return the value discount
    }//end of the method
}//end of the discounts class
