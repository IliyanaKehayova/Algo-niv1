import java.util.Scanner;
public class jalonblanc3 {
public static void main(String[] args){


    Scanner conversion = new Scanner(System.in);

    System.out.println("Veuillez indiquer le prix HT. ");
    int montant = conversion.nextInt();

    System.out.println("Veuillez indiquer le taux de TVA. ");
    int tva = conversion.next();

    int prixttc = montant+montant*tva/100;

    System.out.println("Votre montant TTC est de "+prixttc+" euros");
   
    
    conversion.close();

}
}