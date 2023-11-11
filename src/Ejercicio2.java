import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio2 {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("Manzana","Callejón","submarino","locura","Clubes de Futbol"));

        //Aplico una expresión para hacer todo mayúsculas
        TrabajarCadenas mayusculas = (recibe)->recibe.toUpperCase();
        lista.forEach(valor-> System.out.println(mayusculas.cadena(valor)));
//        //Aplico una expresión para hacer todo minúsculas
//        TrabajarCadenas minusculas = (recibe2)->recibe2.toLowerCase();
//        lista.forEach(unObjeto-> System.out.println(minusculas.cadena(unObjeto)));
//        //A ver que otra expresión puedo probar
//        System.out.println();
//        System.out.println("Busco las cadenas que empiecen con una letra especifica");
//        TrabajarCadenas otra = (aver)-> String.valueOf(aver.startsWith("C"));
//        lista.forEach(prueba-> System.out.println(otra.cadena(prueba)));
//        //Alguna otra función
//        System.out.println();
//        System.out.println("Busco las cadenas con una o");
//        TrabajarCadenas prueba2 = (viene)->String.valueOf(viene.contains("o"));
//        lista.forEach(tomo-> System.out.println(prueba2.cadena(tomo)));
    }
}
