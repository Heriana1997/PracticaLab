package com.PracticaLab.services;

import com.PracticaLab.models.Pedido;
import com.PracticaLab.repository.CRUDpedido;
import com.PracticaLab.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService extends CRUDpedido<Pedido, PedidoRepository> {
    public PedidoService(PedidoRepository repository) {
        super(repository);
    }

    @Override
    public List<Pedido> list() {
        return null;
    }

    @Override
    public Pedido get(int id) {
        return null;
    }

    @Override
    public void add(Pedido o) {

    }

    @Override
    public void update(Pedido o, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
