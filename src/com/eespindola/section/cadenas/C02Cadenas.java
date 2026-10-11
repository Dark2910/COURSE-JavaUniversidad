package com.eespindola.section.cadenas;

public class C02Cadenas {
  public static void main(String[] args) {
    System.out.println("Manejo de cadenas");

    String cadena1 = "Hola";
    String cadena2 = new String("Mundo");
    String cadena3 = cadena1 + " " + cadena2;
    String cadena4 = """
            Este es un texto
            multilinea
            """;

    System.out.println("cadena1 = " + cadena1);
    System.out.println("cadena2 = " + cadena2);
    System.out.println("cadena3 = " + cadena3);
    System.out.println("cadena4 = " + cadena4);
  }
}
