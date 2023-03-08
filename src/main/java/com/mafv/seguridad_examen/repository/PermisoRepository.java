package com.mafv.seguridad_examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mafv.seguridad_examen.models.Permiso;

public interface PermisoRepository extends JpaRepository<Permiso, Integer>{
    
}
