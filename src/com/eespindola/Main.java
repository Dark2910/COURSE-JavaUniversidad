package com.eespindola;

import java.util.logging.Logger;

public class Main {
  private static final Logger LOG = Logger.getLogger(Main.class.getName());
  public static void main(String[] args) {
    final String MESSAGE = "Hello and welcome!!!";
    LOG.info(MESSAGE);
  }
}