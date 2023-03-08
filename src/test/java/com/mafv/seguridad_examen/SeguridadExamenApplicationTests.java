package com.mafv.seguridad_examen;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mafv.seguridad_examen.models.Permiso;
import com.mafv.seguridad_examen.models.Usuario;
import com.mafv.seguridad_examen.repository.PermisoRepository;
import com.mafv.seguridad_examen.repository.UsuarioRepository;

@SpringBootTest
class SeguridadExamenApplicationTests {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Autowired
	PermisoRepository permisoRepository;

	@Test
	void crearusuarioTest() {

		Usuario u1 = new Usuario();
		u1.setEmail("email@gmail.com");
		u1.setNombre("user1");
		u1.setPassword("1234");

		Usuario u2 = new Usuario();
		u2.setEmail("email2@gmail.com");
		u2.setNombre("user2");
		u2.setPassword("1234");

		Usuario u3 = new Usuario();
		u3.setEmail("email3@gmail.com");
		u3.setNombre("user3");
		u3.setPassword("1234");

		Permiso p = new Permiso();
		p.setNombre("Alta");
		permisoRepository.save(p);

		Permiso p2 = new Permiso();
		p2.setNombre("Baja");
		permisoRepository.save(p2);

		List<Permiso> permiso1 = new ArrayList<Permiso>();
		permiso1.add(p);
		permiso1.add(p2);

		List<Permiso> permiso2 = new ArrayList<Permiso>();
		permiso2.add(p);

		u1.setPermissions(permiso1);
		u2.setPermissions(permiso2);
		u3.setPermissions(permiso1);

		usuarioRepository.save(u1);
		usuarioRepository.save(u2);
		usuarioRepository.save(u3);
	}

}
