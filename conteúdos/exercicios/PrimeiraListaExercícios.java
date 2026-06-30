import java.util.Scanner;

public class PrimeiraListaExercícios {

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
   }
   static void exercicio1() {
       int x;
       x = 10;
       System.out.println("valor: " + x);
   }
  
    static void exercicio2() {
   	
   	 String nome;
   	 int idade;
   	 double altura;
   	 nome = "Davi";
   	 idade = 16;
   	 altura = 1.69;
   	 System.out.println("nome: " + nome);
   	 System.out.println("idade: " + idade);
   	 System.out.println("altura: " + altura);
    }
     static void exercicio3() {
    
   	  int numero1;
   	  numero1 = 45;
   	  int numero2;
   	  numero2 = 65;
   	  System.out.println(numero1 + numero2);
  
     }
    
     static void exercicio4() {
   	 
   	  double condicionador;
   	  condicionador = 30;
   	  System.out.println("preço do produto: " + condicionador);
     }
     
     static void exercicio5() {
    	    	  
   	   Scanner entradaUser = new Scanner(System.in);
   	  
   	   System.out.println("informe seu nome: ");
   	   String nome = entradaUser.nextLine();
   	  
   	   System.out.println("Hello "+ nome);
   	  
     }
      static void exercicio6() {
	  
	   Scanner entradaUser = new Scanner(System.in);
	  
	   System.out.println("informe sua idade: ");
	   int idade = entradaUser.nextInt();
	   idade = idade + 10;
	   System.out.println("idade:"+ idade );
      }
 
       static void exercicio7() {
       Scanner entradaUser = new Scanner(System.in);
      
       System.out.println("escolha um número");
       int numero1 = entradaUser.nextInt();
       System.out.println("escolha outro número");
       int numero2 = entradaUser.nextInt();
       int resultado;
       resultado = numero1 + numero2;
       System.out.println("mostrar resultado: " + resultado);
   
       }
       static void exercicio8() {
       	
       Scanner entradaUser = new Scanner(System.in);
      
       System.out.println("escolha um número decimal");
       double numero = entradaUser.nextDouble();
       double resultado;
       resultado = numero * 2;
       System.out.println("mostrar resultado: " + resultado);
      
}
       static void exercicio9() {
       	
       	Scanner entradaUser = new Scanner(System.in);
       	
       	System.out.println("escolha um valor de um sabonete dove");
       	double numero = entradaUser.nextDouble();
       	double resultado;
       	resultado = numero * 0.10;
           System.out.println("mostrar resultado: " + resultado);
       	
}
      
       static void exercicio10() {
       	
       	Scanner entradaUser = new Scanner(System.in);
       	
       	System.out.println("escolha o valor da largura de um retângulo qualquer");
       	double largura = entradaUser.nextDouble();
       	System.out.println("escolha o valor da altura de um retângulo qualquer");
       	double altura = entradaUser.nextDouble();
       	double resultado;
       	resultado = largura * altura;
       	System.out.println("mostrar resultado: " + resultado);
       	
}	
      
       static void exercicio11() {
       	
       	Scanner entradaUser = new Scanner(System.in);
       	System.out.println("nota de matemática");
       	double matematica = entradaUser.nextDouble();
       	System.out.println("nota de portugues");
       	double portugues = entradaUser.nextDouble();
       	System.out.println("ciencias");
       	double ciencias = entradaUser.nextDouble();
       	double resultado;
       	resultado = (matematica + portugues + ciencias) / 3;
       	
       	System.out.println("mostrar resultado: " + resultado);
       	
       }
      
        static void exercicio12() {
       	
       	Scanner entradaUser = new Scanner(System.in);
        	System.out.println("qual é o seu salário?");
        	double salario = entradaUser.nextDouble();
        	double resultado;
        	resultado = salario * 1.15;
       	
        	System.out.println("mostrar resultado: " + resultado);
}
        static void exercicio13() {
       	
       	 Scanner entradaUser = new Scanner(System.in);
       	 System.out.println("qual é o seu nome?");
       	 String nome = entradaUser.nextLine();
       	
       	 System.out.println("qual é a sua idade?");
       	 int idade;
       	 idade = entradaUser.nextInt();
       	
       	 System.out.println("Olá " + nome);
       	 System.out.println("Você tem: " + idade + " anos");
       	

        }
         static void exercicio14() {
       	
       	 Scanner entradaUser = new Scanner(System.in);
       	 System.out.println("escolha um número: ");
       	 double numero1 = entradaUser.nextDouble();
       	 System.out.println("escolha outro número: ");
       	 double numero2 = entradaUser.nextDouble();
       	 double soma;
       	 soma = numero1 + numero2;
       	 double subtracao;
       	 subtracao = numero1 - numero2;
       	 double multiplicacao;
       	 multiplicacao = numero1 * numero2;
       	 double divisao;
       	 divisao = numero1 / numero2;
       	 System.out.println("resultado da soma: " + soma);
       	 System.out.println("resultado da subtração: " + subtracao);
       	 System.out.println("resultado da multiplição: " + multiplicacao);
       	 System.out.println("resultado da divisão: " + divisao);
       	
       	 
         }
        
         static void exercicio15() {
       	
          Scanner entradaUser = new Scanner(System.in);
          System.out.println("qual a temperatura(em Celsius)? ");
          double celsius = entradaUser.nextDouble();
          double resultado;
          resultado = celsius * 1.8 + 32;
          System.out.println("resultado em fahrenheit: " + resultado);
          
         }
         static void exercicio16() {
           
          Scanner entradaUser = new Scanner(System.in);
          System.out.println("quantas horas você trabalha? ");
          double horas = entradaUser.nextDouble();
          System.out.println("quanto você ganha por hora? ");
          double valorporhora = entradaUser.nextDouble();
          double resultado;
          resultado = valorporhora * horas;
          System.out.println("você ganha: " + resultado);
         
       	 
         }
        
       static void exercicio17() {
       	
         Scanner entradaUser = new Scanner(System.in);
         System.out.println("qual o seu nome? ");
         String nome = entradaUser.nextLine();
         System.out.println("escolha um número: ");
         double numero1 = entradaUser.nextDouble();
         System.out.println("escolha outro número: ");
         double numero2 = entradaUser.nextDouble();
         System.out.println("escolha mais um número: ");
         double numero3 = entradaUser.nextDouble();
         double resultado;
         resultado = (numero1 + numero2 + numero3) / 3;
        
         System.out.println("sua média é: " + resultado);
        
       }
         
       static void exercicio18() {
    	   
         Scanner entradaUser = new Scanner(System.in);
         System.out.println("qual o seu produto? ");
         String nome = entradaUser.nextLine();
         System.out.println("qual o preço? ");
         double preco = entradaUser.nextDouble();
         System.out.println("qual a quantidade? ");
         double quantidade = entradaUser.nextDouble();
         double resultado;
         resultado = preco * quantidade;
         
         System.out.println("o valor total da sua compra foi: R$" + resultado);
         
    	   
       }
}

