# TextDelayer
Un método pensado para hacer que el texto salga en pantalla letra por letra (con un ligero retardo), 
selección de velocidad de salida y una función incorporada para que la frase salga más o menos rapida 
dependiendo del numero de letras que contenga. 

TextDelayerCons -> Utiliza un Consumer (elemento que no conozco aún) para enviar la impresión de letras individuales a 
la ventana (abre la posibilidad de implementarlo en ventanas, mientras que el otro solo lo permite en la consola).

TextDelayerDefault -> El método es el encargado de imprimir, por tanto solo funciona en la consola de comandos. 

--Implementación
Copia el método, renómbralo a tu gusto. 
Crea un metodo con su constructor en tu ejecutable y llama a la función "delayer", dandole como parametros 
un numero del 1 al 4 (Velocidades: 1 -> Lento 2 -> Normal 3 -> Rápido 4 -> Rapidísimo),
 la frase a imprimir y el Cons (en caso de usar el Consumer), es decir, System.out::print.
