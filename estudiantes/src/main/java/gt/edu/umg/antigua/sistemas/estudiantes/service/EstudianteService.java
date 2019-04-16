/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.antigua.sistemas.estudiantes.service;

import gt.edu.umg.antigua.sistemas.estudiantes.dao.EstudianteRepository;
import gt.edu.umg.antigua.sistemas.estudiantes.model.Estudiante;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author joan
 */
@Service
public class EstudianteService {
    @Autowired
    private EstudianteRepository er;
    
    public List<Estudiante> buscarTodos(){
        return (List<Estudiante>) this.er.findAll();
    }
    
    public Estudiante registrar(Estudiante estudiante){
        return this.er.save(estudiante);
    }
}
