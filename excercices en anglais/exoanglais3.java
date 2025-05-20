//Write a program to check whether a year is leap year or not
import java.util.Scanner;
public class exoanglais3 {
    public static void main(String[] args){

    

        Scanner calculator = new Scanner(System.in);

        System.out.println("Saisissez un chiffre.");
        int entry = calculator.nextInt();

        boolean leapyear=entry%4==0;
        leapyear=leapyear && (entry%100!=0 || entry%400==0);

        if(leapyear){System.out.println(entry+" is a leap year");}
        else {System.out.println(entry+" is not a leap year");}


        calculator.close();
}}


