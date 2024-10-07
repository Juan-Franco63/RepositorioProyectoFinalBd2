package com.ProyectoCrudBD2.ProyectoFinalBd2.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoCrudBD2.ProyectoFinalBd2.Model.Usuario;
import com.ProyectoCrudBD2.ProyectoFinalBd2.Service.UsuarioService;

@RestController
@RequestMapping("/api/Usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    // Crear un nuevo usuario
    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return usuarioService.createUsuario(usuario);
    }

    // Obtener un usuario por su ID
    @GetMapping("/{id}")
    public Usuario getUsuarioById(@PathVariable String id) {
        return usuarioService.getUsuarioById(id);
    }

    // Obtener todos los usuarios
    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return usuarioService.getAllUsuarios();
    }

    // Actualizar un usuario por su ID
    @PutMapping("/{id}")
    public Usuario updateUsuario(@PathVariable String id, @RequestBody Usuario updatedUsuario) {
        return usuarioService.updateUsuario(id, updatedUsuario);
    }

    // Eliminar un usuario por su ID
    @DeleteMapping("/{id}")
    public String deleteUsuario(@PathVariable String id) {
        usuarioService.deleteUsuario(id);
        return "Usuario con ID " + id + " eliminado.";
    }
}


