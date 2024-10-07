package com.ProyectoCrudBD2.ProyectoFinalBd2.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoCrudBD2.ProyectoFinalBd2.Model.Curso;
import com.ProyectoCrudBD2.ProyectoFinalBd2.Repository.CursoRepository;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    // Crear un nuevo curso
    public Curso createCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    // Obtener un curso por su ID
    public Curso getCursoById(String id) {
        return cursoRepository.findById(id).orElse(null);
    }

    // Obtener todos los cursos
    public List<Curso> getAllCursos() {
        return cursoRepository.findAll();
    }

    // Actualizar un curso por su ID
    public Curso updateCurso(String id, Curso updatedCurso) {
        return cursoRepository.findById(id).map(curso -> {
            curso.setName(updatedCurso.getName());
            curso.setCategory(updatedCurso.getCategory());
            curso.setCost(updatedCurso.getCost());
            curso.setTutorId(updatedCurso.getTutorId());
            curso.setRatings(updatedCurso.getRatings());
            return cursoRepository.save(curso);
        }).orElse(null);
    }

    // Eliminar un curso por su ID
    public void deleteCurso(String id) {
        cursoRepository.deleteById(id);
    }
}
