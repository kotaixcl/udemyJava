import java.util.Random;

public class ProbarRamdomMetodos {
    public static void main(String[] args) {
        final var random = new Random();

        final var randomInt = RandomUtilities.generarRandomInt(100,1,random);
        final var randomDec = RandomUtilities.generarRandomDouble(15.2,0.5,random);

        System.out.printf("entero :%d%n", randomInt );
        System.out.printf("decimal :%.2f%n", randomDec);

    }

}
