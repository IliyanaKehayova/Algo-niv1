/* EXO5 : A l'aide de Scanner et Print, créer une équation  A multiplié par B et divisé par C (tous types entiers), 
récupérer le résultat et vérifier si elle inférieure ou supérieure à 10
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * equation = (EQUATION)
 * 
 * equation = 15
 * 
 * 
 * equation est superieure
 * 
*/
import java.util.Scanner;
public class exo5{
    public static void main(String[] args){
        float a;
        float b;
        float c;
        float equation;

        Scanner clavier = new Scanner(System.in);
        System.out.print("La valeur de a est ");
        a = clavier.nextInt();
        System.out.print("La valeur de b est ");
        b = clavier.nextInt();
        System.out.print("La valeur de c est ");
        c = clavier.nextInt();
        
        equation = a*b/c;
        System.out.print("a+b= "+equation+"; ");

        if(equation>15){System.out.print("L equation est superieure a 15");}
        else{System.out.print("L equation est inferieure a 15");}
        clavier.close();
    }}