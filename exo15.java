/* EXO15 : Avec PRINT & SCANNER : Me créer un convertisseur de devise, Euros , Dollars et Livres Sterling
 * 
 * Vous devriez choisir votre devise en entrée et la devise en sortie
 * 
 * Attention on ne peut pas convertir les deux mêmes devises !
 * 
 * EUR : Euros
 * USD : Dollars
 * GBP : Livres Sterling
 * 
 * le lien ci-dessous vous donne la valeur des monnaies : https://www.boursorama.com/bourse/devises
 * 
 * ATTENTION ! : Montant doivent être décimaux , 2 chiffres après la virgule.
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * Quel est votre monnaie ?
 * 
 * EUR
 * 
 * Quel est votre montant ?
 * 
 * 100.00
 * 
 * Vous voulez la convertir en quelle devise ?
 * 
 * USD
 * 
 * Résultat : 113,82 USD
 * 
 * 
*/

import java.util.Scanner;

public class exo15 {
    public static void main(String[] args){

    

    Scanner clavier = new Scanner(System.in);


    System.out.println("Quelle est votre devise ? EUR/USD/GBP");
    String A = clavier.nextLine();

    System.out.println("Quelle est votre montant ?");
    double B = clavier.nextDouble();
    clavier.nextLine();
 
    System.out.println("Vous voulez convertir en quelle devise ? EUR/USD/GBP");
    String C = clavier.nextLine();


    if(A.equals("EUR")&&C.equals("USD")){
        System.out.println("Résultat : "+(B*1.14)+" USD");};
       

    if(A.equals("EUR")&&C.equals("GBP")){
        System.out.println("Résultat : "+(B*0.85)+" GBP");};
       

    if(A.equals("USD")&&C.equals("EUR")){
        System.out.println("Résultat : "+(B*0.88)+" EUR");};
        

    if(A.equals("USD")&&C.equals("GBP")){
        System.out.println("Résultat : "+(B*0.75)+" GBP");};
       

    if(A.equals("GBP")&&C.equals("EUR")){
        System.out.println("Résultat : "+(B*1.18)+" EUR");};
        

    if(A.equals("GBP")&&C.equals("USD")){
        System.out.println("Résultat : "+(B*1.34)+" USD");};
    
    
    clavier.close();


}
}
