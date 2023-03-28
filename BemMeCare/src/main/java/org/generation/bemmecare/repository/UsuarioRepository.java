package org.generation.bemmecare.repository;

import java.util.Optional;

import org.generation.bemmecare.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Optional<Usuario> findByUsuario(String Usuario);

}