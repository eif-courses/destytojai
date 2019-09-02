package eif.viko.lt.destytojai.model;

import lombok.Data;

@Data
public class Destytojas {
  private String vardas;
  private String pavarde;
  private String pareigos;

  public Destytojas() { }

  public Destytojas(String vardas, String pavarde, String pareigos) {
    this.vardas = vardas;
    this.pavarde = pavarde;
    this.pareigos = pareigos;
  }

}
