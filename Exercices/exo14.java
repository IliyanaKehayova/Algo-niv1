/* EXO14 : Avec PRINT & SCANNER : Tester l'expression algèbrique booléenne A OU B ET NON C
 * 
 * A , B ou C sont des booléens et ne peuvent être qu'égale à TRUE ou FALSE.
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Donner une valeur A OU B ET NON C
 * 
 * FALSE
 * TRUE
 * FALSE
 * 
 * Résultat : TRUE
 * 
 * 
 * 
 * 
 * 
*/

import java.util.Scanner;

public class exo14 {
    
public static void main(String[] args){

    Scanner clavier = new Scanner(System.in);




    System.out.println("Donnez une valeur à A (true/false)");
    boolean A = clavier.nextBoolean();

    System.out.println("Donnez une valeur à B (true/false)");
    boolean B = clavier.nextBoolean();

    System.out.println("Donnez une valeur à C (true/false)");
    boolean C = clavier.nextBoolean();

System.out.print("Résultat : "+(A|B&!C));

    clavier.close();


}
}