/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.antigua.sistemas.cursos.service;

import gt.edu.umg.antigua.sistemas.cursos.dao.CatedraticoRepository;
import gt.edu.umg.antigua.sistemas.cursos.model.Catedratico;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author joan
 */
@Service
public class CatedraticoService {
    @Autowired
    private CatedraticoRepository cr;
    
    public List<Catedratico> buscarTodos(){
        return (List<Catedratico>) this.cr.findAll();
    }
    
    public Catedratico registrar(Catedratico catedratico){
        return this.cr.save(catedratico);
    }
}
