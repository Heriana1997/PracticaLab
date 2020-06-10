package com.PracticaLab.models;

import javax.persistence.*;

@Entity
@Table (name="Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="nombre", columnDefinition = "varchar(60)")
    private String nombre;

    @Column(name="apellido", columnDefinition = "varchar(60)")
    private String apellido;

    @Column(name="tipo", columnDefinition = "int(2)")
    private String tipo;

    public Usuario(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
