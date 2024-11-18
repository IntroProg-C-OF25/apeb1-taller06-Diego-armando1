import java.util.Scanner;
public class resolucionExamen {
    public static void main(String[] args) {
        double acd1, ape1, aa1, acd2, ape2, aa2, bim1, bim2, acu30, recu = 0, totalFin, notaFinal;
        String estado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la nota ACD1 del primer bimestre: ");
        acd1 = teclado.nextDouble();
        System.out.println("Ingrese la nota APE1 del primer bimestre: ");
        ape1 = teclado.nextDouble();
        System.out.println("Ingrese la nota AA1 del primer bimestre: ");
        aa1 = teclado.nextDouble();
        System.out.println("Ingrese la nota ACD2 del segundo bimestre: ");
        acd2 = teclado.nextDouble();
        System.out.println("Ingrese la nota APE2 del segundo bimestre: ");
        ape2 = teclado.nextDouble();
        System.out.println("Ingrese la nota AA2 del segundo bimestre: ");
        aa2 = teclado.nextDouble();
        bim1 = (acd1 + ape1 + aa1);
        bim2 = (acd2 + ape2 + aa2);
        acu30 = (aa2 + aa1) / 2;
        totalFin = (bim1 + bim2) / 2;
        notaFinal = totalFin;
        if (totalFin < 6.5) {
            System.out.print("Esta en supletorios, dame tu nota: ");
            recu = teclado.nextDouble();
            notaFinal = recu + acu30;
        }
        estado = (notaFinal < 6.5) ? "Reprobado" : "Aprobado";
        System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n","NOMBRES", "ACDB1", "APEB1", "AAB1", "BIM1","ACDB2", "APEB2", "AAB2", "BIM2","TOTALFIN", "ACU30", "RECU", "FINAL", "ESTADO");
        System.out.printf("%s\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%s\n","Cristian", acd1, ape1, aa1, bim1, acd2, ape2, aa2, bim2, totalFin, acu30, recu, notaFinal, estado);
    }

}
