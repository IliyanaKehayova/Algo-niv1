/* EXO1 : A l'aide de Scanner et Print, me faire afficher le résultat d'une addition de deux entiers        
 * 
 * 
* **********************AFFICHAGE ATTENDU ****************:
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a + b
 * 
 * resulat vaut 5
 * 
 * 
 * 
*/
import java.util.Scanner;

public class exo1{

    public static void main(String[] args){
        int a;
        int b;
        int result;
       
        
        Scanner clavier = new Scanner(System.in);
        System.out.println("La veleur de a");
        a = clavier.nextInt();
        System.out.println("La veleur de b");
        b = clavier.nextInt();

        result = a+b; 

        System.out.println("a+b="+result);
        clavier.close();
    }

}