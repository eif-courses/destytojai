package eif.viko.lt.destytojai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import repository.DestytojaiRepository;


@SpringBootApplication
public class DestytojaiApplication {

  public static void main(String[] args) {
    SpringApplication.run(DestytojaiApplication.class, args);
    DestytojaiRepository destytojaiRepository = DestytojaiRepository.getInstance();
    destytojaiRepository.loadSampleData();
  }

}
