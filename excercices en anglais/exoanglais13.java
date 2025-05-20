//Write a program to calculate profit or loss
import java.util.Scanner;
public class exoanglais13 {
    public static void main(String[] args){
        Scanner calculate = new Scanner(System.in);
    
        System.out.println("What is the cost price of this product ?");
        double costprice = calculate.nextDouble();

        System.out.println("What is the selling price of this product ?");
        double sellprice = calculate.nextDouble();
    
        double profitmargin=sellprice-costprice;

        if(profitmargin>0){System.out.print("Your profit is "+profitmargin+" dollars");}
        else if(profitmargin<0){System.out.print("Your profit loss is "+profitmargin+" dollars");};
    
        calculate.close();
    }
}
