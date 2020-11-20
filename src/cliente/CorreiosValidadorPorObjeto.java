package cliente;

import brasileiro.CorreiosValidador;

public class CorreiosValidadorPorObjeto implements ValidadorEndereco {

	private CorreiosValidador adaptada;
	
	public CorreiosValidadorPorObjeto(CorreiosValidador validador) {
		this.adaptada = validador;
	}
	
	@Override
	public void validar(Cliente cliente) throws Exception {
		
		this.adaptada.validar(cliente.getCep(), cliente.getEstado());
		
	}

}
