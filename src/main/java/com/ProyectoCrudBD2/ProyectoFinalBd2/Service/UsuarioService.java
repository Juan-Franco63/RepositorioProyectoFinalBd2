package com.ProyectoCrudBD2.ProyectoFinalBd2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoCrudBD2.ProyectoFinalBd2.Model.Usuario;
import com.ProyectoCrudBD2.ProyectoFinalBd2.Repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Crear un nuevo usuario
    public Usuario createUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Obtener un usuario por su ID
    public Usuario getUsuarioById(String id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    // Obtener todos los usuarios
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    // Actualizar un usuario por su ID
    public Usuario updateUsuario(String id, Usuario updatedUsuario) {
        return usuarioRepository.findById(id).map(usuario -> {
            usuario.setName(updatedUsuario.getName());
            usuario.setEmail(updatedUsuario.getEmail());
            usuario.setCursosMatriculados(updatedUsuario.getCursosMatriculados());
            usuario.setRatingCursos(updatedUsuario.getRatingCursos());
            usuario.setRatingTutores(updatedUsuario.getRatingTutores());
            return usuarioRepository.save(usuario);
        }).orElse(null);
    }

    // Eliminar un usuario por su ID
    public void deleteUsuario(String id) {
        usuarioRepository.deleteById(id);
    }
}
