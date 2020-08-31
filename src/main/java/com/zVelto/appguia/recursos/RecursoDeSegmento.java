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

import com.zVelto.appguia.entidades.Segmento;
import com.zVelto.appguia.repositorios.RepositorioDeSegmento;

@RestController
@RequestMapping(value = "/segmentos")
public class RecursoDeSegmento {
	
	@Autowired
	private RepositorioDeSegmento segmentoDAO;
	
	@GetMapping
	public ResponseEntity<Segmento> findAll() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = sdf.parse("05/10/1995");
		Date d2 = sdf.parse("26/10/1998");
		Segmento seg = new Segmento(null, "Ramo da empresa", 25687, d1, 778984, d2);
		return ResponseEntity.ok().body(seg);
	}
	
	@PostMapping
	public ResponseEntity<Segmento> salvarEmpresa(@RequestBody Segmento seg) {
		segmentoDAO.save(seg);
		return ResponseEntity.ok().body(seg);
	}

}
