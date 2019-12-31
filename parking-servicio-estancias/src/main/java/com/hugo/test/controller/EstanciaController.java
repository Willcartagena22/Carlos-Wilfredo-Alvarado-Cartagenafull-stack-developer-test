package com.hugo.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hugo.test.entity.Estancia;
import com.hugo.test.entity.Vehiculo;
import com.hugo.test.entity.service.IEstanciaService;

@RestController
class EstanciaController {

	@Autowired
	@Qualifier("serviceFeign")
	private IEstanciaService estaciaservice;
	
	@GetMapping("listarEstancias")
	public List<Estancia> findAll(){
		
		return estaciaservice.findAll();
	}
	
	
	@GetMapping("listarEstanciasV")
	public List<Estancia> findAllV(){
		
		return estaciaservice.findAllV();
	}
	
	@GetMapping("buscarVehiculo/{id}")
	public Vehiculo buscarVehiculo(@PathVariable String id) {
		return estaciaservice.findVehiculo(id);
	
	}
	
	@PostMapping("/altaEstancia/")
	public String altaVehiculo(@RequestBody String v) {
		estaciaservice.addEstancia(v);
		return "Se agrego estancia";
	}
	
}
