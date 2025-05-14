
import java.util.Scanner;
public class jalonblanc1 {
public static void main(String[] args){

    int age;




    Scanner mm = new Scanner(System.in);

    System.out.println("Quel âge avez-vous ? ");
    age = mm.nextInt();

if(age>=18){System.out.println("Vous êtes majeur(e) !");}
else{System.out.println("Vous êtes mineur(e) !");}


    
    mm.close();

}
}