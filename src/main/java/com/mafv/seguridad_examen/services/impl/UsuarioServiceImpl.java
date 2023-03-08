package com.mafv.seguridad_examen.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mafv.seguridad_examen.models.Usuario;
import com.mafv.seguridad_examen.repository.UsuarioRepository;
import com.mafv.seguridad_examen.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Usuario findCriteria(String usuario, String password) {
        Usuario user = usuarioRepository.findByNombreAndPassword(usuario, password);

        return user;
    }
    
}
