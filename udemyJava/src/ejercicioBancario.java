import java.util.Scanner;

public class ejercicioBancario {
    public static void main(String[] args) {
    //leerCredito
        final var scanner = new Scanner(System.in);
        final var creditoIngresado = ScannerManager.leerDouble(scanner,"ingresa credito con ','");
        scanner.close();
       // calculaInteres(double creditoIngresado);
        imprimeResultado(creditoIngresado,calculaInteres(creditoIngresado));
    }
     static double calculaInteres(double credito){
        final var aumento1 = (credito % 2 == 0)? credito * 0.1 : 0; //si es par
         final var aumento2 = (credito % 3 == 0)?   500 : 0; //si es multiplo de 3
         final var aumento3 = (credito > 500)? 300 : 0; // si es menos de 500
         return credito + aumento3 + aumento1 + aumento2;
            }
    //imprime resultado
     static void imprimeResultado (double credito, double montoFinal){
         System.out.printf("para credito por %.2f se le cobrara un monto final de %.2f%n", credito, montoFinal);

    }
}
