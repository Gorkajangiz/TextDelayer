package TextDelayerCons;

import java.util.Scanner;

/**
 * @author gorka
 */
public class main {

    public static void main(String args[]) throws InterruptedException {
        metodo m = new metodo();

        String[] sentences = {
            "Ejemplo 1, esta frase tiene aproximadamente 100 caracteres. Solo sirve para hacer una prueba visual.",
            "Ejemplo 2, esta frase tiene aproximadamente 400 caracteres. A medida que el texto crece, también lo hace la necesidad de gestionar mejor la sincronización para evitar que la impresión se sienta artificial. Una animación fluida puede mejorar la experiencia del usuario y dar la sensación de que algo más complejo está ocurriendo por detrás.",
            "Ejemplo 3, esta frase tiene aproximadamente 300 caracteres. Imprimir frases largas puede ser útil para simular una narración en consola. Cuanto más largo el texto, más evidente será el efecto visual de escritura progresiva, especialmente si el usuario presta atención a la velocidad.",
            "Ejemplo 4, esta frase tiene aproximadamente 200 caracteres. A veces, una frase larga ayuda a ver cómo se comporta la impresión carácter por carácter cuando el texto empieza a ser un poco más largo.", //            "1.2.3."
        };
//        Si quisiese meter solo una frase, haría lo siguiente:
//        m.delayer(new String[]{"Frase única a tratar"}, System.out::print);
        m.delayer(sentences, System.out::print);
    }
}
