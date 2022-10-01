package projeto;

import java.util.Scanner;

public class Metodos{

	// METODOS DO CLIENTE
	
	// CRIANDO E INSTANCIANDO O OBJETO
	Scanner leia = new Scanner(System.in);
	Cliente c = new Cliente();
	Cofre cofre = new Cofre();
	Emprestimo e = new Emprestimo();

	// PAGAR
	public void Pagar() {
		Double pagamento;

		System.out.println("qual o valor do pagamento ? ");
		pagamento = leia.nextDouble();

		if (c.getSaldo() > pagamento) {
			c.setSaldo(c.getSaldo() - pagamento);
			System.out.println("pagamento enviado com sucesso,"+ " saldo remanescete: " + c.getSaldo()+"\n");
		} else {
			System.out.println("saldo insuficiente.\n");
		}
	}

	// SACAR
	public void Sacar() {
		Double saque;

		System.out.println("qual o valor você deseja sacar ? ");
		saque = leia.nextDouble();

		if (c.getSaldo() > saque) {
			c.setSaldo(c.getSaldo() - saque);
			System.out.println("saque realizado com sucesso," + " saldo remanescente: " + c.getSaldo()+"\n");
		} else {
			System.out.println("saldo insuficiente.N");
		}
	
	}
	
	// DEPOSITAR
	public void Depositar() {
		Double deposito;

		System.out.println("qual o valor do deposito: ");
		deposito = leia.nextDouble();
		c.setSaldo(c.getSaldo() + deposito);
		
		System.out.println("Saldo atualizado: "+c.getSaldo());
	}

	// CONSULTAR
	public void Consultar() {
		System.out.println("conta: "+c.getConta()+" agencia: "+c.getAgencia());
		System.out.println("Saldo atual: " + c.getSaldo()+"\n");
		System.out.println(" valor guardado no Cofre: "+cofre.getGuardar());
		
		if (c.getPendencia() > 0) 
		{
			System.out.println("Você possui uma pendencia de: " + c.getPendencia()+"\n");
		} else 
		{
			System.out.println("Você não possui pendencias ativas.\n");
		}
   }
		
		//EMPRESTIMO
		public void Emprestar() {
			Double calculo1, calculo2, emprestimo, salario; int parcelas;
			
			System.out.println("Digite o valor de seu salario: ");
			salario = leia.nextDouble();
			e.setSalario(salario);
			
			System.out.println("Digite valor desejado emprestar: ");
			emprestimo = leia.nextDouble();
			e.setValor(emprestimo);
		
			System.out.println("Em quantas  parcelas vc deseja realizar?\nConsiderando que o numero maximo de parcelas é 48 vezes \n");
			parcelas = leia.nextInt();
			e.setParcelas(parcelas);
			
			if(parcelas <=48)
			{
				calculo1 = (salario/100)*30;
				if((emprestimo/100*50+emprestimo)/parcelas<calculo1)
				{
					calculo2 = (emprestimo/100*50+emprestimo)/parcelas;
					System.out.println("O empestimo será consedido. Em "+parcelas+" vezes de "+calculo2+" Considerando 50% de juros");
					e.setSaldo(emprestimo);
					System.out.println("O valor foi depositado em sua conta. Saldo atual: "+e.getSaldo()+"\n");
					System.out.println("valor total a ser pago: "+parcelas*calculo2);
					e.setPendencia(calculo2);
				}
				else
				{
					System.out.println("Emprstimo negado, pelo valor da parcela\nultrapassar 30% de seu salario.\n");
				}
			}
			else
			{
				System.out.println("Emprestimo negado, pelo numero de parcelas ser superior ao permitido.\n");
			}
			
		}
	
		
		//COFRE 
		public void Cofre() {
			Double guardar;
			
			System.out.println("Qual o valor vc deseja guardar: ");
			guardar = leia.nextDouble();
			
			cofre.setGuardar(guardar);
			System.out.println(" valor guardado no Cofre: "+cofre.getGuardar());
			
		}
		
		
		//SEGURO
		public void Seguro() {
			
		System.out.println("Muito bem você acabou de contratar um seguro contra e roubo para seu cartão.");	
		
		}
	

	// METODOS DO FUNCIONARIO

	// CRIANDO E INSTANCIANDO O OBJETO

	
	Funcionario f = new Funcionario();

	// METODOS

