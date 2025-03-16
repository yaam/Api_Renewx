package com.renewx.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.renewx.model.UusarioModel;


public interface UsuarioRepo extends JpaRepository<UsuarioModel, Integer> {
/**
 * Busca un usuario por su dirección de correo electronico
 * 
 *  @param email la dirección de correo electronico a verificar
 *  @return true si existe un usuario con la dirección de correo electronico, false en caso contrario
 *  */    
boolean existeCorreo(String email);

/**
 * Busca un usuario por su id de usuario
 * 
 * @param id el id del usuario a buscar
 * @return Un Optional que contiene el usuario si se encuentra, o un Optional vacio si no
 */

 Optional<UsuarioModel> findByIdusuario(Integer idusuario);
 /**
  * Elimina un usuario por su id de usuario
  * @param idusuario el id del usuario.
  */
  void deleteByIdusuario(Integer idusuario);
}
