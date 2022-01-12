package br.com.ishop.repository;

import br.com.ishop.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartUserRepository extends CrudRepository<Users, Long> {
    
}
