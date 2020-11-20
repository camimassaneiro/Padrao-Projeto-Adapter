package brasileiro;

import cliente.Cliente;
import cliente.ValidadorEndereco;

/**
 *
 * @author camil
 */
public class CorreioBrasilPorClasse extends CorreiosValidador implements ValidadorEndereco{

    @Override
    public void validar(Cliente cliente) throws Exception {
        System.out.println("Validado Correio Brasil por Classe");
    }
    
}
