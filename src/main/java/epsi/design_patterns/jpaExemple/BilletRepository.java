package epsi.design_patterns.jpaExemple;

import org.springframework.data.repository.CrudRepository;

public interface BilletRepository extends CrudRepository<Billet, Integer> {
	
}
