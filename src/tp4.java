import java.util.Scanner;

public class tp4 {
    public static void main(String[] args) {
        var key=new Scanner(System.in);
        System.out.println("Quel est votre age ?");
        int age = key.nextInt();
        int anneeActuelle = 2021;
        int anneeNaissance = anneeActuelle - age;
        System.out.print("Vous êtes né en "+anneeNaissance);
    }

}
