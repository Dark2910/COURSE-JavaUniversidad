package com.eespindola.section.cadenas;

public class C07SubCadenas {
  public static void main(String[] args) {
    String cadena = "Hola Mundo";
    System.out.println("cadena = " + cadena);

//    String subCadena1 = cadena.substring(0, 4);
    String subCadena1 = cadena.substring(0, cadena.indexOf("a") + 1);
    System.out.println("subCadena1 = " + subCadena1);

//    String subCadena2 = cadena.substring(5, 10);
    String subCadena2 = cadena.substring(5, cadena.indexOf("o", 5) + 1);
    System.out.println("subCadena2 = " + subCadena2);

  }
}
