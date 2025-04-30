/* EXO3 : A l'aide de Scanner et Print, me faire afficher le résultat d'une addition (types entiers) et vérifier si elle est pair ou impaire     
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a + b
 * 
 * resultat = 5
 * 
 * resultat est impaire
 * 
 * 
 * 
*/
import java.util.Scanner;
public class exo3{
    public static void main(String[] args){
       
        int a;
        int b;
        int addition;
       
        
        Scanner clavier = new Scanner(System.in);
        System.out.println("La veleur de a");
        a = clavier.nextInt();
        System.out.println("La veleur de b");
        b = clavier.nextInt();

        addition = a+b; 

        clavier.close();
        
        System.out.println("a+b="+addition);
        if(addition%2==0){
            System.out.print(addition+" est pair");

        }else{System.out.print(addition+" est impair");}
    }

}
