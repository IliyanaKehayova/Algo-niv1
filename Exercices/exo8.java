/* EXO8 : A l'aide de Scanner et Print, créer un formulaire d'inscription, où on vous demande de renseignez, votre prénom, votre nom, adresse email,
 *  mot de passe et confirmer votre mot de passe (ils doivent être identiques). Si les mots de passes ne sont pas identiques, 
 * ceci affiche "inscription annulée"
 * Sinon vous affichez le message suivant ci-dessous :
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Votre prénom ?
 * 
 * Eudes
 * 
 * Votre nom ?
 * 
 * Konda
 * 
 * Votre adresse ?
 * 
 * ekonda@arfp.asso.fr
 * 
 * votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * confirmer votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * Merci Eudes KONDA , votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse : ekonda@arfp.asso.fr
 * 
*/
import java.util.Scanner;
public class exo8{
    public static void main(String [] args){

        String a;
        String b;
        String c;
        String d;
        String e;

        Scanner clavier = new Scanner(System.in);

        System.out.println("Votre prénom ?");
        a = clavier.nextLine();
        System.out.println("Votre nom ?");
        b = clavier.nextLine();
        System.out.println("Votre adresse mail ?");
        c = clavier.nextLine();
        System.out.println("Votre mot de passe ?");
        d = clavier.nextLine();
        System.out.println("Confirmez votre mot de passe.");
        e = clavier.nextLine();

        
        if(d.equals(e)){System.out.println("Merci "+a+" "+b+", votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse "+c);}
        else{System.out.println("Inscription annulée !");};
        

        clavier.close();
    }
}
