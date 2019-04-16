/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.antigua.sistemas.cursos.service;

import gt.edu.umg.antigua.sistemas.cursos.dao.CursoRepository;
import gt.edu.umg.antigua.sistemas.cursos.model.Curso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author joan
 */
@Service
public class CursoService {
    @Autowired
    private CursoRepository cr;
    
    public List<Curso> buscarTodos(){
        return (List<Curso>) this.cr.findAll();
    }
    
    public Curso crear(Curso curso){
        return this.cr.save(curso);
    }
    
}
