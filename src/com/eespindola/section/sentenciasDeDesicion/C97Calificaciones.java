package com.eespindola.section.sentenciasDeDesicion;

import java.util.Scanner;

public class C97Calificaciones {
  static void main(String[] args) {
    System.out.println("*** Sistema de Calificaciones ***");

    var consola = new Scanner(System.in);

    System.out.print("Proporciona una calificación entre 0 y 10: ");
    var calificacion = Double.parseDouble(consola.nextLine());
    var calificacionLetra = "";

    if(calificacion >= 9 && calificacion <= 10)
      calificacionLetra = "A";
    else if(calificacion >= 8 && calificacion < 9)
      calificacionLetra = "B";
    else if(calificacion >= 7 && calificacion < 8)
      calificacionLetra = "C";
    else if(calificacion >= 6 && calificacion < 7)
      calificacionLetra = "D";
    else if(calificacion >=0 && calificacion < 6)
      calificacionLetra = "F";
    else
      calificacionLetra = "Calificación incorrecta";

    System.out.printf("Calificación %.1f es equivalente a %s",
                      calificacion, calificacionLetra);
  }
}
