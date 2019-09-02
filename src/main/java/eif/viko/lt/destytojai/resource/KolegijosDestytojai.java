package eif.viko.lt.destytojai.resource;

import eif.viko.lt.destytojai.model.Destytojas;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.DestytojaiRepository;

import java.util.List;

@RestController
@RequestMapping("/resource/destytojai")
@Api(value = "Kolegijos dėstytojų sąrašas")
public class KolegijosDestytojai {
  private DestytojaiRepository destytojaiRepository = DestytojaiRepository.getInstance();

  @GetMapping
  public List<Destytojas> destytojai(){
    return destytojaiRepository.getList();
  }

  @GetMapping("/{vardas}")
  public List<Destytojas> destytojaiPagalVarda(@PathVariable("vardas") String vardas){
    return destytojaiRepository.getDestytojuSarasasPagalVarda(vardas);
  }
  @PostMapping("/{vardas}/{pavarde}/{pareigos}")
  public void pridetiDestytoja(@PathVariable("vardas")String vardas,
                               @PathVariable("pavarde") String pavarde,
                               @PathVariable("pareigos") String pareigos){
    destytojaiRepository.add(new Destytojas(vardas, pavarde, pareigos));
  }
  @DeleteMapping
  public void istrintiDestytoja(){

  }





}
