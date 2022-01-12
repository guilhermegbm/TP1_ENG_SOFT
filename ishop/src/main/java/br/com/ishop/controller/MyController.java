package br.com.ishop.controller;

import br.com.ishop.model.*;
import br.com.ishop.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;


@Controller
public class MyController {

    @Autowired
    private UsersRepository usersService;

    @Autowired
    private CartUserRepository userCartService;

    @Autowired
    private CartRepository cartService;

    @GetMapping("/showUsers")
    public String findUsers(Model model) {

        var users = (List<Users>) usersService.findAll();

        model.addAttribute("users", users);

        return "showUsers";
    }

    @GetMapping("/shoppingCart/{id}")
    public String findCart(@PathVariable("id") Long id, Model model) {
        System.out.println(id);
        Optional<Users> a = usersService.findById(id);
        var user_cart = (CartUser) userCartService.findByUser(a.get());

        var carts = (List<Cart>) cartService.findByUserCart(user_cart);

        model.addAttribute("itens", carts);
        System.out.println(carts);
        System.out.printf("Carrinho de %s %s \n", a.get().getName(), a.get().getSurname());
        for (Cart carts_it : carts) {
            System.out.printf("Item: %s   | Quantity: %d \n", carts_it.getProducts().getName() , carts_it.getQuantity());
        }
        return "shoppingCart/{id}";
    }
}