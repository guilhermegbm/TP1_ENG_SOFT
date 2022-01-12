package br.com.ishop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ishop.model.Products;
import br.com.ishop.repository.ProductsRepository;

@Service
public class ProductService {

	@Autowired
	private ProductsRepository productsRepository;

	public List<Products> listarTodos() {
		return productsRepository.findAll();
	}
}
