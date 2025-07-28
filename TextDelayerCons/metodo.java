/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TextDelayerCons;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gorka
 */
public class metodo {

    public metodo() {
    }

    public void delayer(String[] sentences, Consumer<Character> cons) {
        //Comentar o eliminar y overridear con una selección de velocidad en los ajustes del programa
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona tu velocidad, por favor:");
        System.out.println("1. Lento");
        System.out.println("2. Normal");
        System.out.println("3. Rapido");
        System.out.println("4. Rapidísimo");
        Integer res = Integer.valueOf(sc.nextLine());
        sc.close();
        switch (res) {
            case 1 ->
                res = 4000;
            case 2 ->
                res = 2000;
            case 3 ->
                res = 1000;
            case 4 ->
                res = 500;
            default -> {
                sentences = new String[1];
                sentences[0] = "El número que has introducido no es válido, por favor prueba de nuevo";
                res = 2000;
            }
        }
        for (String sentence : sentences) {
            int velocidad = (res * 1000) / sentence.length();
            for (char c : sentence.toCharArray()) {
                cons.accept(c);
                try {
                    TimeUnit.MICROSECONDS.sleep(velocidad);
                } catch (InterruptedException ex) {
                    Logger.getLogger(metodo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("");
            System.out.println("");
            System.out.println("");
        }
    }
}
