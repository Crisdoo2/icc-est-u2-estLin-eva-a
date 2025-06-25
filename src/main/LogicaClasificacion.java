package main;

import java.util.*;

public class LogicaClasificacion {

    /**
     * Invierte el contenido de una cola de nombres utilizando una pila auxiliar.
     * 
     * Ejemplo:
     * Entrada: ["Ana", "Luis", "Pedro"]
     * Salida: ["Pedro", "Luis", "Ana"]
     *
     * @param cola cola original de nombres
     * @return nueva cola con los nombres en orden invertido
     */
    public Queue<String> invertirColaNombres(Queue<String> cola) {
        Stack<String> pilaAuxiliar = new Stack<>();
        Queue<String> nuevaCola = new LinkedList<>();
        while (!cola.isEmpty()) {
            String nombre = cola.poll();
            pilaAuxiliar.push(nombre);
            }
            while (!pilaAuxiliar.isEmpty()) {
                nuevaCola.add(pilaAuxiliar.pop());
            }
            return nuevaCola;
        //return new LinkedList<>(Arrays.asList());// Simulación de resultado
    }

    /**
     * Verifica si la palabra formada por los elementos de una cola es un
     * palíndromo.
     *
     * Se considera que la cola contiene letras individuales como strings.
     * Ejemplo:
     * Entrada: ["r", "a", "d", "a", "r"] → true
     * Entrada: ["c", "a", "s", "a"] → false
     *
     * @param cola Cola de letras en minúsculas
     * @return true si forman un palíndromo, false si no
     */
    public boolean verificarPalindromoCola(Queue<String> cola) {
        Stack<String> pilaAuxiliar = new Stack<>();
        while (!cola.isEmpty()) {
            String letra = cola.poll();
            pilaAuxiliar.push(letra);
        }
        while (!pilaAuxiliar.isEmpty()) {
            String letra = pilaAuxiliar.pop();
            if (!letra.equals(cola.peek())) {
                return false;
            }
        }

        return false;
    }

}
