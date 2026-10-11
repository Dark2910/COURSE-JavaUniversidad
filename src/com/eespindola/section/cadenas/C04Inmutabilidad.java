package com.eespindola.section.cadenas;

public class C04Inmutabilidad {
  public static void main(String[] args) {
    String cadena1 = "Hola";
    System.out.println("cadena1 = " + cadena1);

    String cadena2 = cadena1;
    cadena1 = "Adios";

    System.out.println("cadena1 modificado = " + cadena1);
    System.out.println("cadena2 = " + cadena2);

  }
}
