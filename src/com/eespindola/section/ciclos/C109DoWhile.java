package com.eespindola.section.ciclos;

import java.util.logging.Logger;

public class C109DoWhile {
  private static final Logger LOG = Logger.getLogger(C109DoWhile.class.getName());
  static void main(String[] args) {
    LOG.info("*** NUMEROS IMPARES ***");
    final int LIMIT = 20;
    int counter = 0;
    do{
      int remainder = counter % 2;
        if(remainder != 0){
          String message = String.format("%s ",counter);
          System.out.print(message);
        }
      counter++;
    }while(counter <= LIMIT);
  }
}
