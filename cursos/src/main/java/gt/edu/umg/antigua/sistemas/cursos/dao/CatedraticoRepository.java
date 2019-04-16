/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.antigua.sistemas.cursos.dao;

import gt.edu.umg.antigua.sistemas.cursos.model.Catedratico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author joan
 */
@Repository
public interface CatedraticoRepository extends CrudRepository<Catedratico, Long>{
    
}
