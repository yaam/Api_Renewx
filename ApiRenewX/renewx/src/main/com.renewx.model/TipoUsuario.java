package com.renewx.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List; 


@Data   
@Entity
@Table(name = "TIPOUSUARIO")
public class TipoUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idtipousuario;

    @Column(nullable = false, lenght = 50)
    private String nombre_tipo;

    @OneToMany(mappedBy = "tipoUsuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Rol> role;
}

