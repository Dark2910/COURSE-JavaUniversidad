package com.eespindola.section.operadores;

import java.util.Scanner;

public class C63ValorDentroDeUnRango {
  public static void main(String[] args){

    final int MINIMUM = 0;
    final int MAXIMUM = 5;

    System.out.print("Ingresa un numero: ");
    Scanner sc = new Scanner(System.in);
    int data = sc.nextInt();

    boolean isInRange = data >= MINIMUM && data <= MAXIMUM;

    System.out.printf("El valor %d esta dentro del rango 0-5? %s",data, isInRange );
  }
}
