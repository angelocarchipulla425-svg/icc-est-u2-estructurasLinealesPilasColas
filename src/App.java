
import java.util.Stack;
import utils.SignValidator;
import utils.StackSorter;
import utils.QueuePalindrome;

public class App {

    public static void main(String[] args) {
        runSignValidator();
        runStacksSorter();
        runQueuePalindrome();
    }

    private static void runSignValidator() {
        SignValidator signValidator = new SignValidator();

        String cadena1 = "{[()]}";
        String cadena2 = "{[(])}";

        System.out.println("Ejercicio 01: Validacion de Signos");
        System.out.println("Cadena: " + cadena1 + " | Resultado: " + signValidator.isValid(cadena1));
        System.out.println("Cadena: " + cadena2 + " | Resultado: " + signValidator.isValid(cadena2));
    }

    private static void runStacksSorter() {
        Stack<Integer> stack = new Stack<>();

        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(5);

        StackSorter sorter = new StackSorter();

        System.out.println("\nEjercicio 02: Ordenar Stack");
        System.out.println("Stack original: " + stack);

        sorter.sortStack(stack);

        System.out.println("Stack ordenado: " + stack);
        System.out.println("Tope esperado: " + stack.peek());
    }

    private static void runQueuePalindrome() {
        QueuePalindrome queuePalindrome = new QueuePalindrome();

        System.out.println("\nEjercicio 03: Palíndromo usando Colas");
        System.out.println("ana   | Resultado: " + queuePalindrome.isPalindrome("ana"));
        System.out.println("radar | Resultado: " + queuePalindrome.isPalindrome("radar"));
        System.out.println("java  | Resultado: " + queuePalindrome.isPalindrome("java"));
    }
}