import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ejercicioListas {
    public static void main(String[] args) {
        //listas
        final var listaAlto = new ArrayList<String>();
        final var listaMedio = new ArrayList<String>();
        final var listaBajo = new ArrayList<String>();
        //arreglo con nombres
        final var arrayNombres = crearArregloNombres();
        //arreglo con imc
        final var arrayImc = crearArregloImc();
        //llenar listas
        rellenarListasImc(listaAlto, listaMedio,listaBajo,arrayNombres,arrayImc);
        //imprimir
        System.out.printf("Lista alto %s%n", listaAlto);
        System.out.printf("Lista alto %s%n", listaMedio);
        System.out.printf("Lista alto %s%n", listaBajo);


    }
    static String[] crearArregloNombres(){
        return new String[]  {"Carlos","Antonio","Jorge","Ana","Mayra","Julieta","Maria","Rodrigo","Anabel","Luz"};
    }
    static double[] crearArregloImc(){
        return RandomUtilities.generarRandomArrayDouble(10,50,1,new Random());
    }
    static void rellenarListasImc (List<String> listaAlto,List<String> listaMedio, List<String> listaBajo,String[] arrayNombres, double[]arrayImc){
        for (int i = 0; i < arrayImc.length; i++) {
            final var imc = arrayImc[i];
            if (imc >= 40){
                listaAlto.add(arrayNombres[i]);
            } else if (imc >= 25) {
                listaMedio.add(arrayNombres[i]);

            }else {
                listaBajo.add(arrayNombres[i]);
            }

        }
    }
}
