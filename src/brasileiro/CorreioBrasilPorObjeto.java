package brasileiro;

import cliente.Cliente;
import cliente.ValidadorEndereco;

/**
 *
 * @author camil
 */
public class CorreioBrasilPorObjeto implements ValidadorEndereco{

    private CorreiosValidador adaptada;

    public CorreioBrasilPorObjeto(CorreiosValidador adaptada) {
        this.adaptada = adaptada;
    }
    
    @Override
    public void validar(Cliente cliente) throws Exception {
        this.adaptada.validar(cliente.getCep(), cliente.getEstado());
    }
    
}
