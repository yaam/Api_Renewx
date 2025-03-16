package com.renewx.model;

import jakarta.persistence.*;
import lombok.Data;
import lombook.Date;


@Data
@Entity
@Table(name = "ROLES")

public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idrol;

    @Column(nullable = false, length = 50 )
    private String nombre_rol;


    @ManyToOne
    @JoinColumn(name = "idtipousuario",nullable = false)
    private Tipousuario tipousuario;

    @ManyToOne
    @JoinColumn(name = "idusuario",nullable = false)
    private Usuario usuario;
}
