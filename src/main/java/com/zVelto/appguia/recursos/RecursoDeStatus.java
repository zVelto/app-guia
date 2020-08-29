package com.zVelto.appguia.recursos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zVelto.appguia.entidades.Status;

@RestController
@RequestMapping(value = "/status")
public class RecursoDeStatus {
	
	@GetMapping
	public ResponseEntity<Status> findAll() {
		Status status = new Status(1, "status do produto");
		
		return ResponseEntity.ok().body(status);
	}

}
