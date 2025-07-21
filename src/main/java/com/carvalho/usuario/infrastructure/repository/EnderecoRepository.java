package com.carvalho.usuario.infrastructure.repository;

import com.wilson.aprendendo_spring.infrastructore.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
