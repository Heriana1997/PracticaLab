package com.PracticaLab.repository;

import com.PracticaLab.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer > {
}
