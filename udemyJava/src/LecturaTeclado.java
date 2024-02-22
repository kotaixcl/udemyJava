import java.util.Scanner;

public class LecturaTeclado {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        System.out.printf("ingresa edad: ");
        final var edad = scanner.nextInt();
        System.out.printf ("ingresa estatura : ");
        final var altura = scanner.nextDouble();

        scanner.close();

        imprimirResultado(edad, altura);

    }
  static void imprimirResultado(int edad, double altura)  {
      System.out.printf("tu edads es %d y tu altura es %.2f%n", edad, altura);
  }
}
