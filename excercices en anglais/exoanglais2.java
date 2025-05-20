//Write a program to check whether a number is divisible by 5 and 11 or not

import java.util.Scanner;

public class exoanglais2 {
    public static void main(String[] args){

        Scanner calculator = new Scanner(System.in);

        System.out.println("Saisissez un chiffre.");
        int entry = calculator.nextInt();

        int result=entry%5;
        int secondresult=entry%11;


        if(result==0 && secondresult==0){System.out.println("Ce chiffre est divisible par 5 et 11.");}
        else if (result==0){System.out.println("Ce chiffre est divisible par 5 uniquemement.");}
        else if (secondresult==0){System.out.println("Ce chiffre est divisible par 11 uniquemement.");}
        else {System.out.println("Ce chiffre n'est pas divisible ni par 5 ni par 11.");};

        calculator.close();
}}
