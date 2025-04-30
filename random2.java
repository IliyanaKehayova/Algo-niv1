import java.util.Scanner;
public class random2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); /* creation d un nouvel objet */
        System.out.print("Entrez un message : ");

        String message = sc.nextLine();

          System.out.println(message);
          sc.close();

}
}
