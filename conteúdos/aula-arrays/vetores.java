package vetores;
import java.util.Scanner;
public class vetores {

	public static void main(String[] args) {
		//exemplos();
		//exercicio1();
		//exercicio2();
		//exercicio3();
		//exercicio4();
		exercicio5();
		//exercicio6();
}
	static void exemplos() {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[0]);
		System.out.println(cars[2]);
		
		cars[2] = "chevrolet";
		System.out.println(cars[2]);
		
		System.out.println("");
		
		//for indexado
		for(int i = 0; i < cars.length; i++) {
			System.out.println(i + "->" + cars[i]);
		}
		
		//while indexado
		System.out.println("");
		int x = 0;
		while(x < cars.length) {
			
			System.out.println(x + "->" + cars[x]);
			x++; 
		}
		
		//não indexado - iderativo
		System.out.println("");
		for(String c : cars) {
			System.out.println(c);
			
		}
		
}
	static void exercicio1() {
		Scanner input = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número para a posição " + i + ": ");
            System.out.println("");
            numeros[i] = input.nextInt();
        }
        for (int n : numeros) {
            System.out.println(n * 2);
        }

        input.close();
}
	
	static void exercicio2() {
	    Scanner input = new Scanner(System.in);
	    int[] numeros = new int[10];

	    for(int i = 0; i < numeros.length; i++) {
	        System.out.print("Digite o número para a posição " + i + ": ");
	        numeros[i] = input.nextInt();
	    }

	    for(int n : numeros) {
	        if(n % 2 == 0) {
	            System.out.println("o número é par");
	        } else {
	            System.out.println("o número é ímpar");
	        }
	  }
}
	static void exercicio3() {
	    	 Scanner input = new Scanner(System.in);
	    	 int[] vetor = new int[10];

	         for (int i = 0; i < vetor.length; i++) {
	             vetor[i] = i + 1;
	         }

	         System.out.println("Vetor invertido:");
	         for (int i = vetor.length - 1; i >= 0; i--) {
	             System.out.print(vetor[i] + " ");
		   
	    }
}
	static void exercicio4() {
	        	 Scanner sc = new Scanner(System.in);
	             double[] numeros = new double[15];

	             for (int i = 0; i < 15; i++) {
	                 System.out.print("Digite o " + (i + 1) + "º número: ");
	                 numeros[i] = sc.nextDouble();
	             }

	             double maior = numeros[0];
	             for (int i = 1; i < 15; i++) {
	                 if (numeros[i] > maior) {
	                     maior = numeros[i];
	                 }
	             }

	             System.out.println("Maior valor: " + maior);

	             System.out.print("Posições onde aparece: ");
	             for (int i = 0; i < 15; i++) {
	                 if (numeros[i] == maior) {
	                     System.out.print(i + " ");
	                 }
	             }
	}	             
             
	static void exercicio5() {
	        	 Scanner input = new Scanner(System.in);
	             double[] vetor = new double[8];
	        	  
	             for(int i = 0; i < vetor.length; i++) {
	     	        System.out.print("Digite o número para a posição " + i + ": ");
	     	        vetor[i] = input.nextInt();
	             }
	             for (int i = 0; i < vetor.length - 1; i++) {
	                 for (int j = 0; j < vetor.length - 1 - i; j++) {
	                     if (vetor[j] > vetor[j + 1]) {
	                         double temp = vetor[j];
	                         //guardar valor atual
	                         vetor[j] = vetor[j + 1];
	                         vetor[j + 1] = temp;
	                     }
	             System.out.println("números em ordem crescente: ");
	             for (double n : vetor) {
	            	 System.out.println(n);
	            	 
	       }
	    }
	}    
}
    
	static void exercicio6() {
	        	 Scanner input = new Scanner(System.in);
	             double[] numeros = new double[10];
	             double soma = 0;
	        	 
	             for(int i = 0; i < numeros.length; i++) {
		     	        System.out.print("Digite o número para a posição " + i + ": ");
		     	        numeros[i] = input.nextInt();
		     	        soma += numeros[i];
	             }
	             double media = soma /10;
	             System.out.println("Média: " + media);
	             System.out.println("Números acima da média:");
	             
	             for(int i =0; i < 10; i++) {
	            	 if (numeros[i] > media) {
	                     System.out.println(numeros[i]);
	             }
	             
	         }
}
}
   
