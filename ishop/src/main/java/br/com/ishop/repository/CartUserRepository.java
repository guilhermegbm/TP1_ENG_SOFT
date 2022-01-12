package br.com.ishop.repository;

import br.com.ishop.model.CartUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartUserRepository extends CrudRepository<CartUser, Long> {
    
}
