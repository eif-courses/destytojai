package repository;

import eif.viko.lt.destytojai.model.Destytojas;

import java.util.ArrayList;
import java.util.List;

public class DestytojaiRepository {
  private static DestytojaiRepository ourInstance = new DestytojaiRepository();

  public static DestytojaiRepository getInstance() {
    return ourInstance;
  }

  public DestytojaiRepository() {
  }

  private List<Destytojas> list = new ArrayList<>();

  public List<Destytojas> loadSampleData() {
    list.add(new Destytojas("Marius", "Gzegozevskis", "Lektorius"));
    list.add(new Destytojas("Marius", "Marko", "Lektorius"));
    list.add(new Destytojas("Darius", "Gzegozevskis", "Docentas"));
    return list;
  }
  public List<Destytojas> getList() {
    return list;
  }
  public void add(Destytojas destytojas){
    list.add(destytojas);
  }
  public void update(String pavarde, Destytojas dest){
    for (int i = 0; i < list.size(); i++) {
      if(list.get(i).getPavarde().equals(pavarde)){
        list.add(i, dest);
      }
    }
  }


  public List<Destytojas> getDestytojuSarasasPagalVarda(String vardas){

    List<Destytojas> temp = new ArrayList<>();

    for (Destytojas destytojas : list) {
      if(destytojas.getVardas().equals(vardas)){
        temp.add(destytojas);
      }
    }
    return temp;
  }


}
