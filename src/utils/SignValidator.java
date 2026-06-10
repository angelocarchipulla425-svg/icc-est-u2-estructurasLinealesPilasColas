package utils;

import java.util.Stack;

public class SignValidator {

    public boolean isValid(String s) {
    //Pila para almacenar los símbolos
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
           // Si es símbolo de cierre
            else if (c == ')' || c == '}' || c == ']'){
               // Si la pila está vacía, hay un cierre sin apertura
                if (stack.isEmpty()){
                    return false;
            }

                // Sacamos el último símbolo de apertura de la pila
                char top = stack.pop();

                // Verificamos que corresponda al tipo correcto
                if (c == ')' && top != '(' ) return false;
                if (c == '}' && top != '{' ) return false;
                if (c == ']' && top != '[' ) return false;
            }
        }
        return stack.isEmpty();
    } 
}
