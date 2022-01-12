package br.com.ishop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ishop.model.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {

}
