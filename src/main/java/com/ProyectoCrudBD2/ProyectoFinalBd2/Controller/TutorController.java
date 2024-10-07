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

import com.ProyectoCrudBD2.ProyectoFinalBd2.Model.Tutor;
import com.ProyectoCrudBD2.ProyectoFinalBd2.Service.TutorService;

@RestController
@RequestMapping("/api/Tutores")
public class TutorController {

    @Autowired
    private TutorService tutorService;

    // Crear un nuevo tutor
    @PostMapping
    public Tutor createTutor(@RequestBody Tutor tutor) {
        return tutorService.createTutor(tutor);
    }

    // Obtener un tutor por su ID
    @GetMapping("/{id}")
    public Tutor getTutorById(@PathVariable String id) {
        return tutorService.getTutorById(id);
    }

    // Obtener todos los tutores
    @GetMapping
    public List<Tutor> getAllTutores() {
        return tutorService.getAllTutores();
    }

    // Actualizar un tutor por su ID
    @PutMapping("/{id}")
    public Tutor updateTutor(@PathVariable String id, @RequestBody Tutor updatedTutor) {
        return tutorService.updateTutor(id, updatedTutor);
    }

    // Eliminar un tutor por su ID
    @DeleteMapping("/{id}")
    public String deleteTutor(@PathVariable String id) {
        tutorService.deleteTutor(id);
        return "Tutor con ID " + id + " eliminado.";
    }
}

