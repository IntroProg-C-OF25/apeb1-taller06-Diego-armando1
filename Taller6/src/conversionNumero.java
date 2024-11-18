/***
 * Convertir un número de mes a nombre. Dado un número 
 * del 1 al 12, que representa un mes del año, muestra 
 * el nombre del mes correspondiente. Por ejemplo, si 
 * el usuario ingresa 1, debe mostrar "Enero"; si 
 * ingresa 2, debe mostrar "Febrero", y así sucesivamente.
 * @author hp
 */
import java.util.Scanner;
public class conversionNumero {
    public static void main(String[] args) {
        int numMes;
        String nomMes;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Deme un numero de mes: ");
        numMes = teclado.nextInt();
        switch (numMes)
        {
            case 1: nomMes = "Enero";
                    break;
            case 2: nomMes = "Febrero";
                    break;
            case 3: nomMes = "Marzo";
                    break;
            case 4: nomMes = "Abril";
                    break;
            case 5: nomMes = "Mayo";
                    break;
            case 6: nomMes = "Junio";
                    break;
            case 7: nomMes = "Julio";
                    break;
            case 8: nomMes = "Agosto";
                    break;
            case 9: nomMes = "Septiembre";
                    break;
            case 10: nomMes = "Octubre";
                     break;
            case 11: nomMes = "Noviembre";
                     break;
            case 12: nomMes = "Diciembre";
                     break;
            default: nomMes = "Número invalido";
        }
        System.out.printf("%s\t%s\n", "Numero de mes", "Nombre de mes");
        System.out.printf("%d\t%s\n", numMes, nomMes);
    }
    
}
