/*calculer le salaire net à partir du salaire brut
en France les charges sociales sont de 23%
resultat attendu : Quel est le salaire brut
2500
Votre salaire NET sera de 1925.00 euros 
 * 
 * 
 * 
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class caspratiquejalon2 {
     public static void main(String[] args){


        Scanner money = new Scanner(System.in); 

       DecimalFormat f = new DecimalFormat();
       f.setMinimumFractionDigits(2); //Je déclare un format pour les valeurs pour laquelles je veux avoir juste deux chiffres apres la virgule, je connais la technique Math.round mais je préfère celle-ci gommennasai Eudes-sensei !!!! Marche aussi avec set.MaximumFractionDigit :)


double salary; //le montant du salaire qu'on va écrire après dans le terminal


System.out.print("Indiquez le montant de votre salaire BRUT.");
salary=money.nextDouble(); //dans le terminal on déclare la variable qui correspond au salaire brut

double aftertax = salary-salary*23/100; // le salaire net est égale au salaire brut moins les 23% de charges sociales

System.out.println("Le montant de vtre salaire NET est de "+f.format(aftertax)); //affiche le résultat final avec le format appliqué afin d'avoir deux chiffres après la virgule


money.close();


    }


}

