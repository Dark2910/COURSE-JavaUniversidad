package com.eespindola.section.variables;


public class DetalleDeUnProducto {

  public static void main (String[] args){
    Producto producto = new Producto();

    producto.setNombreProducto("laptop");
    producto.setPrecio(1500.5);
    producto.setCantidadDisponible(10L);
    producto.setDisponible(true);

    printData(producto);

    producto.setNombreProducto("Bugatti");
    producto.setPrecio(99999999.99);
    producto.setCantidadDisponible(1L);
    producto.setDisponible(false);

    printData(producto);
  }

  private static void printData(Producto producto){
    System.out.println("nombreProducto = " + producto.getNombreProducto());
    System.out.println("precio = " + producto.getPrecio());
    System.out.println("cantidadDisponible = " + producto.getCantidadDisponible());
    System.out.println("disponible = " + producto.getDisponible());
    System.out.println();
  }

  private static class Producto{
    private String nombreProducto;
    private Double precio;
    private Long cantidadDisponible;
    private Boolean isDisponible;

    public String getNombreProducto() {
      return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
      this.nombreProducto = nombreProducto;
    }

    public Double getPrecio() {
      return precio;
    }

    public void setPrecio(Double precio) {
      this.precio = precio;
    }

    public Long getCantidadDisponible() {
      return cantidadDisponible;
    }

    public void setCantidadDisponible(Long cantidadDisponible) {
      this.cantidadDisponible = cantidadDisponible;
    }

    public Boolean getDisponible() {
      return isDisponible;
    }

    public void setDisponible(Boolean disponible) {
      isDisponible = disponible;
    }
  }
}
