import java.util.Scanner;
public class clasificacionDeUnTriangulo {
    public static void main(String[] args) {
        double lado1, lado2, lado3;
        String t = null;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la base del triangulo: ");
        lado1 = teclado.nextDouble();
        System.out.println("Ingrese la altura de un lado del triangulo: ");
        lado2 = teclado.nextDouble();
        System.out.println("Ingrese la altura del otro lado del triangulo: ");
        lado3 = teclado.nextDouble();
        if (lado1 + lado2 <= lado3 || lado2 + lado3 <= lado1 || lado1 + lado3 <= lado2) {
            System.out.println("No es un triangulo");
        } else 
            if (lado1 == lado2 && lado1 == lado3) {
            t = "Triangulo Equilatero";
        } else 
                if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                 t = "Triangulo Isosceles";
        } else 
                    if (lado1 != lado2 || lado2 != lado3 || lado1 != lado3) {
                     t = "Triangulo Escaleno";
        }
        System.out.printf("%s\t%s\t%s\t%s\n", "Lado 1", "Lado 2", "Lado 3", "Tipo de Triángulo");
        System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", lado1, lado2, lado3, t);
    }
}
