package com.ProyectoCrudBD2.ProyectoFinalBd2.Model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Usuarios")
public class Usuario {

    @Id
    private String id;
    private String name;
    private String email;
    private List<String> cursosMatriculados;
    private List<RatingCurso> ratingCursos;
    private List<RatingTutor> ratingTutores;

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
        
            public List<String> getCursosMatriculados() {
                return cursosMatriculados;
            }
        
            public void setCursosMatriculados(List<String> cursosMatriculados) {
                this.cursosMatriculados = cursosMatriculados;
            }
        
            public List<RatingCurso> getRatingCursos() {
                return ratingCursos;
            }
        
            public void setRatingCursos(List<RatingCurso> ratingCursos) {
                this.ratingCursos = ratingCursos;
            }
        
            public List<RatingTutor> getRatingTutores() {
                return ratingTutores;
            }
        
            public void setRatingTutores(List<RatingTutor> ratingTutores) {
                this.ratingTutores = ratingTutores;
            }



    // Clases internas para manejar ratings
    public static class RatingCurso {
        private String cursoId;
        private int rating;

        // Getters y setters

        public String getCursoId() {
            return cursoId;
        }
        public void setCursoId(String cursoId) {
            this.cursoId = cursoId;
        }
        public int getRating() {
            return rating;
        }
        public void setRating(int rating) {
            this.rating = rating;
        }



    }



    public static class RatingTutor {
        private String tutorId;
        private int calificacion;

        // Getters y setters
        public String getTutorId() {
            return tutorId;
        }
        public void setTutorId(String tutorId) {
            this.tutorId = tutorId;
        }
        public int getCalificacion() {
            return calificacion;
        }
        public void setCalificacion(int calificacion) {
            this.calificacion = calificacion;
        }


        
    }



        
        
}
