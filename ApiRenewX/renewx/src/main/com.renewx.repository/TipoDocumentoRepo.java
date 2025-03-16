package com.renewx.repository;

import com.renewx.model.TipoDocumentos;
import org.springframework.data.jpa.repository.JpaRepository;  //Importa la clase JpaRepository
import org.springframework.stereotype.Repository;              //importa la clase  Repository

@Repository

public interface TipoDocumentoRepo extends JpaRepository<TipoDocumentos, Integer> {// se declar interfza TipoDocumentosRepo que exteiende de JpaRepository<TipoDocumentos, Integer>

    

    
}
