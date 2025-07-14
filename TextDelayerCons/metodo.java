/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TextDelayerCons;

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

    public void delayer(int num, String frase, Consumer<Character> cons) {
        switch (num) {
            case 1 ->
                num = 4000;
            case 3 ->
                num = 1000;
            case 4 ->
                num = 500;
            default ->
                throw new IllegalArgumentException("Velocidad no válida");
        }
        int velocidad = (num * 1000) / frase.length();
        for (char c : frase.toCharArray()) {
            cons.accept(c);
            try {
                TimeUnit.MICROSECONDS.sleep(velocidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(metodo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("");
    }
}
