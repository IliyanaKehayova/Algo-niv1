/* EXO9 : La suite de l'EXO 8, une fois l'inscription terminé, essayez de vous connecter en donnant l'email et le mot de passe correspondant.
 * 
 * Si l'email ou le mot de passe n'est pas vous afficher "connexion refusée"
 * 
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
 * Pour vous connecter, renseignez votre email ?
 * 
 * ekonda@arfp.asso.fr
 * 
 * Renseignez votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * 
 * 
*/
import java.util.Scanner;

public class exo9{
    public static void main(String [] args){

        String a;
        String b;
        String c;
        String d;
        String e;
        String f;
        String g;

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
        
        
        if(d.equals(e)){System.out.println("Merci "+a+" "+b+", votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse "+c);
    
        System.out.println("Pour vous connecter renseignez votre mail.");
        f = clavier.nextLine();
        System.out.println("Renseignez votre mot de passe.");
        g = clavier.nextLine();

        if(c.equals(f)&&d.equals(g)){System.out.println("Connexion reussite !");}
        else{System.out.println("Connextion refusee !");};
}
        else{System.out.println("Inscription annulée !");};
        

        
        clavier.close();
    }
}
