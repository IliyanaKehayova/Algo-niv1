/* EXO17 : Avec PRINT & SCANNER : 
 * 
 * Créer un algo qui calcule les dépenses moyenne (en euros, en France) en carburant d'une voiture en fonction 
 * du type de carburant sur une distance en km. 
 * 
 * On consomme 6.5l / 100km pour l'essence
 * On consomme 5.5l / 100km pour le gazole
 * 
 * Les prix des carburants sont sur ce lien : https://carbu.com/france/prixmoyens
 * 
 * carburant par id
 * 
 * Gazole (B7) = 0
 * 
 * Sans Plomb 95 = 1
 * 
 * Sans Plomb 98 (E5) = 2
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Quel est le type de votre carburant ?
 * 
 * 0
 * 
 * Vous avez choisi : Gazole 
 * Quel est la distance à parcourir (en km) ?
 * 
 * 150
 * 
 * Pour 150 km, vous allez dépenser en moyenne 13.99€
 * 
 * /!\ ATTENTION : Le résultat doit être en décimal 2 chiffres après la virgules
 * 
*/

import java.text.DecimalFormat;
import java.util.Scanner;
public class exo17 {
    public static void main(String[] args){

        DecimalFormat f = new DecimalFormat();
        f.setMaximumFractionDigits(2);
  
        Scanner clavier = new Scanner(System.in);
        double prixgazole = 6.51;
        double prix95 = 6.51;
        double prix98 = 5.51;

        
        System.out.println("Quel est le type de votre carburant ? \n Gazole (B7) = 0 \n Sans Plomb 95 = 1 \n Sans Plomb 98 (E5) = 2");
        double gaz = clavier.nextDouble();

        if(gaz==0){System.out.println("Vous avez choisi Gazole");}
        else if(gaz==1){System.out.println("Vous avez choisi Sans Plomb 95");}
        else if(gaz==2){System.out.println("Vous avez choisi Sans Plomb 98 E5");};

        System.out.println("Quelle est la distance à parcourir (en km) ?");
        Double km = clavier.nextDouble();
        clavier.nextLine();

/*
 * (distance / 100 × consommation de carburant sur 100 km) 
 */
        if(gaz==0){System.out.println("Pour "+km+" km, vous allez dépenser en moyenne "+(f.format(km/100*prixgazole))+" euros");}
        else if(gaz==1){System.out.println("Pour "+km+" km, vous allez dépenser en moyenne "+(f.format(km/100*prix95))+" euros");}
        else if (gaz==2){System.out.println("Pour "+km+" km, vous allez dépenser en moyenne "+(f.format(km/100*prix98))+" euros");}

        clavier.close();
}}
