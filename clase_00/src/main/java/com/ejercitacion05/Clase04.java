package com.ejercitacion05;

import java.time.LocalDate;

import com.ejercitacion05.objetos.Perro;

/**
 * @author bizit
 *
 */
public class Clase04 {

  /**
   * @param args
   */
  public static void main(String[] args) {

    Perro myDog = new Perro();
    LocalDate fechaNacimiento = LocalDate.of(2020, 5, 15); // 15 de mayo de 2020
    myDog.setFechaNacimiento(fechaNacimiento);
    int edad = myDog.calcularEdad();

    System.out.println("La edad del pichicho es: " + edad + " años.");

  }

}
