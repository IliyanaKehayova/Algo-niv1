//Write a program to check whether the triangle is equilateral, isosceles or scalene triangle
import java.util.Scanner;
public class exoanglais12 {
    public static void main(String[] args){
        Scanner triangle = new Scanner(System.in);
    
        System.out.println("Write the size of the first angle of the triangle.");
        int entry1 = triangle.nextInt();
    
        System.out.println("Write the size of the secong angle of the triangle.");
        int entry2 = triangle.nextInt();

        System.out.println("Write the size of the third angle of the triangle.");
        int entry3 = triangle.nextInt();

    
        if ((entry1==entry2 && entry2==entry3) && entry1+entry2+entry3<=180){System.out.println("This triangle is an equilateral triangle.");}
        else if ((entry1==entry2 || entry1==entry3 || entry2==entry3) && entry1+entry2+entry3<=180){System.out.println("This triangle is an isosceles triangle.");}
        else if ((entry1!=entry2 || entry1!=entry3 || entry2!=entry3) && entry1+entry2+entry3<=180){System.out.println("This triangle is a scalene triangle.");}
        else {System.out.println("This is not a triangle");};
    
        triangle.close();
    }
}
