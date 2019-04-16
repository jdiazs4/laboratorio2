/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.antigua.sistemas.cursos.controller;

import gt.edu.umg.antigua.sistemas.cursos.model.Catedratico;
import gt.edu.umg.antigua.sistemas.cursos.service.CatedraticoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author joan
 */
@RestController
@RequestMapping("/catedraticos")
public class CatedraticoController {
    @Autowired
    private CatedraticoService cs;
    
    @GetMapping("/buscarTodos")
    public List<Catedratico> buscarTodos(){
        return this.cs.buscarTodos();
    }
    
    @PostMapping("/registrar")
    public Catedratico registrar(@RequestBody(required = true) Catedratico catedratico){
        return this.cs.registrar(catedratico);
    }
}
