package com.example.trivial_tfg.services;


import java.util.Optional;

import com.example.trivial_tfg.entity.Resultado;

public interface ResultadoService{
	
	Resultado crearResultado(Resultado resultado);
	
	public Optional<Resultado> buscarResultado(Long id_resultado);
	
	Resultado actualizarResultado(Resultado resultado);
	
	 void borrarResultado(Long id_resultado);

	Optional<Resultado> mostrarResultado(Long id_pregunta);

}
