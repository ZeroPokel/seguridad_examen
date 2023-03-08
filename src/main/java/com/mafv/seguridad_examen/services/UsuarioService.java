package com.mafv.seguridad_examen.services;

import com.mafv.seguridad_examen.models.Usuario;

public interface UsuarioService {
    
    public Usuario findCriteria(String usuario, String password);
}
