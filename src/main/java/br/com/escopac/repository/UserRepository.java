package br.com.escopac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.escopac.bean.auth.Usuario;

@Repository
public interface UserRepository extends JpaRepository<Usuario,String> {
    
    Usuario findByEmail(String email);
}
