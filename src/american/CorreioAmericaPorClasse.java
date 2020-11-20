package american;

import cliente.Cliente;
import cliente.ValidadorEndereco;

/**
 *
 * @author camil
 */
public class CorreioAmericaPorClasse extends AmericanAddress implements ValidadorEndereco{

    @Override
    public void validar(Cliente cliente) throws Exception {
        System.out.println("Validado Correio USA por Classe");
    }
    
}
