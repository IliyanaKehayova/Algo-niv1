/*Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:

Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F
*/
import java.util.Scanner;
public class exoanglais14 {
    public static void main(String[] args){

        Scanner school = new Scanner(System.in);

        System.out.println("What is the student's grade in Physics in % ?");
        int physics = school.nextInt();

        System.out.println("What is the student's grade in Chemistry in % ?");
        int chemistry = school.nextInt();

        System.out.println("What is the student's grade in Biology in % ?");
        int biology = school.nextInt();

        System.out.println("What is the student's grade in Mathematics in % ?");
        int mathematics = school.nextInt();

        System.out.println("What is the student's grade in Computer Science in % ?");
        int computer = school.nextInt();

        int finalgrade = (physics+chemistry+biology+mathematics+computer)/5;

        if (finalgrade>=90){System.out.print("The sdudent's final grade is A");}
        else if (finalgrade>=80){System.out.print("The sdudent's final grade is B");}
        else if (finalgrade>=70){System.out.print("The sdudent's final grade is C");}
        else if (finalgrade>=60){System.out.print("The sdudent's final grade is D");}
        else if (finalgrade>=40){System.out.print("The sdudent's final grade is E");}
        else if (finalgrade<=40){System.out.print("The sdudent's final grade is F");};

school.close();

    }

}
