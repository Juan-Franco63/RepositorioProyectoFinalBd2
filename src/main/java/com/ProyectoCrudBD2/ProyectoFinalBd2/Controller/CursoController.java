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

import com.ProyectoCrudBD2.ProyectoFinalBd2.Model.Curso;
import com.ProyectoCrudBD2.ProyectoFinalBd2.Service.CursoService;

@RestController
@RequestMapping("/api/Cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    // Crear un nuevo curso
    @PostMapping
    public Curso createCurso(@RequestBody Curso curso) {
        return cursoService.createCurso(curso);
    }

    // Obtener un curso por su ID
    @GetMapping("/{id}")
    public Curso getCursoById(@PathVariable String id) {
        return cursoService.getCursoById(id);
    }

    // Obtener todos los cursos
    @GetMapping
    public List<Curso> getAllCursos() {
        return cursoService.getAllCursos();
    }

    // Actualizar un curso por su ID
    @PutMapping("/{id}")
    public Curso updateCurso(@PathVariable String id, @RequestBody Curso updatedCurso) {
        return cursoService.updateCurso(id, updatedCurso);
    }

    // Eliminar un curso por su ID
    @DeleteMapping("/{id}")
    public String deleteCurso(@PathVariable String id) {
        cursoService.deleteCurso(id);
        return "Curso con ID " + id + " eliminado.";
    }
}
