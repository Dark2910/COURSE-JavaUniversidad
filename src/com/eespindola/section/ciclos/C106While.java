package com.eespindola.section.ciclos;

import java.util.logging.Logger;

public class C106While {
  private static final Logger LOG = Logger.getLogger(C106While.class.getName());
  static void main(String[] args) {
    LOG.info("*** NUMEROS PARES ***");
    final int LIMIT = 20;
    int counter = 0;
    while(counter <= LIMIT){
      int remainder = counter % 2;
      if(remainder == 0){
        String message = String.format("%s ",counter);
        System.out.print(message);
      }
      counter++;
    }
  }
}
