package com.renewx.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tipodocumentos")
@Data

public class TipoDocumento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idtipodocumentos;

    @Column(name = "nombre_tipo_documento")
    private String nombreTipoDocumento;
}
