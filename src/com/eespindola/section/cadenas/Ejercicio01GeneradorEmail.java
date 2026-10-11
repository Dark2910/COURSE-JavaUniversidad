package com.eespindola.section.cadenas;

public class Ejercicio01GeneradorEmail {
  public static void main(String[] args) {
    String nombreUsuario = "Ubaldo Acosta Soto";
    System.out.println("Nombre usuario: " + nombreUsuario);

    String nombreUsuarioNormalizado = new String(nombreUsuario).replace(" ", ".").toLowerCase().trim();
    System.out.println("Nombre usuario normalizado: " + nombreUsuarioNormalizado);

    String nombreEmpresa = "Global Mentoring";
    System.out.println("Nombre empresa: " + nombreEmpresa);

    String nombreEmpresaNormalizado = new String(nombreEmpresa).replace(" ", "").toLowerCase().trim();

    String extensionEmpresarial = ".com";
    String extensionNacional = ".mx";
//    String extensionEmail = "%s%s".formatted(extensionEmpresarial, extensionNacional);
//    System.out.println("Extensión de dominio: " + extensionEmail);

    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("@");
    stringBuilder.append(nombreEmpresaNormalizado);
//    stringBuilder.append(extensionEmail);

    String dominioEmailNormalizado = stringBuilder.toString();
    System.out.println("Dominio de email normalizado: " + dominioEmailNormalizado);

    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(nombreUsuarioNormalizado);
    stringBuffer.append(dominioEmailNormalizado);

    String email = stringBuffer.toString();
    System.out.println("Email final generado: " + email);

  }
}
