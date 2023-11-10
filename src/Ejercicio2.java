import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio2 {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("Manzana","Callejón","submarinp","locura","Clubes de Futbol"));
        Mayusculas convierto = (entrada)-> entrada.toUpperCase();

        lista.forEach(entrada-> System.out.println(convierto.salida(entrada)));
    }
}
