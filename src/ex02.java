import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);

        double lado1 = leia.nextDouble();
        double lado2 = leia.nextDouble();
        double lado3 = leia.nextDouble();

        if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3){
            System.out.println("Triângulo equilátero ");
        }
        else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            System.out.println("Triângulo isóscele");
        }
        else {
            System.out.println("Triangulo Escaleno");
        }


    }
}