	// CADASTRAR
	public void Cadastrar() {
		String nome, cpf,agencia,conta;

		System.out.println("digite o nome: ");
		nome = leia.next();
		c.setNome(nome);

		System.out.println("digite o cpf: ");
		cpf = leia.next();
		c.setCpf(cpf);
		
		System.out.println("Numero da conta: ");
		conta = leia.next();
		c.setConta(conta);

		System.out.println("Numero da agencia: ");
		agencia = leia.next();
		c.setConta(agencia);
		
		System.out.println("Cliente cadastrado com sucesso.\n");
	}

	// EDITAR
	public void Editar() {
		char opcao;
		Double subtrair, acrescentar;

		System.out.println("1 - Aumentar Saldo ");
		System.out.println("2 - Diminuir Saldo");
		System.out.println("3 - Pedir Café");
		System.out.println("4 - Atualizar Cadastro");

		opcao = leia.nextLine().charAt(0);

		switch (opcao) {

		case '1': // ACRESCENTAR SALDO
		System.out.println("quanto vc quer acrescentar? ");
	    acrescentar = leia.nextDouble();
	    c.setSaldo(acrescentar);
		System.out.println("sucesso...");
			break;

		case '2': // SUBTRAIR SALDO
        System.out.println("qual valor vc quer subtrair? ");
        subtrair = leia.nextDouble();
        c.setSaldo(subtrair);
        System.out.println("sucesso...");
			break;

		case '3': // PEDIR CAFE

			System.out.println("Aqui' está o seu café.");

			break;

		case '4': // ATAUALIZAR CADASTRO
        
		System.out.println(" funçaõ ainda em desenvolvimento...\n");
			
			break;

		}

	}

	// COBRAR
	public void Cobrar() {
		Double valor;
		System.out.println("valor da cobrança: ");
		valor = leia.nextDouble();
		c.setPendencia(c.getPendencia() + valor);
		System.out.println("Cobrança enviada, seu cliente a recebera em breve.\n");
	}

	// RECEBER SALARIO
	public void Receber() {
		f.setSalario(f.getSalario() + 2000.0);
		System.out.println(" seu saldo atual é de: " +f.getSalario()+"\n");
	}

	
	// METODOS DO GERENTE

	// CRIANDO E INSTANCIANDO O OBJETO
	Gerente g = new Gerente();

	// CONTRATAR
	public void Contratar() {
		String nome, cpf, cargo, beneficios, nivelAcesso;
		Double salario;
		
		System.out.println("nome?");
		nome = leia.next();
		f.setNome(nome);
		
		System.out.println("Cpf?");
		cpf = leia.next();
		f.setCpf(cpf);
		
		System.out.println("cargo?");
		cargo = leia.next();
		f.setCargo(cargo);
		
		System.out.println("salario?");
		salario = leia.nextDouble();
		f.setSalario(salario);
		
		System.out.println("beneficios?");
		beneficios = leia.next();
		f.setBeneficios(beneficios);
		
		System.out.println("nivel de acesso?");
		nivelAcesso = leia.next();
		f.setNivelAcesso(nivelAcesso);
		
		System.out.println("funcionario contratado com sucesso.\n"+
		"nome: "+g.getNome()+"\n"+
	    "Cpf: "+g.getCpf()+"\n"+
	    "Cargo: " +g.getCargo()+"\n"+
	    "Salario:" +g.getSalario()+"\n"+
     	"Beneficios: " +g.getBeneficios()+"\n"+
	    "nivel d acesso: " +g.getNivelAcesso()+"\n");
	
	}

	// DEMITIR
	public void Demitir() {
    String nome;
    
		System.out.println("digite o nome do funcionario que será demitido: ");
		nome = leia.next();
		
		System.out.println("O " +nome+ " Será chamado no setor RH ao final de seu espediente.\n");
		
	}

	// PEDIR CAFE
	public void Cafe() {
		System.out.println("aqui está o seu café.\n");
	}

	// PROMOVER
	public void Promover() {
		String nome, nivel;
		
		System.out.println("Considerano o nivel de acesso vai de 1 a 3");
		System.out.println("Digite o nome de quem será promovido: ");
		nome = leia.next();
		
		System.out.println("Digite o nivel de acesso que deseja ateibuir a ele: ");
		nivel = leia.next();
		g.setNivelAcesso(nivel);
		
		System.out.println("nivel de acesso promovido com sucesso, seu nivel atual de "+nome+" é " +g.getNivelAcesso());
		
	}
	
}
