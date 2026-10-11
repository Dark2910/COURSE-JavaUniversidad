package com.eespindola.section.variables;

public class DetalleDeUnaPersona {
  public static void main(String[] args) {
    Persona persona = new Persona();

    persona.setNombreCompleto("Emilio");
    persona.setEdad(21);
    persona.setAltura(1.75F);
    persona.setPaisDeOrigen("Mexico");
    persona.setStatus('S');

    System.out.println("nombreCompleto = " + persona.nombreCompleto);
    System.out.println("edad = " + persona.edad);
    System.out.println("altura = " + persona.altura);
    System.out.println("pais de origen = " + persona.paisDeOrigen);
    System.out.println("status = " + persona.status);
  }

  protected static class Persona{
    private String nombreCompleto;
    private Integer edad;
    private Float altura;
    private String paisDeOrigen;
    private Character status;

    public String getNombreCompleto() {
      return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
      this.nombreCompleto = nombreCompleto;
    }

    public Integer getEdad() {
      return edad;
    }

    public void setEdad(Integer edad) {
      this.edad = edad;
    }

    public Float getAltura() {
      return altura;
    }

    public void setAltura(Float altura) {
      this.altura = altura;
    }

    public String getPaisDeOrigen() {
      return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
      this.paisDeOrigen = paisDeOrigen;
    }

    public Character getStatus() {
      return status;
    }

    public void setStatus(Character status) {
      this.status = status;
    }
  }

}
