import java.util.Random;
import java.util.Scanner;

public class ejercicioDado {
    public static void main(String[] args) {
        //leer numero de teclado
        final var scanner = new Scanner(System.in);
        final var numeroIngresado = ScannerManager.leerInt(scanner,"escriba el numero entre 1 y 6");
        scanner.close();

       if (validaNumero(numeroIngresado)){
           final var random = new Random();
           final var numeroAleatorio =  RandomUtilities.generarRandomInt(6,1, random);
           mostrarGanador(numeroIngresado,numeroAleatorio);
       }else {
           System.out.println("numero no valido, ingrese nuevo numero");
       }


    }
    static boolean validaNumero (int numeroIngresado){
        return (numeroIngresado >= 1) && (numeroIngresado <=6);
    }
    static void mostrarGanador (int numeroIngresado, int numeroAleatorio){
        System.out.printf("el numero ganador es: %d%n", numeroAleatorio);
        if (numeroIngresado == numeroAleatorio){
            System.out.printf("ganaste");
        }else {
            System.out.printf("perdiste");
        }
    }
}
