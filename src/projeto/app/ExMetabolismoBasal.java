package projeto.app;

import java.util.Scanner;

public class ExMetabolismoBasal {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Digite 1 se você é do sexo Masculino ou 2 para o sexo Feminino: ");
		int sexo = scanner.nextInt();
		
		System.out.println("Digite quantos anos você tem: ");
		int idade = scanner.nextInt();
		
		System.out.println("Digite abaixo qual é o seu peso em Kg: ");
		float peso = scanner.nextFloat();
		
		double mb = 0.0;
		
		if (sexo == 1){
			
			if (idade < 18) {
				System.out.println("Metabolismo basal não foi computado. Idade menor que 18 anos.");
			}
			
			else if(idade >= 18 && idade < 30){
	            mb = (15.057 * peso) + 679;
	        }
	        else if(idade > 30 && idade < 60){
	            mb = (11.6 * peso) + 879;
	        }
	        else if(idade >= 60){
	            mb= (13.5 * peso) + 487;
	        }
	    }
		
	    if (sexo == 2){
	        if(idade >= 18 && idade < 30){
	            mb = (14.7 * peso) + 486.6;
	        }
	        else if(idade > 30 && idade < 60){
	            mb = (8.7 * peso) + 829;
	        }
	        else if(idade >= 60){
	            mb= (10.5 * peso) + 596;
	        }
	    }
	    
	    System.out.println("Metabolismo basal:" + mb + "Kcal");
	    scanner.close();
	}
}
