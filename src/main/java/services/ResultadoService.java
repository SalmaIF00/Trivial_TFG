package services;


import entity.Resultado;

public interface ResultadoService{
	
	Resultado crearResultado(Resultado resultado);
	
	Resultado buscarResultado(Long id_resultado);
	
	Resultado actualizarResultado(Resultado resultado);
	
	 void borrarResultado(Long id_resultado);

}
