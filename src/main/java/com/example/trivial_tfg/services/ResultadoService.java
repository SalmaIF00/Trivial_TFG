package com.example.trivial_tfg.services;


import java.util.List;
import java.util.Optional;

import com.example.trivial_tfg.entity.Resultado;

public interface ResultadoService{
	
	List<Resultado> buscarResultados();

	List<Resultado> buscarPorUsuario(Long id_usuario);

}
