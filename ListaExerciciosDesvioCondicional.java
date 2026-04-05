import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.Spring;
import java.text.DecimalFormat;

public class ListaExerciciosDesvioCondicional {

	public static void main(String[] args) {
		//exercicio1();
				//exercicio2();
				//exercicio3();
				//exercicio4();
				//exercicio5();
				//exercicio6();
				//exercicio7();
				//exercicio8();
				//exercicio9();
				//exercicio10();
				//exercicio11();
				//exercicio12();
				//exercicio13();
				//exercicio14();
				//exercicio15();
				//exercicio16();
				//exercicio17();
				//exercicio18();
				//exercicio19();
				//exercicio20();
				
			}
			
			static void exercicio1() {
				Scanner sc = new Scanner(System.in);
				System.out.println("escolha um número inteiro: ");
				int numero = sc.nextInt();
				if(numero % 2 == 0) {
				System.out.println("o número é par");
				}
				else {
				System.out.println("o número é ímpar");
				}
		}

		    static void exercicio2() {
		    	
		    	Scanner sc = new Scanner(System.in);
		    	System.out.println("escolha um número: ");
		    	int numero1 = sc.nextInt();
		    	System.out.println("escolha outro número: ");
		    	int numero2 = sc.nextInt();
		    	if(numero1 > numero2) {
		    	System.out.println(numero1 + " é maior que " + numero2);
		    	}
		    	else {
		        System.out.println(numero2 + " é maior que " + numero1);
		    	}
		    }
		     
		     static void exercicio3() {
		    	 
		    	 Scanner sc = new Scanner(System.in);
		     	 System.out.println("escolha um número: ");
		     	 double numero = sc.nextDouble();
		     	 if(numero > 0) {
		     		 System.out.println("o número é postitivo");
		     	 }
		     	 else if(numero == 0) {
		     		 System.out.println("o número é exatamente 0");
		     	 }
		     	 else {
		     		 System.out.println("o numero é negativo");
		     	 }
		     	 	 
		     	 }
		    	 
		      static void exercicio4() {
		    	  
		    	  Scanner sc = new Scanner(System.in);
		    	  System.out.println("escolha um numero: ");
		          double numero = sc.nextDouble();
		    	  if(numero >= 6) {
		    		 System.out.println("você foi aprovado "); 
		    	  }
		    	  else {
		    	  System.out.println("você foi reprovado");
		    	  }
		      }


		       static void exercicio5() {
		    	   
		    	  Scanner sc = new Scanner(System.in);
		     	  System.out.println("qual é a sua idade? ");
		     	  double numero = sc.nextDouble();
		     	  if(numero >= 16) {
		     		  System.out.println("você pode votar");
		     	  }
		     	  else {
		     		  System.out.println("você não pode votar");
		     	  }
		    	   
		       }
		 
			
		       static void exercicio6() {
		    	   
		    	   Scanner sc = new Scanner(System.in);
		    	   System.out.println("escolha um número");
		    	   double numero1 = sc.nextDouble();
		    	   System.out.println("escolha outro número");
		    	   double numero2 = sc.nextDouble();
		    	   System.out.println("escolha mais um número");
		    	   double numero3 = sc.nextDouble();
		    	   double maior;
		    	   if(numero1 > numero2 && numero1 > numero3) {
		    		   System.out.println("o número maior é: " + numero1);
		    	   }
		    	   else if(numero2 > numero1 && numero2 > numero3) {
		    		   System.out.println("o número maior é: " + numero2);
		    	   }
		    	   else {
		    		   System.out.println("o número maior é: " + numero3);
		    		   
		    	   
		    	   }
		       }
		   
		       static void exercicio7() {
		    	 
		    	   Scanner sc = new Scanner(System.in);
		    	   System.out.println("qual foi sua nota na prova?");
		    	   double nota = sc.nextDouble();
		    	   if(nota >= 0 && nota <= 4) {
		    		   System.out.println("sua nota foi insuficiente");
		    	   }
		    	   else if(nota >= 5 && nota <=6) {
		    		   System.out.println("sua nota é regular");
		    	   }
		    	   else if( nota >= 7 && nota <= 8) {
		    		   System.out.println("sua nota foi boa");
		    	   }
		    	   else {
		    		   System.out.println("sua nota é exelente");
		    		   
		    	   }  
		    } 


		       static void exercicio8() {
		    	   
		    	   Scanner sc = new Scanner(System.in);
		    	   System.out.println("escolha o tamanho do primeiro lado de um triângulo: ");
		    	   double lado1 = sc.nextDouble();
		    	   System.out.println("escolha um tamanho para o segundo lado: ");
		    	   double lado2 = sc.nextDouble();
		    	   System.out.println("escolha um tamanho para o terceiro lado: ");
		    	   double lado3 = sc.nextDouble();
		    	   if(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
		    		   System.out.println("este triângulo é valido");
		    	   }
		    	   else {
		    		   System.out.println("este triângulo não é valido");
		    	   }
		       }


