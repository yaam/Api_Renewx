package com.renewx.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "usuario")
@Data

public class UsuarioModel {
    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Integer idusuario;

    @Column(nullable = false, length = 50, unique = true)
    private String email;

    @Column(name = false, length = 155)
    private String pass_user;

    @Column(nullable = false)
    private Boolean estado_user;
}
