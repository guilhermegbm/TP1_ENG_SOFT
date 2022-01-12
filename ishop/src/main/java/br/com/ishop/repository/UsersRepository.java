package br.com.ishop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.ishop.model.Users;

@Repository
public interface UsersRepository extends CrudRepository<Users, Long> {

	@Query("from Users u where u.email = :email and u.password = :password")
	List<Users> findByEmailAndPassword(@Param("email") String email, @Param("password") String password);

}