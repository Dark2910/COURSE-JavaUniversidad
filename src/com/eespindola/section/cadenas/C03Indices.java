package com.eespindola.section.cadenas;

public class C03Indices {
  public static void main(String[] args) {
    String cadena = "Hola Mundo";
    System.out.println("cadena = " + cadena);

    char primerCaracter = cadena.charAt(0);
    System.out.println("primerCaracter = " + primerCaracter);

    char ultimoCaracter = cadena.charAt(cadena.length()-1);
    System.out.println("ultimoCaracter = " + ultimoCaracter);

    char letraM = cadena.charAt(cadena.indexOf("M"));
    System.out.println("letraM = " + letraM);

  }
}
