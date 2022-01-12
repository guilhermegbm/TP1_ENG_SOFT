package br.com.ishop.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_cart")
@NamedQuery (name = "CartUser.findByUser", query = "select u from CartUser u where u.user = ?1")
public class CartUser {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToMany(mappedBy = "userCart")
    Set<Cart> carts;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    private Users user;

    public CartUser() {
    }

    public CartUser(Long id) {

        this.id = id;
    }
    
    public Long getId() {
        return id;
    }

}
