package com.eespindola.section.operadores;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C65PrestamoDeLibros {
  public static void main(String[] args) {
    System.out.println("Sistema de prestamo de libros");

    Scanner sc = new Scanner(System.in);

    Map<String, Boolean> map = new HashMap();
    map.put("y", true);
    map.put("n", false);

    System.out.print("¿Cuentas con una credencial de estudiante? y/n: ");
    final String credentialResponse = sc.next();
    final boolean hasCredential = map.get(credentialResponse);

    System.out.print("¿Vives a no mas de 3km? y/n: ");
    final String distanceResponse = sc.next();
    final boolean isInRange = map.get(distanceResponse);

    final boolean hasDiscount = hasCredential || isInRange;

    System.out.printf("¿Tiene acceso al prestamo? %b", hasDiscount);
  }
}
