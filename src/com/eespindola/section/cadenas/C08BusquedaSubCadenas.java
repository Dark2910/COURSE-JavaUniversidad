package com.eespindola.section.cadenas;

public class C08BusquedaSubCadenas {
  public static void main(String[] args) {
    String cadena1 = "Hola Mundo";
    System.out.println("cadena1 = " + cadena1);

    int indice1 = cadena1.indexOf("Hola");
    System.out.println("indice1 = " + indice1);

    //**
    // lastIndexOf
    // Sirve para buscar una subcadena o carácter dentro de un String, pero empezando desde el final de la cadena (hacia atrás).
    // *//
    int indice2 = cadena1.lastIndexOf("Mundo");
    System.out.println("indice2 = " + indice2);

    // Devuelve -1 porque no encuentra la cadena
    int indice3 = cadena1.lastIndexOf("Java");
    System.out.println("indice3 = " + indice3);
  }
}
