//Write a program to input all sides of a triangle and check whether triangle is valid or not
import java.util.Scanner;
public class exoanglais11 {
    public static void main(String[] args){
        Scanner triangle = new Scanner(System.in);
    
        System.out.println("Write the size of the first side of the triangle.");
        int entry1 = triangle.nextInt();
    
        System.out.println("Write the size of the secong side of the triangle.");
        int entry2 = triangle.nextInt();

        System.out.println("Write the size of the third side of the triangle.");
        int entry3 = triangle.nextInt();

    
        if (entry1+entry2>entry3 || entry1+entry3>entry2 || entry3+entry2>entry2 ){System.out.println("This triangle is valid");}
        else {System.out.println("This triangle is not valid");};
    
        triangle.close();
    }
}
