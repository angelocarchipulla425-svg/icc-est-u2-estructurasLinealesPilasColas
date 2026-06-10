package utils;

import java.util.Deque;
import java.util.LinkedList;

public class QueuePalindrome {
    
    public boolean isPalindrome(String text) {
        // Instanciamos la cola de doble extremo
        Deque<Character> queue = new LinkedList<>();
        
        // Encolamos cada carácter del texto (se insertan al final de la cola)
        for (char c : text.toCharArray()) {
            queue.addLast(c);
        }
        
        // Mientras haya más de un elemento en la cola, comparamos los extremos
        while (queue.size() > 1) {
            // Extraemos el primer elemento (aprovechando el FIFO por el frente)
            char first = queue.removeFirst();
            // Extraemos el último elemento (por el final)
            char last = queue.removeLast();
            
            // Si en algún punto los caracteres de los extremos no son iguales,
            // no es un palíndromo.
            if (first != last) {
                return false;
            }
        }
        
        // Si la cola se vacía (o queda 1 solo carácter en palabras impares)
        // y no hubo errores, entonces sí es un palíndromo.
        return true;
    }
}