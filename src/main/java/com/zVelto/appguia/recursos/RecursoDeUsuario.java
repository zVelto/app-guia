package com.zVelto.appguia.recursos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zVelto.appguia.entidades.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class RecursoDeUsuario {
	
	@GetMapping
	public ResponseEntity<Usuario> findAll() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = sdf.parse("05/10/1995");
		Date d2 = sdf.parse("26/10/1998");
		
		Usuario user = new Usuario(2548, "Zé", "555.222.666-99", "zezin", "12564", "55544447", "98878987", "44556688", "Rua: cervo do pantanal", "5654", null, "Clube de Campo", "Santo André", "SP", "05879-444", 2589, d1, 5654, d2);
		
		return ResponseEntity.ok().body(user);
	}

}
