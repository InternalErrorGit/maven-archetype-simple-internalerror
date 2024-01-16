package net.internalerror;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Level;

@Log4j2
public class App {

  public static void main(String[] args) {
    log.log(Level.OFF, "This is a message with the level: {}", Level.OFF);
    log.log(Level.FATAL, "This is a message with the level: {}", Level.FATAL);
    log.log(Level.ERROR, "This is a message with the level: {}", Level.ERROR);
    log.log(Level.WARN, "This is a message with the level: {}", Level.WARN);
    log.log(Level.INFO, "This is a message with the level: {}", Level.INFO);
    log.log(Level.DEBUG, "This is a message with the level: {}", Level.DEBUG);
    log.log(Level.TRACE, "This is a message with the level: {}", Level.TRACE);
    log.log(Level.ALL, "This is a message with the level: {}", Level.ALL);
  }

}
