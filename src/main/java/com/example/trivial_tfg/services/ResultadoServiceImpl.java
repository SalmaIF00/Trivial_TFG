package com.example.trivial_tfg.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trivial_tfg.entity.Resultado;
import com.example.trivial_tfg.repository.ResultadoRepository;

@Transactional
@Service
public class ResultadoServiceImpl implements ResultadoService {

	@Autowired
	ResultadoRepository resultadoDao;
	
	@Override
	public Resultado crearResultado(Resultado resultado) {
		
		return resultadoDao.save(resultado);
	}

	@Override
	public Optional<Resultado> buscarResultado(Long id_resultado) {
		
		return resultadoDao.findById(id_resultado);
	}

	@Override
	public Resultado actualizarResultado(Resultado resultado) {
		
		return resultadoDao.save(resultado);
	}

	@Override
	public void borrarResultado(Long id_resultado) {
		resultadoDao.deleteById(id_resultado);
		
	}
	
	@Override
	public Optional<Resultado> mostrarResultado(Long id_pregunta) {
		Optional<Resultado> resultados = (Optional<Resultado>) resultadoDao.findById(id_pregunta);
		
		return resultados;
	}

}	
