/* EXO11 : Avec PRINT & Scanner , vous allez simuler un distributeur de banque :
 * 
 * Vous avez 3000€ sur votre compte, créer un algo qui retire un montant sur votre compte banquaire
 * votre solde ne peut pas être négatif
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Bonjour, combien voulez-vous retirer ?
 * 
 * 3500
 * 
 * Opération refusée, fond insuffissant !
 * 
 * 
*/

import java.util.Scanner;
public class exo11 {
    public static void main(String[] args){

int a=3000;


    Scanner clavier = new Scanner(System.in);
        System.out.println("Bonjour, combien voulez-vous retirer ?");
        int answer = clavier.nextInt();

            if(answer<a){System.out.print("Veuillez prendre vos billets, ainsi que votre ticket.");}
            else{System.out.print("Opération refusée, font insuffisant.");};



    clavier.close();


    }

}
