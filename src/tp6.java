import java.util.Scanner;

public class tp6 {

    public static void main(String[] args) {
        var key = new Scanner(System.in);
        System.out.println("Entrez la valeur x :");
        int x = key.nextInt();
        System.out.println("Entrez la valeur y :");
        int y = key.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.print("Après la permutation, x=" + x + " et y=" + y);


    }
}
