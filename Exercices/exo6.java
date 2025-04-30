/* EXO6 : A l'aide de Scanner et Print, donnez moi votre prénom et votre âge, pour l'affichage sous la forme d'une phrase dynamique
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * prenom = "Eudes"
 * 
 * age = 32
 * 
 * Je m'appelle Eudes , j'ai 32 ans
 * 
 * 
 * 
*/
import java.util.Scanner;
public class exo6 {
    public static void main(String[] args){
        String a;
        int b;
        

        Scanner clavier = new Scanner(System.in);
        System.out.print("Quel est votre prenom ? ");
        a = clavier.nextLine();
        System.out.print("Quel age avez vous ? ");
        b = clavier.nextInt();
        
    
        System.out.print("Je m'appelle "+a+" et j'ai "+b+" ans.");
clavier.close();

    }}