package br.com.ishop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.JoinColumn;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @MapsId("idProduct")
    @JoinColumn(name = "id_product")
    Products products;

    @ManyToOne
    @MapsId("idUserCart")
    @JoinColumn(name = "id_user_cart")
    CartUser user_cart;

    @Column(name = "quantity", nullable = true, unique = false)
    private int quantity;

    public Cart() {
    }

    public Cart(Long id, int quantity) {

        this.id = id;
        this.quantity = quantity;
    }
    
    public Long getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
