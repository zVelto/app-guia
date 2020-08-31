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

import com.zVelto.appguia.entidades.Produto;
import com.zVelto.appguia.repositorios.RepositorioDeProduto;

@RestController
@RequestMapping(value = "/produtos")
public class RecursoDeProduto {
	
	@Autowired
	private RepositorioDeProduto produtoDAO;
	
	@GetMapping
	public ResponseEntity<Produto> findAll() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = sdf.parse("05/10/1995");
		Date d2 = sdf.parse("26/10/1998");
		
		Produto prod = new Produto(null, "Margarina integral", 5.90, d1, d2);
		
		return ResponseEntity.ok().body(prod);
	}
	
	@PostMapping
	public ResponseEntity<Produto> salvarEmpresa(@RequestBody Produto prod) {
		produtoDAO.save(prod);
		return ResponseEntity.ok().body(prod);
	}

}
