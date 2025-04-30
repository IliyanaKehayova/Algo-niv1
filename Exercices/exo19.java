/* EXO19 : Avec PRINT & SCANNER : 
 * 
 * Me créer un convertisseur de secondes au format heures : minutes : secontes
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
* Combien de secondes ?
 * 
 * 156000
 * 
 * 156 000 secondes correspond à 43 heures, 20 minutes et 0 seconde
 * 
*/

import java.util.Scanner;
public class exo19 {
    public static void main(String[] args){

    

        Scanner clavier = new Scanner(System.in);

        System.out.println("Combien de secondes ?");
        int temps = clavier.nextInt();

        int heures=temps/60;
        int minutes=heures/60;
        int secondes=minutes/60;

        System.out.println(temps+" secondes correspond à "+heures+" heures "+minutes+" minutes "+secondes+" secondes ");

        clavier.close();
}}
