package br.com.ishop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.ishop.model.Users;
import br.com.ishop.service.UserService;

@Controller
@RequestMapping("/user")
@CrossOrigin
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping(path = "/login")
	public ResponseEntity<Users> login(@RequestParam(name = "email", defaultValue = "") String email, @RequestParam(name = "password", defaultValue = "") String password) {
		try {
			return new ResponseEntity<Users>(userService.login(email, password), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

}
