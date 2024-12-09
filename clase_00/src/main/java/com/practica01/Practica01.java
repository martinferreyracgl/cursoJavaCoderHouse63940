package com.practica01;

/**
 * @author bizit
 *
 */
public class Practica01 {

  public static void main(String[] args) { // Método principal, punto de entrada para ejecutar el programa.

    // Declaramos una variable de tipo float y le asignamos un valor con parte entera y decimal.
    float numero = 123.456f; // El sufijo 'f' indica que el número es un literal de tipo float.

    // Convertimos el número a entero, eliminando la parte decimal. Esto da solo la parte entera.
    int parteEntera = (int) numero; // Usamos un "cast" para forzar la conversión a tipo entero.

    // Calculamos la parte decimal restando la parte entera del número original.
    float parteDecimal = numero - parteEntera; // En Java, el resultado de restar un entero de un float sigue siendo un
                                               // float.

    // Imprimimos el número original para referencia.
    System.out.println("Número original: " + numero); // Concatenamos texto con la variable usando el operador '+'.

    // Imprimimos la parte entera del número.
    System.out.println("Parte entera: " + parteEntera); // La conversión previa garantiza que solo vemos la parte
                                                        // entera.

    // Imprimimos la parte decimal del número.
    System.out.println("Parte decimal: " + parteDecimal); // Esto muestra la fracción que queda tras eliminar la parte
                                                          // entera.
  }

}
