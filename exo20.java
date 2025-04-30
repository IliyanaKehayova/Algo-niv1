/* EXO20 : Avec PRINT & SCANNER : 
 * 
 * Vous allez créer un algo de sondage pour des élections, 
 * la candidate Joseline Inutile et le candidat Vincent Escreau pour la mairie de Mulhouse.
 * Vous avez 150 000 votants, donnez le nombre de votant pour Escreau et pour Inutile, et le nombre de vote blanc
 * Si le total des votes n'est pas atteint, les votes manquants seront comptés blanc
 * Si le total de vote est supérieur aux nombres de votants alors il y a une erreur
 * Puis calculez en pourcentage en fonction du nombres de votants ( ceux qui n'ont pas voter blanc)
 * Le score en pourcentage, le gagnant doit avoir plus de 60% sinon il devra y avoir un second tour :
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
* Combien de gens ont voté pour Joseline Inutile ?
 * 
 * 100 000
 * 
* Combien de gens ont voté pour Vincent Escreau ?
 * 
 * 20 000
 * 
* Vous avez 30 000 d'abstentions, ils seront compté nul
 * 
 * 
 * Joseline Inutile : 66.7%
 * 
 * Vincent Escreau : 33.3%
 * 
 * 
 * Joseline Inutile est la nouvelle maire de Mulhouse
 * 
 * 
*/
import java.util.Scanner;
public class exo20 {
    public static void main(String[] args){

    Scanner elections = new Scanner(System.in);

    int votes=150000;

        System.out.println("Combien de personnes ont voté pour Jocelyne Inutile ? ");
        int Jocelyne = elections.nextInt();
        
        System.out.println("Combien de personnes ont voté pour Vincent Escreau ? ");
        int Vincent = elections.nextInt();

        int abstention=votes-Jocelyne-Vincent;

        System.out.println("Vous avez "+abstention+" d'abstentions, ils seront comptés nuls. \n");

        int pourcentageJocelyne=Jocelyne*100/votes;
        int pourcentageVincent=Vincent*100/votes;

        System.out.println("Resultats : \n"+pourcentageJocelyne+"% \n"+pourcentageVincent+"%");

        if(pourcentageJocelyne>pourcentageVincent){System.out.print("Jocelyne Intutile est la nouvelle Maire de Mulhouse !");}
        else{System.out.println("Vincent Escreau est le nouveau Maire de Mulhouse !");};





elections.close();

    }
}
