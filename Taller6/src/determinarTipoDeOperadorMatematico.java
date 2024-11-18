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
