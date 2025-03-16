package com.renewx.Controller;

import com.renewx.controller;
import com.example.renewx.service.UsuarioService;
import com.springFragmework.web.bind.annotation.Autowired;
import com.springFragmework.web.bind.annotation.DeleteMapping;
import com.springFragmework.web.bind.annotation.GetMapping;
import com.sprimgFragmework.web.bind.annotation.PostMapping;
import com.springFragmework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("api/v1/usuarios")
public class UsuarioController {
    @Autoweired
    private com.renewx.services.com.renewx.UsuarioService usuarioService;

    @GetMapping("/listausuarios")
    public List<UsuarioMOdel> getAllUsuarios() {
        return usuarioService.getAllUsuarios();
    }

@PostMapping
public UsuarioModel createUsuario(@RequestBody UsuarioModel) {
            //TODO: process POST request
        return usuariosService.saveUsuario(usuarioModel);
}

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Integer id) {
        usuarioService.deleteUsuario(id);
    }
}
