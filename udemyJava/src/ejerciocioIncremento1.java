import java.util.Scanner;
public class ejerciocioIncremento1 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        var numero = ScannerManager.leerInt(scanner, "ingrese numero");
        scanner.close();
        numero++;
        System.out.printf("el numero es : %d%n", numero);

    }
}
