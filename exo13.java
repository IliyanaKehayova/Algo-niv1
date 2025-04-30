/* EXO13 : Avec PRINT & SCANNER : Convertir du centimètre (Entier) au mètre (Double)
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Donner une taille en centimètre ?
 * 
 * 170
 * 
 * 170 cm vaut 1.70 m
 * 
 * 
 * 
 * 
 * 
 * 
*/
import java.util.Scanner;
public class exo13{



    public static void main(String[] args){

    Scanner clavier = new Scanner(System.in);


    System.out.println("Donnez une taille en centimetres ?");
    double answer = clavier.nextDouble();


    double convert=answer/100;

    System.out.println(answer+" cm vaut "+convert+" m");


clavier.close();


}
}

