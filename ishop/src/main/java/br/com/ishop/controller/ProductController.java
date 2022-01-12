package br.com.ishop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ishop.model.Products;
import br.com.ishop.service.ProductService;

@Controller
@RequestMapping("/product")
@CrossOrigin
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping(path = "/listarTodos")
	public ResponseEntity<List<Products>> listarTodos() {
		try {
			return new ResponseEntity<List<Products>>(productService.listarTodos(), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}
}
