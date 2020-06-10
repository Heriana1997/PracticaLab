package com.PracticaLab.restcontrollers;

import com.PracticaLab.models.Usuario;
import com.PracticaLab.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class UsuarioRestControllers {

    @Autowired
    UsuarioService service;
    @GetMapping("/list")
    public List<Usuario> list(){
        return service.list();
    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody Usuario usuario, @PathVariable int id){
        service.update(usuario,id);
    }
    @PostMapping("/add")
    public void add(@RequestBody Usuario usuario) {
        service.add(usuario);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
}
