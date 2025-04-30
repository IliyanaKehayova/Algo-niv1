import java.util.Scanner;
public class jalonblanc2 {
public static void main(String[] args){

    
int comptea = 5000;
int compteb = 400;



    Scanner argent = new Scanner(System.in);

    System.out.println("Veuillez indiquer le montant que vous souhaitez transférer du compte A au compte B. ");
    int transfert = argent.nextInt();

    comptea = comptea-transfert;
    compteb = compteb+transfert;

    System.out.println("Le montant restant sur le compte A est "+comptea+" euros et le montant restant sur votre compte B est "+compteb+" euros");


    
    argent.close();

}
}