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
public class Pt_mstr{

/*	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}*/

  private final Pt_mstrRepository repository;

  Pt_mstr(Pt_mstrRepository repository) {
    this.repository = repository;
  }


  // Aggregate root
  // tag::get-aggregate-root[]
  @GetMapping("/pt_mstr")
  List<Pt_mstr> all() {
    return repository.findAll();
  }
  // end::get-aggregate-root[]

  @PostMapping("/pt_mstr")
  Pt_mstr newPt_mstr(@RequestBody Pt_mstr newPt_mstr) {
    return repository.save(newPt_mstr);
  }
  // Single item
  
  @GetMapping("/pt_mstr/{pt_mstr}")
  Pt_mstr one(@PathVariable String pt_domain) {
    
    return repository.findByPt_domain(pt_domain)
      .orElseThrow(() -> new Pt_mstrNotFoundException(pt_domain));
  }

  @PutMapping("/pt_mstr/{pt_domain}")
  Pt_mstr replacePt_mstr(@RequestBody Pt_mstr newPt_mstr, @PathVariable String pt_domain) {
    
    return repository.findByPt_domain(pt_domain)
      .map(pt_mstr -> {
        pt_mstr.setPt_part(newPt_mstr.getPt_part());
        pt_mstr.setPt_desc1(newPt_mstr.getPt_desc1());
        pt_mstr.setPt_desc2(newPt_mstr.getPt_desc2());
        pt_mstr.setPt_status(newPt_mstr.getPt_status());
        pt_mstr.setPt_article(newPt_mstr.getPt_article());
        return repository.save(pt_mstr);
      })
      .orElseGet(() -> {
        newPt_mstr.setPt_domain(pt_domain);
        return repository.save(newPt_mstr);
      });
  }

  @DeleteMapping("/pt_mstr/{pt_domain}")
  void deletePt_mstr(@PathVariable String pt_domain) {
    repository.deleteByPt_domain(pt_domain);
  }
}