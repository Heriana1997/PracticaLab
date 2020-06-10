package com.PracticaLab.models;

import javax.persistence.*;

@Entity
@Table(name="Pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="clave", columnDefinition = "varchar(60)")
    private String clave;

    @Column(name="color", columnDefinition = "varchar(60)")
    private String color;

    @Column(name="talla", columnDefinition = "int(2)")
    private String talla;

    @Column(name="cantidad", columnDefinition = "int(2)")
    private String cantidad;

    public Pedido() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
