public class EjerciciosMatematicos {
    public static void main(String[] args) {
        final var velocidadInicial = 15.24;
        final var aceleracion = 3.75;
        final var tiempo = 5;
        final var velocidadFinal = velocidadInicial * aceleracion * tiempo ;//formula mruv
        System.out.printf("para una velocidad inicial %.3f , una aceleracion %.3f " +
                "y un tiempo de %d se tiene una velocidad final %.4f usando mruv"
                , velocidadInicial, aceleracion, tiempo,velocidadFinal);
    }
}
