package com.eespindola.section.operadores;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C64TiendaConDescuentoVIP {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Cuantos articulos va a comprar? ");
    final int numeroDeArticulos = Integer.parseInt(sc.next());

    System.out.print("Cuentas con la membresía de la tienda? y/n ");
    final String response = sc.next().trim().toLowerCase();

    Map<String, Boolean> map = new HashMap();
    map.put("y", true);
    map.put("n", false);

    final boolean hasMembership = map.get(response);
    final boolean hasDiscount = numeroDeArticulos >= 10 && hasMembership;

    System.out.printf("El cliente tiene acceso al descuento? %b", hasDiscount);
  }
}
