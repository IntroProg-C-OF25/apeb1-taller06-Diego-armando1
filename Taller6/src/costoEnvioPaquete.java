import java.util.Scanner;
public class costoEnvioPaquete {
    public static void main(String[] args) {
        double pesoPa;
        String region;
        int costoEnvio = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el peso del paquete en kg: ");
        pesoPa = teclado.nextInt();
        System.out.println("Ingrese la region(local/nacional/otro): ");
        region = teclado.next().toLowerCase();
        if (pesoPa < 5 && region.equals("local")) {
            costoEnvio = 5;
        } else if (pesoPa >= 5 && pesoPa <= 10 && region.equals("nacional")) {
            costoEnvio = 10;
        } else {
            costoEnvio = 15;
        }       
        System.out.printf("%s\t%s\t%s\n", "Peso del paquete", "Región", "Costo del envío");
        System.out.printf("%.2f\t%s\t%d\n", pesoPa, region, costoEnvio);

    }
}
