/***
 * Determinar el tipo de operación matemática. Dado un 
 * número del 1 al 4 que representa una operación 
 * matemática básica (suma, resta, multiplicación, 
 * división), muestra el nombre de la operación 
 * correspondiente. Por ejemplo, si el usuario 
 * ingresa 1, debe mostrar "Suma"; si ingresa 2, 
 * debe mostrar "Resta", y así sucesivamente.
 */
import java.util.Scanner;
public class determinarTipoDeOperadorMatematico {
    public static void main(String[] args) {
        int operacion;
        String operador;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero de operacion: ");
        operacion = teclado.nextInt();
        switch (operacion) 
        {
            case 1: operador = "Suma";
                    break;
            case 2: operador = "Resta";
                    break;
            case 3: operador = "Multiplicacion";
                    break;
            case 4: operador = "Division";
                    break;
            default: operador = "Numero invalido";
        }
         System.out.printf("%s\t%s\n", "Numero de operacion", "Operador");
         System.out.printf("%d\t%s\n", operacion, operador);
    }
    
}
