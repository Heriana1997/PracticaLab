package com.PracticaLab.restcontrollers;

import com.PracticaLab.models.Pedido;
import com.PracticaLab.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class PedidoRestControllers {
    @Autowired
    PedidoService service;
    @GetMapping("/list")
    public List<Pedido> list(){
        return service.list();
    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody Pedido pedido, @PathVariable int id){
        service.update(pedido,id);
    }
    @PostMapping("/add")
    public void add(@RequestBody Pedido pedido) {
        service.add(pedido);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
}
