package com.PracticaLab.services;

import com.PracticaLab.models.Usuario;
import com.PracticaLab.repository.CRUDusuario;
import com.PracticaLab.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsuarioService extends CRUDusuario<Usuario, UsuarioRepository> {
    public UsuarioService(UsuarioRepository repository) {
        super(repository);
    }

    @Override
    public List<Usuario> list() {
        return null;
    }

    @Override
    public Usuario get(int id) {
        return null;
    }

    @Override
    public void add(Usuario o) {

    }

    @Override
    public void update(Usuario o, int id) {

    }

    @Override
    public void delete(int id) {

    }
}

