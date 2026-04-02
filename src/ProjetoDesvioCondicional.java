import java.util.Scanner;;
public class ProjetoDesvioCondicional {
	public static void main(String[] args) {
        //exercicio1();
		//exercicio2();
		exercicio3();
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
    	 
     }

		
	
	
		
	


