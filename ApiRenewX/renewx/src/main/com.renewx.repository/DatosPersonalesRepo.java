package com.renewx.repository;

import com.renewx.model.DatosPersonales;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DatosPersonalesRepo extends JpaRepository<DatosPersonales, Integer> {

       
}
