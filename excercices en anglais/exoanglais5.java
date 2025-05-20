//Write a program to input any alphabet and check whether it is vowel or consonant

import java.util.Scanner;
public class exoanglais5 {
    public static void main(String[] args){

    

        Scanner alphabet = new Scanner(System.in);

        System.out.println("Write a single letter from the alphabet.");
        char entry = alphabet.next().charAt(0);

        if(entry=='a' || entry=='e' || entry =='y' || entry =='u' || entry=='i' || entry=='o'){System.out.println(entry+" is a vowel.");}
        else {System.out.println(entry+" is a consonnant.");};

        alphabet.close();
}}



