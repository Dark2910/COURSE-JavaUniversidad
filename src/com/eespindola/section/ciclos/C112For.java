package com.eespindola.section.ciclos;

import java.util.logging.Logger;

public class C112For {
  private static final Logger LOG = Logger.getLogger(C112For.class.getName());
  static void main(String[] args) {
    LOG.info("*** NUMEROS PARES ***");
    final int LIMIT = 20;
    for (int counter = 0; counter <= LIMIT; counter++) {
      int remainder = counter % 2;
      if(remainder == 0){
        String message = String.format("%s ", counter);
        System.out.print(message);
      }
    }
  }
}
