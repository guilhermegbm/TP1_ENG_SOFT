package br.com.ishop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ishop.model.Users;
import br.com.ishop.repository.UsersRepository;

@Service
public class UserService {

	@Autowired
	private UsersRepository usersRepository;

	public Users login(String email, String password) {
		List<Users> usuariosPorEmailEPassword = this.usersRepository.findByEmailAndPassword(email, password);

		Users usuarioEncontrado = null;

		if (!usuariosPorEmailEPassword.isEmpty()) {
			usuarioEncontrado = usuariosPorEmailEPassword.get(0);
		}

		return usuarioEncontrado;
	}

}
