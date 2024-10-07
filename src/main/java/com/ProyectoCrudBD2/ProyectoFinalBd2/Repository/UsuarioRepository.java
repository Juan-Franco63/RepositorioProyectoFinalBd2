package com.ProyectoCrudBD2.ProyectoFinalBd2.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ProyectoCrudBD2.ProyectoFinalBd2.Model.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
}

