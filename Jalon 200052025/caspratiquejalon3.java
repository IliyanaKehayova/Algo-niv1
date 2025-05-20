/*Algorithme qui permet de voir si oui ou non on est égligible pour le remplacement de notre voiture suite à un accident  en fonction des conditions suivantes:

- rouler à moins de 130km/h
- ne pas se placer derrière le véhicule entré en collision
- Si on a plus de 150 000km au compteur, le contrôle technique doit dater de max 2 ans
- Si on a moins de 150 000km au compteur, le controle technique doit date de maximum 5 ans
 * 
 */

import java.util.Scanner; 
public class caspratiquejalon3 {
     public static void main(String[] args){
        Scanner car = new Scanner(System.in); 

        int speed;
        boolean position;
        int miliage;
        int insurance;

        System.out.println("Le véhicule roulait à quelle vitesse ?");
        speed = car.nextInt();

        System.out.println("Etiez-vous derrière le véhicule en collision ? true/false");
        position = car.nextBoolean();
        car.nextLine();

        System.out.println("Vous avez combien de kilomètres au compteur ?");
        miliage = car.nextInt();

        System.out.println("A combien d'années date votre dernier contrôle technique ? en nombre d'années, 0 s'il estmoins d'1 an");
        insurance = car.nextInt();

        boolean oldinsurance; //nouvelle variable pour savoir si le controle technique pour plus de 150 000 km est valable
        if (miliage>150000 && insurance<2)
        {oldinsurance=true;}
        else{oldinsurance=false;};


        boolean newinsurance; //nouvelle variable pour savoir si le controle technique pour moins de 150 000 km est valable
        if (miliage<150000 && insurance<5)
        {newinsurance=true;}
        else {newinsurance=false;};



if (speed<130 && position==false && oldinsurance==true){System.out.print("Au vu des élements vous êtes bien éligible pour le remplacement de votre voiture");} //si la vitesse est inférieure à 130 et si on n'était pas derrière le véhicule lors de la collision et si on a  150 000 dans le compteur avec un CT datant de moins de 2 ans on est éligible
else if (speed<130 && position==false && newinsurance==true){System.out.print("Au vu des élements vous êtes bien éligible pour le remplacement de votre voiture");} //si la vitesse est inférieure à 130 et si on n'était pas derrière le véhicule lors de la collision et si on a 150 000 au compteurs avec un CT datant de moins de 5 ans on est éligible

else {System.out.print("Au vu des élements vous n'êtes pas éligible pour le remplacement de votre voiture");}; //sinon on n'est pas éligible pour le remplacement du véhicule



car.close();


    }

}
