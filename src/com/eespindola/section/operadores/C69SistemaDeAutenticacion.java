package com.eespindola.section.operadores;

import java.util.Scanner;

public class C69SistemaDeAutenticacion {

  private static final String USUARIO_VALIDO = "admin";
  private static final String PASSWORD_VALIDO = "1234";

  private static final Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {

    System.out.print("Usuario: ");
    String usuario = sc.next();

    System.out.print("Password: ");
    String password = sc.next();

    boolean access = (USUARIO_VALIDO.equals(usuario) && PASSWORD_VALIDO.equals(password));
    System.out.println("\nAcceso autorizado: " + access);
  }
}
