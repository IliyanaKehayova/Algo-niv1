//Write a program to check whether a number is negative, positive or zero
import java.util.Scanner;

public class exoanglais1 {
    public static void main(String[] args){

        Scanner calculator = new Scanner(System.in);

        System.out.println("Saisissez un chiffre.");
        int entry = calculator.nextInt();

if(entry<0){System.out.println(entry+" est inférieur à 0.");}
else if (entry==0){System.out.println(entry+" est égal à 0.");}
else if (entry>0){System.out.println(entry+" est supérieur à 0.");};

calculator.close();
}}
