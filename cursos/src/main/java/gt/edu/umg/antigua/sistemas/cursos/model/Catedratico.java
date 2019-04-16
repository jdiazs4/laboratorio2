/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.antigua.sistemas.cursos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author joan
 */
@Entity
public class Catedratico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombres;
    private String apellidos;
    private String codigo_catedratico;

    public Catedratico() {
    }

    public Catedratico(long id, String nombres, String apellidos, String codigo_catedratico) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo_catedratico = codigo_catedratico;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCodigo_catedratico() {
        return codigo_catedratico;
    }

    public void setCodigo_catedratico(String codigo_catedratico) {
        this.codigo_catedratico = codigo_catedratico;
    }
    
    
}
