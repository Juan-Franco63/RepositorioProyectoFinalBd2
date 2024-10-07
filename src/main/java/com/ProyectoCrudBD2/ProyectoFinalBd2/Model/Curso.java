package com.ProyectoCrudBD2.ProyectoFinalBd2.Model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Cursos")
public class Curso {

    @Id
    private String id;
    private String category;
    private int cost;
    private String name;
    private String tutorId;
    private List<RatingCurso> ratings;

    // Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTutorId() {
        return tutorId;
    }

    public void setTutorId(String tutorId) {
        this.tutorId = tutorId;
    }

    public List<RatingCurso> getRatings() {
        return ratings;
    }

    public void setRatings(List<RatingCurso> ratings) {
        this.ratings = ratings;
    }

    public static class RatingCurso {
        private String usuarioId;
        private int rating;


        public String getUsuarioId() {
            return usuarioId;
        }
        public void setUsuarioId(String usuarioId) {
            this.usuarioId = usuarioId;
        }
        public int getRating() {
            return rating;
        }
        public void setRating(int rating) {
            this.rating = rating;
        }


        
    }


}
