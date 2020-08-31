package com.zVelto.appguia.recursos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zVelto.appguia.entidades.Empresa;
import com.zVelto.appguia.repositorios.RepositorioDeEmpresa;

@RestController
@RequestMapping(value = "/empresas")
public class RecursoDeEmpresa {
	
	@Autowired
	private RepositorioDeEmpresa empresaDAO;
	
	@GetMapping
	public ResponseEntity<Empresa> findAll() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = sdf.parse("05/10/1995");
		Date d2 = sdf.parse("26/10/1998");
		Empresa emp = new Empresa(null, "Sadia", "222.333.444-58", "sadia@gmail.com", "55887799", "66887744", null, "Av: Brasil", "111", null, "bela Vista", "São Paulo", "SP", "22222-154", 8745, d1, null, d2);
		return ResponseEntity.ok().body(emp);
	}
	
	@PostMapping
	public ResponseEntity<Empresa> salvarEmpresa(@RequestBody Empresa emp) {
		empresaDAO.save(emp);
		return ResponseEntity.ok().body(emp);
	}

}
