package com.ProyectoCrudBD2.ProyectoFinalBd2.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ProyectoCrudBD2.ProyectoFinalBd2.Model.Curso;

public interface CursoRepository extends MongoRepository<Curso, String> {
    List<Curso> findByRatingsRatingGreaterThan(int rating);
    List<Curso> findByCategory(String category);
}
