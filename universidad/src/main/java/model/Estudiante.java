package model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Estudiante {

    @Id
    private Integer id;
    private String email;
    private Long telefono;

    public Estudiante(Integer id, String email, Long telefono) {
        this.id = id;
        this.email = email;
        this.telefono = telefono;
    }

    public Estudiante() {
    }
}
