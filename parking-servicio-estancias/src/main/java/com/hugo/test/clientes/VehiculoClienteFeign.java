package com.hugo.test.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hugo.test.entity.Vehiculo;

@FeignClient(name="servicio-vehiculos", url="localhost:8001")
public interface VehiculoClienteFeign {
	@GetMapping("/listarVehiculos")
	public List<Vehiculo> listar();

	@GetMapping("/listarVehiculos/{placa}")
	public Vehiculo obtenerVehiculo(@PathVariable String placa);
}
