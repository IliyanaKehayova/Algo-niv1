//Write a program to input any character and check whether it is alphabet, digit or special character
import java.util.Scanner;
public class exoanglais6 {
    public static void main(String[] args){

    

        Scanner alphabet = new Scanner(System.in);

        System.out.println("Write a single letter from the alphabet.");
        char entry = alphabet.next().charAt(0);

        if(Character.isDigit(entry)){System.out.println(entry+" is a number.");}
        else if(Character.isLetter(entry)){System.out.println(entry+" is a letter.");}
        else {System.out.println(entry+" is a special character.");};


        alphabet.close();
}
}
