//Write a program to check whether a character is alphabet or not
import java.util.Scanner;
public class exoanglais4 {
    public static void main(String[] args){

    

        Scanner calculator = new Scanner(System.in);

        System.out.println("Write a single character.");
        char entry = calculator.next().charAt(0);

        if(Character.isDigit(entry)){System.out.println(entry+" is a number.");}
        else if(Character.isLetter(entry)){System.out.println(entry+" is a letter.");}
        else {System.out.println(entry+" is neither a number nor a letter.");};

        calculator.close();
}}

