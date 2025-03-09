package com.renewx.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renewx.model.TipoUsuarioModel;
import com.renewx.service.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/v1/tipousuario")
public class TipoUsuarioController {
    @Autowired
    private TipoUserService tipoUserService;

    // Métodos del CRUD
    @PostMapping("/api/v1/tipousuario/nuevo")
    public TipoUsuarioModel createTipoUsuario(@RequestBody TipoUsuarioModel tipousermodel) {        
        return tipoUserService.saveTipoUser(tipousermodel);
    }
    
}

