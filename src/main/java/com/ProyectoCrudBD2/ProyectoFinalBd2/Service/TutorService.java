package com.ProyectoCrudBD2.ProyectoFinalBd2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoCrudBD2.ProyectoFinalBd2.Model.Tutor;
import com.ProyectoCrudBD2.ProyectoFinalBd2.Repository.TutorRepository;

@Service
public class TutorService {

    @Autowired
    private TutorRepository tutorRepository;

    // Crear un nuevo tutor
    public Tutor createTutor(Tutor tutor) {
        return tutorRepository.save(tutor);
    }

    // Obtener un tutor por su ID
    public Tutor getTutorById(String id) {
        return tutorRepository.findById(id).orElse(null);
    }

    // Obtener todos los tutores
    public List<Tutor> getAllTutores() {
        return tutorRepository.findAll();
    }

    // Actualizar un tutor por su ID
    public Tutor updateTutor(String id, Tutor updatedTutor) {
        return tutorRepository.findById(id).map(tutor -> {
            tutor.setName(updatedTutor.getName());
            tutor.setEmail(updatedTutor.getEmail());
            tutor.setCursos(updatedTutor.getCursos());
            return tutorRepository.save(tutor);
        }).orElse(null);
    }

    // Eliminar un tutor por su ID
    public void deleteTutor(String id) {
        tutorRepository.deleteById(id);
    }
}
