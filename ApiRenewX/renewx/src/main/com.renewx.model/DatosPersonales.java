package com.renewx.model;

import jakarta.persistence.*;

import lombook.Data;

@Entity
@Table(name = "datospersonales")
@Data
public class DatosPersonales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iddatospersonales;
    
    @Column(name = "nombre_completo")
    private String nombreCompleto;

    @Column(name = "cedula", nullable = false)
    private String cedula;

    @Column(name = "dirección, nullable = false")
    private String direccion;

    @Column(name = "telefono", nullable = false)
    private String telefono;

    @ManyToOne
    @JoinColumn(name = "idusuario")
    private UsuarioModel usuario;
    @ManyToOne
    @JoinColumn(name = "idtipodocumento")
    private TipoDocumentoModel tipoDocumento;
}
