/* EXO12 : Avec PRINT & Scanner , vous allez me créer un algo 
 * qui applique une réduction (en pourcentage %) sur un prix (en décimal) donnée :
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Votre prix ?
 * 
 * 100.00
 * 
 * Votre réduction (en pourcentage %) ?
 * 
 * 20
 * 
 * 
 * Prix après réduction de 20% :
 * 
 * 80.00
 * 
 * 
 * 
*/

import java.util.Scanner;

public class exo12{
    
    public static void main(String[] args){






    Scanner clavier = new Scanner(System.in);
        System.out.println("Votre prix ?");
        int answer = clavier.nextInt();

        System.out.println("Votre reduction en pourcentage : ?");
        int answerp = clavier.nextInt();

        System.out.println("Votre prix apres la reduction de "+answerp+" :");
        System.out.println(answer-answer*answerp/100);

    clavier.close();


    }}



