package br.com.ishop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.JoinColumn;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @ManyToOne
    @MapsId("idProduct")
    @JoinColumn(name = "id_product")
    Products products;

    @ManyToOne
    @MapsId("idUserCart")
    @JoinColumn(name = "id_user_cart")
    CartUser user_cart;

    private int quantity;

    public Cart() {
    }

    public Cart(int id, int quantity) {

        this.id = id;
        this.quantity = quantity;
    }
    
    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
