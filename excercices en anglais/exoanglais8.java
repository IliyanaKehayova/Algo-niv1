//Write a program to input week number and print week day
import java.util.Scanner;
public class exoanglais8 {
   
        public static void main(String[] args){
    
        
    
            Scanner week = new Scanner(System.in);
    
            System.out.println("Write a number coresponding to a weekday. (1-7)");
            int entry = week.nextInt();
    
            switch(entry){
            case 1:
            System.out.println("Monday"); 
            break; 
            case 2:
            System.out.println("Tuesday"); 
            break; 
            case 3:
            System.out.println("Wednesday"); 
            break; 
            case 4:
            System.out.println("Thursday"); 
            break; 
            case 5:
            System.out.println("Friday"); 
            break; 
            case 6:
            System.out.println("Saturday"); 
            break; 
            case 7:
            System.out.println("Sunday"); 
            break; 
            }

            week.close();
    }
}
