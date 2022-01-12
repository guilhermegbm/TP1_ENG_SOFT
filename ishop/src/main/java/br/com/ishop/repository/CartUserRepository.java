package br.com.ishop.repository;

import br.com.ishop.model.CartUser;
import br.com.ishop.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartUserRepository extends JpaRepository<CartUser, Long> {
    CartUser findByUser(Users a);
}
