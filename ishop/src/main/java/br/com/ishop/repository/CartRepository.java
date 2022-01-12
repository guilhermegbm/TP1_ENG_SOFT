package br.com.ishop.repository;

import br.com.ishop.model.Cart;
import br.com.ishop.model.CartUser;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CartRepository extends CrudRepository<Cart, Long> {
    List<Cart> findByUserCart(CartUser a);
}
