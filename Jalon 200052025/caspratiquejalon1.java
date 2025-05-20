/*bouteille d'eau de 1L en fonction de la quantité désirée en CL
Si le 1L est dépassé alors on affiche le message "l reste encore X CL d'eau dans la bouteille" 
Si on dépasse on affiche "la bouteille d'eau est vide"

 * 
 * 
 * 
 */


import java.util.Scanner;

public class caspratiquejalon1 {
    public static void main(String[] args){


        Scanner drink = new Scanner(System.in);

int bottle = 100; //la quantité d'une bouteille d'eau d'1L = 100
int gulp;


System.out.print("Indiquez la quantité d'eau que vous souhaitez boire."); //On demande la quantité à soustraire
gulp = drink.nextInt(); 

int isleft=bottle-gulp; //la valeur de la quantité restante d'eau dans la bouteille

if (bottle>gulp){System.out.println("Il vous renste "+isleft+" de centilitres d'eau dans la bouteille");} //si la quantité d'eau dans la bouteill est supérieure à celle qu'on veut boire on affiche la quantité restante
else {System.out.println("Vous venez de tout boire. Il ne reste plus d'eau dans la bouteille.");}; //si on veut boire plus que la quantité d'eau dans la bouteille, on a un message comme quoi il n'en reste plus



drink.close();


    }


}
