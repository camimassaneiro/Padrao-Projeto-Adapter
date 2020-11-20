package meusistema;

import american.AmericanAddress;
import american.CorreioAmericaObjeto;
import american.CorreioAmericaPorClasse;
import brasileiro.CorreioBrasilPorClasse;
import brasileiro.CorreioBrasilPorObjeto;
import brasileiro.CorreiosValidador;
import cliente.Cliente;
import cliente.CorreiosValidadorPorClasse;
import cliente.CorreiosValidadorPorObjeto;

public class TesteCliente {

	public static void main(String[] args) {

		testar("c1", "street", "123", "a", "EUA");
		testar("c2", "street big apple", "123", "a", "EUA");
		testar("c3", "street big apple", "12345678901", "a", "EUA");
		testar("c4", "street big apple", "12345678", "a", "EUA");
		testar("c5", "street big apple", "12345678", "aa", "EUA");

		testar("c6", "rua das amoreiras", "123456", "a", "BR");
		testar("c7", "rua das amoreiras", "12345678", "a", "BR");
		testar("c8", "rua das amoreiras", "12345678", "aa", "BR");
	}

	private static void testar(String nome, String endereco, String cep, String estado, String pais) {
		
//		Cliente c = new Cliente(nome, endereco, cep, estado, pais);
//		
//		c.setValidadorEndereco(new CorreiosValidadorPorClasse());
//		System.out.println("Correios por classe: " + nome + " " + c.ehEnderecoValido());
//		
//		c.setValidadorEndereco(new CorreiosValidadorPorObjeto(new CorreiosValidador()));
//		System.out.println("Correios por objeto: " + nome + " " + c.ehEnderecoValido());                
                
                System.out.println("Brasil por OBJETO");
                Cliente clienteBrasil = new Cliente(nome, endereco, cep, estado, pais);
                clienteBrasil.setValidadorEndereco(new CorreioBrasilPorObjeto(new CorreiosValidador()));
                System.out.println("Correio Brasil por Objeto: " + nome + " " + clienteBrasil.ehEnderecoValido());
                System.out.println("-----------------------------------------------------------------------------");
                
                System.out.println("Brasil por CLASSE");
                clienteBrasil.setValidadorEndereco(new CorreioBrasilPorClasse());
                System.out.println("Correio Brasil por classe: " + nome + " " + clienteBrasil.ehEnderecoValido());
                System.out.println("-----------------------------------------------------------------------------");
                
                System.out.println("USA por OBJETO");
                Cliente clienteEUA = new Cliente(nome, endereco, cep, estado, pais);
                clienteEUA.setValidadorEndereco(new CorreioAmericaObjeto(new AmericanAddress()));
                System.out.println("Correio EUA por Objeto: " + nome + " " + clienteEUA.ehEnderecoValido());
                System.out.println("-----------------------------------------------------------------------------");
                
                System.out.println("USA por CLASSE");
                clienteEUA = new Cliente(nome, endereco, cep, estado, pais);
                clienteEUA.setValidadorEndereco(new CorreioAmericaPorClasse());
                System.out.println("Correio USA por Classe: " + nome + " " + clienteEUA.ehEnderecoValido());
                System.out.println("-----------------------------------------------------------------------------");
                
                
	}

}
