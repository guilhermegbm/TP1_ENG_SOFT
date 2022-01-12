package br.com.ishop.model;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "products")
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "name", nullable = false, unique = false)
	private String name;

	@Column(name = "description", nullable = true)
	private String description;

	@Column(name = "price", nullable = true)
	private BigDecimal price;

	@Column(name = "image", nullable = true)
	private byte[] image;

	@JsonIgnore
	@OneToMany(mappedBy = "products")
	Set<Cart> carts;

	public Products() {

	}

	public Products(Long id, String name, String description, BigDecimal price, byte[] image, Set<Cart> carts) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.image = image;
		this.carts = carts;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Set<Cart> getCarts() {
		return carts;
	}

	public void setCarts(Set<Cart> carts) {
		this.carts = carts;
	}

}
