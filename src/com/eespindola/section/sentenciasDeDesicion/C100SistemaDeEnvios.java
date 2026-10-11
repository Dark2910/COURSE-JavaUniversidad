package com.eespindola.section.sentenciasDeDesicion;

import java.util.Scanner;

public class C100SistemaDeEnvios {
  static void main(String[] args) {
    System.out.println("*** Sistema de Envíos ***");

    final var TARIFA_NACIONAL = 10.0;
    final var TARIFA_INTERNACIONAL = 20.0;

    var consola = new Scanner(System.in);

    System.out.print("Ingresa el destino del paquete (nacional/internacional): ");
    var destino = consola.nextLine().strip().toLowerCase();

    System.out.print("Ingresa el peso del paquete (en kg): ");
    var peso = Double.parseDouble(consola.nextLine());

    Double costoEnvio = switch (destino){
      case "nacional" -> peso * TARIFA_NACIONAL;
      case "internacional" -> peso * TARIFA_INTERNACIONAL;
      default -> {
        System.out.println("Destino inválido. Ingresa nacional/internacional");
        yield null;
      }
    };
    if(costoEnvio != null)
      System.out.printf("El costo de envío de paquete es: $%.2f", costoEnvio);
  }
}
