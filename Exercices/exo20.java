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
 * ****
 * 
*/
import java.text.DecimalFormat;
import java.util.Scanner;
public class exo20 {
   
    public static void main(String[] args){
        
    DecimalFormat f = new DecimalFormat();
    f.setMaximumFractionDigits(2);

    DecimalFormat d = new DecimalFormat();
    d.setMaximumFractionDigits(0);

    Scanner elections = new Scanner(System.in);

    int votes=150000;

        System.out.println("Combien de personnes ont voté pour Jocelyne Inutile ? ");
        double Jocelyne = elections.nextDouble();
        
        System.out.println("Combien de personnes ont voté pour Vincent Escreau ? ");
        double Vincent = elections.nextDouble();

        double abstention=votes-Jocelyne-Vincent;
        double votes2=votes-abstention; 

        System.out.println("Vous avez "+d.format(abstention)+" d'abstentions, ils seront comptés nuls. \n");

        double pourcentageJocelyne=Jocelyne*100/votes2;
        double pourcentageVincent=Vincent*100/votes2;

        System.out.println("Resultats : \n"+f.format(pourcentageJocelyne)+"% \n"+f.format(pourcentageVincent)+"%");

        if(pourcentageJocelyne>pourcentageVincent){System.out.println("Jocelyne Intutile est la nouvelle Maire de Mulhouse !");}
        else{System.out.println("Vincent Escreau est le nouveau Maire de Mulhouse !");};



elections.close();

    }
}
