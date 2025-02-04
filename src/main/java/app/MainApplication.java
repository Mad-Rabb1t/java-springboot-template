package app;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * http://localhost:8080/creature/1
 * http://localhost:8080/h2-console
 */
@Log4j2
@SpringBootApplication
public class MainApplication {
  public static void main(String[] args) {
    log.info (":: SpringBoot Application starting...");
    SpringApplication.run(MainApplication.class, args);
    log.info (":: SpringBoot Application ...started");
  }
}
