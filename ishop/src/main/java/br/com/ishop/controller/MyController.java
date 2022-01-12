package br.com.ishop.controller;

import br.com.ishop.model.*;
import br.com.ishop.service.*;
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
    private IUsersService usersService;
    private CartUserRepository userCartService;
    private CartRepository cartService;

    @GetMapping("/showUsers")
    public String findUsers(Model model) {

        var users = (List<Users>) usersService.findAll();

        model.addAttribute("users", users);

        return "showUsers";
    }

    @GetMapping("/shoppingCart/{id}")
    public List<Cart> findCart(@PathVariable("id")Long id) {

        var user_cart = (CartUser) userCartService.findByUser(id);

        var carts = (List<Cart>) cartService.findByUserCart(user_cart.getId());

        return carts;
    }
}