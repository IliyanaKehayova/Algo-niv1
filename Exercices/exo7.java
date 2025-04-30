/* EXO7 : A l'aide de Scanner et Print, créer un questionnaire, "Do you speak english ?", répondre yes ou no, puis retourner le messages suivants 
 * 
 * si FALSE "So learn english !"
 * 
 * Si TRUE "Nice to meet you"
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Do you speak english (Y/N)?
 * 
 * Y (Tapez Y)
 * 
 * "Nice to meet you"
 * 
 * 
 * 
*/
import java.util.Scanner;
public class exo7 {
    public static void main(String[] args){
      
        Scanner clavier = new Scanner(System.in);

        System.out.println("Do you speak English? (Y/N)");
        String answer = clavier.nextLine();

        if(answer.equalsIgnoreCase("Y")){System.out.println("Nice to meet you");}
        else{System.out.println("So learn English!");}
           
        
        clavier.close();

    }}