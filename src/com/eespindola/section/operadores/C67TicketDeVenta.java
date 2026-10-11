package com.eespindola.section.operadores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class C67TicketDeVenta {
  public static void main (String[] args){
    Scanner scn  = new Scanner(System.in);

    System.out.print("Precio leche: ");
    double precioLeche = Double.parseDouble(scn.nextLine());

    System.out.print("Precio huevo: ");
    double precioHuevo = Double.parseDouble(scn.nextLine());

    System.out.print("Precio pan: ");
    double precioPan = Double.parseDouble(scn.nextLine());

    System.out.print("Precio platanos: ");
    double precioPlatanos = Double.parseDouble(scn.nextLine());

    System.out.print("Descuento (Y/N): ");
    String response = String.valueOf(scn.nextLine()).toLowerCase().trim();
    int valueDiscount = 0;
    if("y".equals(response)){
      System.out.print("Valor descuento: ");
      valueDiscount = Integer.parseInt(scn.nextLine());
    }

    Ticket ticket = doMathTicket(collectStuff(precioLeche, precioHuevo, precioPan, precioPlatanos), valueDiscount);
    System.out.printf(ticket.toString());
  }

  private static <T> List<T> collectStuff(T... prices) {
    return Arrays.stream(prices)
            .collect(Collectors.toCollection(ArrayList::new));
  }

  private static Ticket doMathTicket(List<Double> prices, int valueDiscount){
    final int CERO = 0;
    final double IVA = 0.16;
    final double DEFAULT_DISCOUNT = 0.00;

    double subtotal = prices.stream().mapToDouble(Double::doubleValue).sum();
    double impuesto = subtotal * IVA;
    double descuento = DEFAULT_DISCOUNT;
    if(valueDiscount > CERO){
      descuento = subtotal * (valueDiscount/100.00);
    }
    double subtotalDescuento = subtotal - descuento;
    double costoTotalCompra = subtotalDescuento + impuesto;

    return new Ticket(subtotal, impuesto, descuento, costoTotalCompra);
  }

  private static class Ticket{
    private static final String VALUE_IMPUESTO = "16%%";
    private final double subtotal;
    private final double impuesto;
    private final double descuento;
    private final double costoTotal;

    public Ticket(double subtotal, double impuesto,
                  double descuento , double costoTotal
    ) {
      this.subtotal = subtotal;
      this.impuesto = impuesto;
      this.descuento = descuento;
      this.costoTotal = costoTotal;
    }

    @Override
    public String toString() {
      return String.format("""
            Ticket:
              Subtotal: $%.2f
              Impuesto (%s): $%.2f
              Descuento: $%.2f
              Costo total: $%.2f
            """, this.subtotal, VALUE_IMPUESTO, this.impuesto, this.descuento, this.costoTotal);
    }
  }

}
