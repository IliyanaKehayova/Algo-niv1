//Write a program to check whether a character is uppercase or lowercase alphabet

import java.util.Scanner;

public class exoanglais7 {
    public static void main(String[] args){

    

        Scanner alphabet = new Scanner(System.in);

        System.out.println("Write a single letter from the alphabet.");
        char entry = alphabet.next().charAt(0);

        if(Character.isUpperCase(entry)){System.out.println(entry+" is an upper case letter.");}
        else if(Character.isLowerCase(entry)){System.out.println(entry+" is a lower case letter.");}
        else {System.out.println(entry+" is not a letter");};


        alphabet.close();
}
}
