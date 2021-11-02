import java.util.Scanner;

public class tp1 {
    public static void main(String[] args) {

        var key=new Scanner(System.in);
        double d = key.nextInt();
        double r = d/2;
        double s = r*r*Math.PI;
        System.out.printf("La surface est %f",s);
    }
}
