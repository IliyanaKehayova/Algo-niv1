/* EXO10 : Créer un quizz de 5 questions, chaque question à deux réponses au choix VRAI OU FAUX, à chaque fois que vous répondez juste à une question 
vous gagnez un point
 * 
 * Après avoir répondu à vos 5 questions, vous avez le résultat final sur 5.
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Question 1 : 
 * 
 * 
*/
import java.util.Scanner;
public class exo10{
    public static void main(String [] args){

        
        Scanner clavier = new Scanner(System.in);
        int score = 0;

        System.out.println("Question 1 : Paris est la capitale de la France ? VRAI/FAUX");
        String answer1 = clavier.nextLine();
        if(answer1.equals("VRAI")){System.out.print("Bonne réponse, vous avez gagne 1 point. \n"); 
        score++;}
        else{System.out.print("Mauvaise réponse, vous ne gagnez pas de point. \n");};
        
    
        System.out.println("Question 2 : Il y a 7 continents sur notre planete ? VRAI/FAUX");
        String answer2 = clavier.nextLine();
        if(answer2.equals("VRAI")){System.out.print("Bonne réponse, vous avez gagne 1 point. \n");
        score++;}
        else{System.out.print("Mauvaise réponse, vous ne gagnez pas de point. \n");};

        System.out.println("QUESTION 3 : L'Allemagne est le pays le plus peuple au monde ? VRAI/FAUX");
        String answer3 = clavier.nextLine();
        if(answer3.equals("FAUX")){System.out.print("Bonne réponse, vous avez gagne 1 point. \n");
        score++;}
        else{System.out.print("Mauvaise réponse, vous ne gagnez pas de point. \n");};

        System.out.println("Question 4: La ville de Tokyo se trouve en Europe ? VRAI/FAUX");
        String answer4 = clavier.nextLine();
        if(answer4.equals("FAUX")){System.out.print("Bonne réponse, vous avez gagne 1 point. \n");
        score++;}
        else{System.out.print("Mauvaise réponse, vous ne gagnez pas de point. \n");};

        System.out.println("QUESTION 5 : Le Dalai Lama vient de Tibet ? VRAI/FAUX");
        String answer5 = clavier.nextLine();
        if(answer5.equals("VRAI")){System.out.print("Bonne réponse, vous avez gagne 1 point. \n");
        score++;}
        else{System.out.print("Mauvaise réponse, vous ne gagnez pas de point. \n");};

        System.out.println("\n Vous avez obtenu " + score + " point(s) sur 5.");
        
        clavier.close();
    }
}
