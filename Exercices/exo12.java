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

import java.text.DecimalFormat;
import java.util.Scanner;

public class exo12{
    
    public static void main(String[] args){

    
double prix;
double reduc;
   
    DecimalFormat f = new DecimalFormat();
    f.setMaximumFractionDigits(2);

    DecimalFormat d = new DecimalFormat();
    d.setMaximumFractionDigits(0);  


    Scanner clavier = new Scanner(System.in);
        System.out.println("Votre prix ?");
        prix = clavier.nextDouble();

        System.out.println("Votre reduction en pourcentage : ?");
        reduc = clavier.nextDouble();

        System.out.println("Votre prix apres la reduction de "+(d.format(reduc))+" % :");
        System.out.println(f.format(prix-prix*reduc/100));

    clavier.close();


    }}



