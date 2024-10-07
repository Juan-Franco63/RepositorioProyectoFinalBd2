package com.ProyectoCrudBD2.ProyectoFinalBd2.Model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Tutores")
public class Tutor {

    @Id
    private String id;
    private String name;
    private String email;
    private List<String> cursos;

    // Getters y setters    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<String> getCursos() {
        return cursos;
    }
    public void setCursos(List<String> cursos) {
        this.cursos = cursos;
    }

    
}
