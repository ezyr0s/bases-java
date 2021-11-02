import java.util.Scanner;
public class tp2 {
    public static void main(String[] args) {
var key=new Scanner(System.in);
System.out.println("Quel est votre nom ?");
String nom = key.nextLine();
System.out.println("Quel est votre prénom ?");
String prenom = key.nextLine();
System.out.println("Quel est votre age ?");
int age = key.nextInt();
System.out.println("Vous vous appelez "+nom+" "+prenom+", et vous avez "+age+" ans.");
    }
}
