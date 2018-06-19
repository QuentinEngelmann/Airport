package epsi.design_patterns.jpaExemple;

import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Integer> {

}
