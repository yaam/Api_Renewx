package com.renewx.repository;

import com.renewx.model.TipoUsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoUsuarioRepo extends JpaRepository<TipoUsuarioModel, Integer> {
    // atributo de interface:
}