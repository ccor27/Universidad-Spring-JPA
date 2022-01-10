package model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Profesor {

    @Id
    private Integer id;
    private String email;
    private String tituloProfesional;
    private Long telefono;

    public Profesor(Integer id, String email, String tituloProfesional, Long telefono) {
        this.id = id;
        this.email = email;
        this.tituloProfesional = tituloProfesional;
        this.telefono = telefono;
    }

    public Profesor() {
    }
}
