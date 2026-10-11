package com.eespindola.section.cadenas;

public class C09ReemplazarSubCadenas {
  public static void main(String[] args) {
    String cadena = "Hola Mundo";
    System.out.println("cadena = " + cadena);

    // Reemplazar mundo por 'a todos'
    String nuevaCadena = cadena.replace("Mundo", "a todos.");
    System.out.println("nuevaCadena = " + nuevaCadena);

    nuevaCadena = cadena.replace("Hola", "Saludos");
    System.out.println("nuevaCadena = " + nuevaCadena);

  }
}
