package american;

import cliente.Cliente;
import cliente.ValidadorEndereco;

/**
 *
 * @author camil
 */
public class CorreioAmericaObjeto implements ValidadorEndereco{

    private AmericanAddress america;

    public CorreioAmericaObjeto(AmericanAddress america) {
        this.america = america;
    }
    @Override
    public void validar(Cliente cliente) throws Exception {
        this.america.validate(cliente.getEndereco(), cliente.getCep(), cliente.getEstado());
    }
    
    
}
