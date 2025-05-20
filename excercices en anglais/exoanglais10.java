//Write a program to input angles of a triangle and check whether triangle is valid or not
import java.util.Scanner;
public class exoanglais10 {
    public static void main(String[] args){
    Scanner triangle = new Scanner(System.in);

    System.out.println("Write the size of the first angle of the triangle.");
    int entry1 = triangle.nextInt();

    System.out.println("Write the size of the secong angle of the triangle.");
    int entry2 = triangle.nextInt();

    if (entry1+entry2>=180){System.out.println("This triangle is not valid");}
    else if (entry1+entry2<=180){System.out.println("This triangle is valid");};

    triangle.close();
}
}
