/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.antigua.sistemas.estudiantes.dao;

import gt.edu.umg.antigua.sistemas.estudiantes.model.Estudiante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author joan
 */
@Repository
public interface EstudianteRepository extends CrudRepository<Estudiante, Long>{
    
}
