package com.eespindola.section.cadenas;

public class C06Metodos {
  public static void main(String[] args) {
    String cadena1 = "Hola Mundo";
    System.out.println("cadena = " + cadena1);

    // Longitud de una cadena1
    int longitud = cadena1.length();
    System.out.println("longitud = " + longitud);

    // Reemplazar caracteres
    String nuevaCadena = cadena1.replace("o", "a");
    System.out.println("nuevaCadena = " + nuevaCadena);

    // Mayusculas
    String mayusculas = cadena1.toUpperCase();
    System.out.println("mayusculas = " + mayusculas);

    // Minusculas
    String minusculas = cadena1.toLowerCase();
    System.out.println("minusculas = " + minusculas);

    // Espacios
    String cadena2 = "    lorem   ";
    System.out.println("cadena con espacios = " + cadena2);
    System.out.println("cadena sin espacios = " + cadena2.trim());
    // Left trim
    String leftTrim = cadena2.replaceAll("^\\s+", "");
    System.out.println("Left trim: " + leftTrim);
    // Right trim
    String rightTrim = cadena2.replaceAll("\\s+$", "");
    System.out.println("Right trim: " + rightTrim);


  }
}
