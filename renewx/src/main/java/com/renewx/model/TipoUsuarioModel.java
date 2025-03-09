package com.renewx.model;
import jakarta.persistence.*;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.Table;
import lombok.Data;
//import java.util.List;

@Data
@Entity
@Table(name = "tipousuario")
public class TipoUsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private integer idtipousuario;

    @Column(nullable = false, length = 50, unique = true)
    private String nombre_tipo_usuario;
    
    //@OneToMany(mappedBy = "tipousuario", cascade = CascadeType)
    //private List<Roles> roles;
}
