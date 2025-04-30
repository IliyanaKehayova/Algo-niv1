/* EXO2 : A l'aide de Scanner et Print, me faire afficher le résultat d'une soustraction (types entiers) et vérifier si elle est inférieur à 0    
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a - b
 * 
 * resultat = -1
 * 
 * resutat est inférieur à 0
 * 
 * 
 * 
 */
import java.util.Scanner;
public class exo2{
    public static void main(String [] args){
        int a;
        int b;
        int soustraction;
        Scanner clavier = new Scanner(System.in);
        System.out.println("La valeur de a");
        a = clavier.nextInt();
        System.out.println("La valeur de b");
        b = clavier.nextInt();
        soustraction = a-b;
        System.out.println("a-b= "+soustraction);
        if(soustraction<10){System.out.println("Le resultat est inferieur a 10");}
        else{System.out.println("Le résultat est superieur ou egal a 10");}
        clavier.close();
    }
}

