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
	ResultadoRepository resultadoRepository;
	
//	@Override
//	public Resultado crearResultado(Resultado resultado) {
//		
//		return resultadoRepository.save(resultado);
//	}
//
//	@Override
//	public Optional<Resultado> buscarResultado(Long id_resultado) {
//		
//		return resultadoRepository.findById(id_resultado);
//	}
//
//	@Override
//	public Resultado actualizarResultado(Resultado resultado) {
//		
//		return resultadoRepository.save(resultado);
//	}
//
//	@Override
//	public void borrarResultado(Long id_resultado) {
//		resultadoRepository.deleteById(id_resultado);
//		
//	}
//	
//	@Override
//	public Optional<Resultado> mostrarResultado(Long id_pregunta) {
//		Optional<Resultado> resultados = (Optional<Resultado>) resultadoRepository.findById(id_pregunta);
//		
//		return resultados;
//	}
	
	@Override
	public List<Resultado> buscarResultados(){
		List<Resultado> resultados = resultadoRepository.findAll();
		
		return resultados;
	}
	
	@Override
	public List<Resultado> buscarPorUsuario(Long id_usuario){
		List<Resultado> resultados = resultadoRepository.findByUser(id_usuario);
		
		return resultados;
	}

}	
