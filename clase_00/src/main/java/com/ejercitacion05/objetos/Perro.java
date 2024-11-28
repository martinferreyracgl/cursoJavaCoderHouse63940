package com.ejercitacion05.objetos;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author bizit
 *
 */
public class Perro {
  private String nombre;

  private String raza;

  private String color;

  private String tamanio;

  private LocalDate fechaNacimiento;

  public void ladrar() {

    System.out.println("El perro esta ladrando");
  }

  public int calcularEdad() {

    // Obtener la fecha actual
    LocalDate fechaActual = LocalDate.now();

    // Calcular el periodo entre la fecha de nacimiento y la actual
    Period periodo = Period.between(getFechaNacimiento(), fechaActual);

    // Devolver la cantidad de años
    return periodo.getYears();
  }

  /**
   * @return nombre
   */
  public String getNombre() {

    return this.nombre;
  }

  /**
   * @return raza
   */
  public String getRaza() {

    return this.raza;
  }

  /**
   * @return color
   */
  public String getColor() {

    return this.color;
  }

  /**
   * @return tamanio
   */
  public String getTamanio() {

    return this.tamanio;
  }

  /**
   * @return fechaNacimiento
   */
  public LocalDate getFechaNacimiento() {

    return this.fechaNacimiento;
  }

  /**
   * @param nombre new value of {@link #getnombre}.
   */
  public void setNombre(String nombre) {

    this.nombre = nombre;
  }

  /**
   * @param raza new value of {@link #getraza}.
   */
  public void setRaza(String raza) {

    this.raza = raza;
  }

  /**
   * @param color new value of {@link #getcolor}.
   */
  public void setColor(String color) {

    this.color = color;
  }

  /**
   * @param tamanio new value of {@link #gettamanio}.
   */
  public void setTamanio(String tamanio) {

    this.tamanio = tamanio;
  }

  /**
   * @param fechaNacimiento new value of {@link #getfechaNacimiento}.
   */
  public void setFechaNacimiento(LocalDate fechaNacimiento) {

    this.fechaNacimiento = fechaNacimiento;
  }

}
