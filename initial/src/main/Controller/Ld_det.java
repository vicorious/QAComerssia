package springboot;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ld_det {


/*	public String index() {
		return "Greetings from Spring Boot!";
	}*/

  private final Ld_detRepository repository;

  Ld_det(Ld_detRepository repository) {
    this.repository = repository;
  }
  // Aggregate root
  // tag::get-aggregate-root[]
  @GetMapping("/ld_det")
  List<Ld_det> all() {
    return repository.findAll();
  }
  // end::get-aggregate-root[]

  @PostMapping("/ld_det")
  Ld_det newLd_det(@RequestBody Ld_det newLd_det) {
    return repository.save(newLd_det);
  }
  // Single item
  
  @GetMapping("/ld_det/{ld_domain}")
  Ld_det one(@PathVariable String ld_domain) {
    
    return repository.findById_domain(ld_domain)
      .orElseThrow(() -> new Ld_detNotFoundException(ld_domain));
  }

  @PutMapping("/ld_det/{ld_domain}")
  Ld_det replaceLd_det(@RequestBody Ld_det newLd_det, @PathVariable String ld_domain) {
    
    return repository.findByLd_domain(ld_domain)
      .map(ld_det -> {
        ld_det.setLd_site(newLd_det.getLd_site());
        ld_det.setLd_loc(newLd_det.getLd_loc());
        ld_det.setLd_qty_oh(newLd_det.getLd_qty_oh());
        return repository.save(ld_det);
      })
      .orElseGet(() -> {
        newLd_det.setId_domain(ld_domain);
        return repository.save(newLd_det);
      });
  }

  @DeleteMapping("/ld_det/{ld_domain}")
  void deleteLd_det(@PathVariable String ld_domain) {
    repository.deleteByLd_domain(ld_domain);
  }
}


