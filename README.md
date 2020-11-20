# Padrao-Projeto-Adapter

### Programa simulando a validação de endereço utilizando Padrão de projeto Adapter - GOF :package:

Atividade proposta pelo Prof. Adilson Vahldick - Universidade do Estado de Santa Catarina - UDESC

#### Problema: Aplique Adapter, das duas formas (de classe e de objeto), para suportar o padrão americano na validação do endereço.

![Diagrama](https://github.com/camimassaneiro/Padrao-Projeto-Adapter/blob/master/diagraa%20classe%20adapter.PNG)

Intenção: Converter a interface de uma classe em outra interface, esperada pelos clientes. O Adapter permite que a classe com interfaces incompatíveis trabalhem em conjunto o que, de outra forma, seria impossível.

#### Aplicabilidade:
	Use o padrão Adapter quando:

	- Você quiser usar uma classe existente, mas sua interface não corresponder à interface que necessita;
	- Você quiser criar uma classe reutilizável que coopere com classes não relacionadas pu não previstas, ou seja, classes que não necessariamente tenham interfaces compatíveis;
	- (somente para adaptadores de objetos) você precisar usar várias subclasses existentes, porém, for impraticável adaptar essas interfaces criando subclassespara cada uma. Um adaptador de objeto pode adaptar a interface da sua classe-mãe.

#### Estrutura Adapter:

![Estrutura Adapter](https://github.com/camimassaneiro/Padrao-Projeto-Adapter/blob/master/Estrutura%20adapter.PNG)

Participantes:
	- Target: define a interface específica do domínio de Client usa.
	- Client: colabora com objetos compatíveis com a interface de Target.
	- Adaptee: define uma interface existente que necessita ser adaptada.
	- Adapter: adapta a interface do Adaptee à interface de Target.

Referência:
GAMMA, E. et al. Padrões de projeto: soluções reutilizáveis de software orientado a objetos.
Porto Alegre: Bookman, 2000. 

