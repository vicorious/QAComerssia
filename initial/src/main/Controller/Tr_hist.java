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
public class Tr_hist{

/*	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}*/

  private final Tr_histRepository repository;

  Tr_hist(Tr_histRepository repository) {
    this.repository = repository;
  }


  // Aggregate root
  // tag::get-aggregate-root[]
  @GetMapping("/tr_hist")
  List<Tr_hist> all() {
    return repository.findAll();
  }
  // end::get-aggregate-root[]

  @PostMapping("/tr_hist")
  Tr_hist newTr_hist(@RequestBody Tr_hist newTr_hist) {
    return repository.save(newTr_hist);
  }
  // Single item
  
  @GetMapping("/tr_hist/{tr_hist}")
  Tr_hist one(@PathVariable String tr_domain) {
    
    return repository.findByPt_domain(tr_domain)
      .orElseThrow(() -> new Tr_histNotFoundException(tr_domain));
  }

  @PutMapping("/tr_hist/{tr_domain}")
  Tr_hist replaceTr_hist(@RequestBody Tr_hist newTr_hist, @PathVariable String tr_domain) {
    
    return repository.findByPt_domain(tr_domain)
      .map(pt_mstr -> {
        tr_hist.setTr_part(newTr_hist.getTr_part());
        tr_hist.setTr_site(newTr_hist.getTr_site());
        tr_hist.setTr_loc(newTr_hist.getTr_loc());
        tr_hist.setTr_qty_oh(newTr_hist.getTr_qty_oh());
        tr_hist.setTr_nbr(newTr_hist.getTr_nbr());
        tr_hist.setTr_tmbr(newTr_hist.getTr_tmbr());
        return repository.save(tr_hist);
      })
      .orElseGet(() -> {
        newTr_hist.setPt_domain(tr_domain);
        return repository.save(newTr_hist);
      });
  }

  @DeleteMapping("/pt_mstr/{tr_domain}")
  void deleteTr_hist(@PathVariable String tr_domain) {
    repository.deleteByTr_domain(tr_domain);
  }
}
