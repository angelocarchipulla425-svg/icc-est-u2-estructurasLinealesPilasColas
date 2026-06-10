package utils;

import java.util.Stack;

public class StackSorter {
    
    public void sortStack(Stack<Integer> stack) {
        // Creamos una pila auxiliar temporal
        Stack<Integer> tempStack = new Stack<>();
        
        // Mientras la pila original no esté vacía
        while (!stack.isEmpty()) {
            // Sacamos el elemento del tope de la pila original
            int temp = stack.pop();
            
            // Si la pila temporal no está vacía y su tope es mayor que 'temp',
            // pasamos esos elementos de vuelta a la pila original.
            // Esto asegura que en la pila temporal los números mayores queden arriba.
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                stack.push(tempStack.pop());
            }
            
            // Ubicamos el 'temp' en su lugar correcto dentro de la pila temporal
            tempStack.push(temp);
        }
        
        // Al terminar, tempStack está ordenada de mayor a menor (mayor en el tope).
        // Vaciamos tempStack de vuelta a la pila original, invirtiendo el orden.
        // Así los elementos más pequeños quedan en el tope de la pila original.
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}