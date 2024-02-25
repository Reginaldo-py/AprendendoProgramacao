package programas;
import java.util.Scanner;

import entities.Rectangle;

public class app2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Entre com os dados do Rectangle: ");

        System.out.println();
        System.out.println("Width: ");
        rectangle.width = sc.nextDouble();

        System.out.println();
        System.out.println("Height: ");
        rectangle.height = sc.nextDouble();

        System.out.println();
        double area = rectangle.Area();
        System.out.println("Área do retângulo: " + area);

        double perimetro = rectangle.Perimeter();
        System.out.println("O perimetro do retangulo e: " + perimetro);

        double Diagonal = rectangle.Diagonal();
        System.out.println("A Diagonal do retangulo e: " + Diagonal);
    }
}