	            static void exercicio9() {
	            	
	            	Scanner sc = new Scanner(System.in);
			    	   System.out.println("escolha o tamanho do primeiro lado de um triângulo: ");
			    	   double lado1 = sc.nextDouble();
			    	   System.out.println("escolha um tamanho para o segundo lado: ");
			    	   double lado2 = sc.nextDouble();
			    	   System.out.println("escolha um tamanho para o terceiro lado: ");
			    	   double lado3 = sc.nextDouble();
			    	   if(lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
			    		   System.out.println("este triângulo não existe");
			    	   }
			    	   else if(lado1 == lado2 && lado1 == lado3) {
			    		   System.out.println("este é um triângulo equilátero");
	                   }
			    	   else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			    		   System.out.println("este é um triângulo isósceles");
			    	   }
	                   else {
	                	   System.out.println("este é um triângulo escaleno");
	                   }
	            	
	            }
	            	
	            static void exercicio10() {
	            	
	            	Scanner sc = new Scanner(System.in);
	            	ArrayList<String> usuarios = new ArrayList<>();
	            	ArrayList<String> senhas = new ArrayList<>();
	            	
	            	while(true) {
	            	
			    	   System.out.println("Crie seu usuário: ");
			    	   String usuario = sc.nextLine();
			    	   if(usuarios.contains(usuario)) {
			    		   System.out.println("acesso negado, este usuário da existe");
			    		   continue;
			    	   }
			    	   else {
			    		   usuarios.add(usuario);
			    		   System.out.println("acesso permitido, novo usuário criado com sucesso!");
			    	   }
  
			    	   System.out.println("Crie sua senha: ");
			    	   String senha = sc.nextLine();
			    	   senhas.add(senha);
			    	   System.out.println("senha cadastrada com sucesso");
		
			    	   System.out.println("Quer cadastrar um novo usuário?(digite s para sim e n para não): ");
			    	   String opcao = sc.nextLine();
			    	   
			    	   if(opcao.equalsIgnoreCase("n")) {
			    		   break;
			    	   }
			   }  	   
	    }
                
	            static void exercicio11() {
	            	
	            	Scanner sc = new Scanner(System.in);
	            	System.out.println("em qual ano você está?");
	            	double ano = sc.nextDouble();
	            	if(ano % 4 == 0) {
	            		System.out.println("você está em um ano bissexto");
	            	}
	            	else {
	            		System.out.println("você não está em um ano bissexto");
	            	}
	            }
	            
	            static void exercicio12() {
	            	
	            	Scanner sc = new Scanner(System.in);
	            	DecimalFormat df = new DecimalFormat("0.##");
	            	
	            	System.out.println("escolha um número: ");
	            	double a = sc.nextDouble();
	            	
	            	System.out.println("escolha um operado(+,-,*,/): ");
	            	char op = sc.next().charAt(0);
	            	
	            	System.out.println("escolha outro número: ");
	            	double b = sc.nextDouble();
	            	
	            	double resultado = 0;
	            	
					switch(op) {
					
	            	case '+':
	            		resultado = a+b;
	            		break;
	            	
	            	case '-':
	            		resultado = a-b;
	            		break;
	            	
	            	case '*':
	            		resultado = a*b;
	            		break;
	            		
	            	case '/':
	            		resultado = a/b;
	            		break;      		
	            	
	            	default:
	            		System.out.println("operador inválido");
	            	    return;
					}
	            	
					System.out.println("resultado: " + df.format(resultado));
					
	            }

               static void exercicio13() {
            	   
            	   Scanner sc = new Scanner(System.in);
            	   System.out.println("Qual o seu salário mensal? ");
            	   double salario = sc.nextDouble();
            	   double imposto;

            	   if (salario <= 1500) {
            	       imposto = salario * 0.2;
            	   } else if (salario <= 3200) {
            	       imposto = salario * 0.3;
            	   } else if (salario <= 5000) {
            	       imposto = salario * 0.4;
            	   } else if (salario <= 10000) {
            	       imposto = salario * 0.5;
            	   } else {
            	       imposto = salario * 0.7;
            	   }

            	   System.out.println("Você paga R$ " + imposto + " de imposto por mês.");
               }

              static void exercicio14() {
            	  
               Scanner sc = new Scanner(System.in);
           	   System.out.println("Valor da compra: ");
           	   double valor = sc.nextDouble();
           	   double resultado;
           	   
           	   if(valor <= 100) {
           		   resultado = valor;
           	   }
           	   else if(valor < 500) {
           		   resultado = valor * (1 - (10 / 100.0));
           	   }
           	   else {
           		   resultado = valor * (1 - (20/100.0));
           	   }
           	   
            	  System.out.println("O valor final da sua compra com o desconto ficou: " + "R$" + resultado);
           	   
              }
                  
              static void exercicio15() {
            	  
              Scanner sc =new Scanner(System.in);
              System.out.println("qual a sua idade? ");
              double idade = sc.nextDouble();
              String resultado = sc.nextLine();
              
              if(idade <= 12) {
            	  resultado = "Criança";
              }
              else if(idade <= 17) {
            	  resultado = "Adolescente";
              }
              else if(idade <= 59) {
            	  resultado = "Adulto";
              }
              else {
            	  resultado = "Idoso";
              }
              
              System.out.println("Você é: " + resultado);
              
              }

              static void exercicio16() {
            	  
            	  Scanner sc = new Scanner(System.in);
                  System.out.println("Nota de matemática: ");
                  double nota1 = sc.nextDouble();
                  System.out.println("Nota de português: ");
                  double nota2 = sc.nextDouble();
                  System.out.println("Nota de ciências: ");
                  double nota3 = sc.nextDouble();
                  String resultado = sc.nextLine();
                  
                  if((nota1 + nota2 + nota3) / 3 >= 7) {
                	  resultado = "aprovado";
                  }
                  else if((nota1 + nota2 + nota3) / 3 >= 5) {
                	  resultado = "recuperação";
                  }
                  else {
                	  resultado = "reprovado";
                  }
                  System.out.println("Resultado: " + resultado);
              }
              
              static void exercicio17() {
            	  
            	  Scanner sc = new Scanner(System.in);
                  System.out.println("valor do empréstimo: ");
                  double emprestimo = sc.nextDouble();
   	              System.out.println("você pretende parcelar em quantas vezes? ");
                  double parcela = sc.nextDouble();
                  System.out.println("qual o seu salário");
                  double salario = sc.nextDouble();
                  String resultado;
                  double valorparcela = emprestimo / parcela;
                  
                  if(valorparcela <= 0.2 * salario) {
                	  resultado = "aprovado";
                	  
                  }
                  else {
                	  resultado = "recusado";
                  }
                  System.out.println("O seu empréstimo foi: " + resultado);
              }

             static void exercicio18() {
            	 
            	 Scanner sc = new Scanner(System.in);
            	 double numerosecreto = 6;
            	 String resultado;
            	 
            	 while(true) {
            	 
                 System.out.println("Tente adivinhar o número que eu estou pensando(00 a 10): ");
                 double palpite = sc.nextDouble();
            	 
                 if(palpite < numerosecreto) {
                	 resultado = "Que pena! Você errou, o número que eu escolhi é maior!"; 
                 }
                 else if(palpite > numerosecreto) {
                	 resultado = "Que pena! Você errou, o número que eu escolhi é menor!";
                 }
                 else {
                	 resultado = "Parabéns! Você acertou o número que eu estava pensando";
                	 System.out.println(resultado);
                	 break;
                 }
                 System.out.println(resultado);
            	 }
             }

             static void exercicio19() {
            	 
            	 Scanner sc = new Scanner(System.in);
            	    
            	    System.out.println("Digite seu IMC: ");
            	    double imc = sc.nextDouble();
            	    
            	    String resultado;
            	    
            	    if(imc < 18.5) {
            	        resultado = "baixo peso";
            	    }
            	    else if(imc <= 24.99) {
            	        resultado = "peso normal";
            	    }
            	    else if(imc <= 29.99) {
            	        resultado = "sobrepeso";
            	    }
            	    else {
            	        resultado = "obesidade";
            	    }
            	    
            	    System.out.println("Resultado do seu IMC: " + resultado);
            	}

            static void exercicio20() {
            	
            	Scanner sc = new Scanner(System.in);
            	ArrayList<String> usuarios = new ArrayList<>();
            	ArrayList<String> senhas = new ArrayList<>();
            	
            	
		    	   System.out.println("Crie seu usuário: ");
		    	   String novousuario = sc.nextLine();
		    	   if(usuarios.contains(novousuario)) {
		    		   System.out.println("acesso negado, este usuário da existe");
		    	   }
		    	   else {
		    		   usuarios.add(novousuario);
		    		   System.out.println("acesso permitido, novo usuário criado com sucesso!");
		    	   }

		    	   System.out.println("Crie sua senha: ");
		    	   String novasenha = sc.nextLine();
		    	   senhas.add(novasenha);
		    	   System.out.println("senha cadastrada com sucesso");
		    	   
		    	   System.out.println("faça login na sua conta, qual o seu usuário?");	
		    	   String usuario = sc.nextLine();
		    	   
		    	   int index = usuarios.indexOf(usuario);
		    	   if (index == -1) {
		               System.out.println("Usuário não encontrado!");
		           } else {

		               int tentativas = 0;
		               boolean acesso = false;

		               while (tentativas < 3) {
		                   System.out.println("Senha: ");
		                   String senha = sc.nextLine();

		                   if (senha.equals(senhas.get(index))) {
		                       acesso = true;
		                       break;
		                   } else {
		                       tentativas++;
		                       System.out.println("Senha incorreta! Tentativas restantes: " + (3 - tentativas));
		                   }
		               }

		               if (acesso) {
		                   System.out.println("Login bem-sucedido!");
		               } else {
		                   System.out.println("Acesso bloqueado!");
		               }
		           }

		           sc.close();
		    }
}