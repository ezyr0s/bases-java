import java.util.Scanner;
public class tp3 {
    public static void main(String[] args) {
        var key = new Scanner(System.in);
        System.out.println("Entrez la valeur a :");
        int a = key.nextInt();
        System.out.println("Entrez la valeur b :");
        int b = key.nextInt();
        System.out.println("Entrez la valeur c :");
        int c = key.nextInt();
        int d = 0;
         d=a;
        a=c;
        c=b;
        b=d;
        System.out.print("Apres la permutation, a="+a+", b="+b+", c="+c);



    }
}
