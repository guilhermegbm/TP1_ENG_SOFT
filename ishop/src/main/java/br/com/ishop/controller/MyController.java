package br.com.ishop.controller;

import br.com.ishop.model.Users;
import br.com.ishop.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private IUsersService usersService;

    @GetMapping("/showUsers")
    public String findUsers(Model model) {

        var users = (List<Users>) usersService.findAll();

        model.addAttribute("users", users);

        return "showUsers";
    }
}