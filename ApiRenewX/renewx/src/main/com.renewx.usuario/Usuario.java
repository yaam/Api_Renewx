package com.renewx.model;

import jakarta.persistence.*;
import lombok.Data;



@Data
@Entity
@Table(name = "USUARIO")

public class Usuario {
    @Id     
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idusuario;

    @Column(nullable = false, unique = true, lengh = 155)
    private String email;

    @Column(nullable = false, length = 155)
    private String pass_user;

    @Column(nullable = false)
    private Boolean estado_user;

    @OneToManywappedBy = ("USUARIO", cascade =  CascadeType.ALL , orphanRemoval = true)
    private List<Rol> roles;
}
