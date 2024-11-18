import java.util.Scanner;
public class facturacion2Productos {
    public static void main(String[] args) {
        double costoProd1, costoProd2, iva, subTotal, descuento, costoFinal, subTotalIva, costoConDescuento, costoEnvio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame el costo del producto 1: ");
        costoProd1 = teclado.nextDouble();
        System.out.println("Dame el costo del producto 2: ");
        costoProd2 = teclado.nextDouble();
        System.out.println("Dame el costo del envio: ");
        costoEnvio = teclado.nextDouble();
        subTotal = costoProd1 + costoProd2;
        iva = subTotal * 0.10;
        descuento = subTotal * 0.05;
        subTotalIva = subTotal + iva;
        if (subTotal > 1000)
            descuento = subTotal * 0.20;
        else if (subTotal == 1000)
            descuento = subTotal * 0.05;
        else
            descuento = 0.0;   
        if (subTotal > 5000)
            costoEnvio = 0;
        costoConDescuento = subTotalIva - descuento;
        costoFinal = costoConDescuento + costoEnvio;
        System.out.println("El subtotal sin iva = " + subTotal);
        System.out.println("Iva (10%) = " + iva);
        System.out.println("El subtotal con iva es  = " + subTotalIva );
        System.out.println("Descuento aplicado es  = " + descuento);
        System.out.println("Costo de envio = " + costoEnvio);
        System.out.println("El costo final es = " + costoFinal);
        
    }
}
