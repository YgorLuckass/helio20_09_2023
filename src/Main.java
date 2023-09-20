import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);

        int a  = leia.nextInt();
        int b = leia.nextInt();
        int c = leia.nextInt();

        if (a == b || a == c || b == c ) {
            System.out.println("Código inválido");
        }
        else if (a > c && a > b ){
            System.out.println("Maior número = " + a);
        }
        else if (b > a && b > c) {
            System.out.println("Maior número = " + b);
        }
        else {
            System.out.println("Maior número = " + c);
        }

    }
}