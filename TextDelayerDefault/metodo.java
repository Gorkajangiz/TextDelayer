/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TextDelayerDefault;

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

    public void delayer(int num, String frase) {
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
        for (int i = 0; i < frase.length(); i++) {
            System.out.print(frase.charAt(i));
            try {
                TimeUnit.MICROSECONDS.sleep(velocidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(metodo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("");
    }
}
