package projeto;

import java.util.Scanner;

public class Principal {
	
/*
IMPORTANTe EU PRECISO IMPLEMENTAR A SOBRE CARGA E SOBRE ESCRITA ANTES DE ENTREGAR
EM MINHA OPINIÃO NO MAXIMO ATÉ QUARTA FEIRA O PROJETO ESTÁ PRONTO.
*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		char menu, cliente, funcionario, gerente;
		
		Metodos m = new Metodos();
        
		System.out.println("TELA INICIAL\n");
			
		System.out.println("1 - Cliente");
		System.out.println("2 - Funcionario");
		System.out.println("3 - Gerente");
		System.out.println("4 - Sair\n");
		menu = leia.nextLine().charAt(0);
		
		switch (menu)
	    {
	    
	    case '1': //CLIENTE
	    	
	    	   System.out.println("CLIENTE\n");
		       
		       System.out.println("1 - Pagar ");
			   System.out.println("2 - Sacar");
			   System.out.println("3 - Depositar");
			   System.out.println("4 - Consultar");
			   System.out.println("5 - Solicitar Emprestimo");
			   System.out.println("6 - Gurdar no cofre");
			   System.out.println("7 - Seguros\n");
			   
			   cliente = leia.nextLine().charAt(0);
				
			
			switch (cliente)
		    {
			
		    case '1': //PAGAR
		    	
		        m.Pagar();
		 
		        break;

		    case '2': //SACAR
		      
		    	m.Sacar();
		    		
		        break;
		       
	        case '3': //DEPOSITAR
		    	
	           m.Depositar();
	        
		    	break;
		       
		    case '4': // CONSULTAR SALDO
		        
		    	m.Consultar();
		
		        break;

            case '5': // GURDAR NO COFRE
		        
		    	m.Emprestar();
		
		        break;
		        
            case '6': // SOLICITAR EMPRESTIMO
		        
		    	m.Cofre();
		
		        break;
		        
           case '7': // SEGUROS
		        
		    	m.Seguro();
		
		        break;
		    }
			
	        break;

	        
	    case '2': //FUNCIONARIO
	      
	    	   System.out.println("FUNCIONARIO\n");
		    
	    	   System.out.println("1 - Cadastrar ");
			   System.out.println("2 - Editar");
			   System.out.println("3 - Cobrar");
			   System.out.println("4 - Receber Salario\n");
			  
			   funcionario = leia.nextLine().charAt(0);
		
			   switch (funcionario)
			    {
				
			    case '1': //CADASTRAR
			    	
			    	m.Cadastrar();
			    	
			        break;

			        
			    case '2': //EDITAR
			      
			    	m.Editar();
			    	
			        break;
			        
			        
		        case '3': //COBRAR
			    	
		        	m.Cobrar();
		        
			    	break;
			    
			        
			    case '4': //RECEBER SALARIO
			        
			    	m.Receber();
			
			        break;

			    }
				
		        break;

        case '3': //GERENTE
        	
        	   System.out.println("GERENTE\n");
		       
               System.out.println("1 - Contratar ");
			   System.out.println("2 - Demitir");
			   System.out.println("3 - Pedir café");
			   System.out.println("4 - Promover\n");
			   
			   gerente = leia.nextLine().charAt(0);
				
			   switch (gerente)
			    {
				
			    case '1': //CONTRATAR
			    	
			    	m.Contratar();
			    	
			        break;

			        
			    case '2': //DEMITIR
			      
			    	m.Demitir();
			    	
			        break;
			        
			        
		        case '3': //PEDIR CAFE
			    	
		            m.Cafe();
		        	
			    	break;
			    
			        
			    case '4': //PROMOVER
			        
			    	m.Promover();
			
			        break;
			        
			    }
			   
			   break;

	    case '4': //SAIR
		        	
		        	System.out.println("Saindo...\n");
				       
		            break;
			    }
				
		        leia.close();

	  }		

}
	
