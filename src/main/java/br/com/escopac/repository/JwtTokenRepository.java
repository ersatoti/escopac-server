package br.com.escopac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.escopac.bean.auth.JwtToken;

@Repository
public interface JwtTokenRepository extends JpaRepository<JwtToken,String> {}
