package com.eespindola.section.cadenas;

public class C05ComparacionDeCadenas {
  public static void main(String[] args) {
    String cadena1 = "Java";
    String cadena2 = "Java";
    String cadena3 = new String("Java");

    // Comparacion por referencia
    System.out.println("cadena1 es igual a cadena2: " + (cadena1 == cadena2));
    System.out.println("cadena1 es igual a cadena3: " + (cadena1 == cadena3));

    // Comparacion por valor
    System.out.println("cadena1 es igual a cadena3: " + (cadena1.equals(cadena3)));

  }
}
