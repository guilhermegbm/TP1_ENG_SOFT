package br.com.ishop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne(mappedBy = "user")
    private CartUser user_cart;

    @Column(name = "first_name", nullable = false, unique = false)
    private String first_name;

    @Column(name = "last_name", nullable = false, unique = false)
    private String last_name;

    @Column(name = "email", nullable = false, unique = false)
    private String email;

    @Column(name = "password", nullable = false, unique = false)
    private String password;


    public Users() {
    }

    public Users(Long id, String first_name, String last_name, String email, String password) {

        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
    }
    
    public Long getId() {
        return id;
    }

    public String getName() {
        return first_name;
    }

    public void setName(String first_name) {
        this.first_name = first_name;
    }

    public String getSurname() {
        return last_name;
    }

    public void setSurname(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
