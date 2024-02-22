public class EjercicioConversion1 {
    public static void main(String[] args) {
        final var p1 = "23.45";
        final var p2 = "293.45";
        final var p3 = "3.98";

        final var suma = calcularSuma(p1,p2,p3);
        //imprimirSuma(suma);
        System.out.println(suma);
    }
    static double calcularSuma (String precio1, String precio2, String precio3){
        final var precio1Double = Double.parseDouble(precio1);
        final var precio2Double = Double.parseDouble(precio2);
        final var precio3Double = Double.parseDouble(precio3);
        return  precio1Double + precio2Double + precio3Double;
    }
}
