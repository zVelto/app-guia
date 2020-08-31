package com.zVelto.appguia.recursos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zVelto.appguia.entidades.Status;
import com.zVelto.appguia.repositorios.RepositorioDeStatus;

@RestController
@RequestMapping(value = "/status")
public class RecursoDeStatus {
	
	@Autowired
	private RepositorioDeStatus statusDAO;
	
	@GetMapping
	public ResponseEntity<Status> findAll() {
		Status status = new Status(1, "status do produto");
		
		return ResponseEntity.ok().body(status);
	}
	
	@PostMapping
	public ResponseEntity<Status> salvarEmpresa(@RequestBody Status status) {
		statusDAO.save(status);
		return ResponseEntity.ok().body(status);
	}

}
