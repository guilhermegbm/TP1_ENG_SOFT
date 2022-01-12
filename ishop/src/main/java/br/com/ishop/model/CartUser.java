package br.com.ishop.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cart_user")

public class CartUser {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @OneToMany(mappedBy = "user_cart")
    Set<Cart> carts;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    private Users users;

    private int id_user;

    public CartUser() {
    }

    public CartUser(int id, int id_user) {

        this.id = id;
        this.id_user = id_user;
    }
    
    public int getId() {
        return id;
    }

    public int getIdUser() {
        return id_user;
    }

    public void setIdUser(int id_user) {
        this.id_user = id_user;
    }

}
