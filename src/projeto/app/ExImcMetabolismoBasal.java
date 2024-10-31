package projeto.app;

import java.util.Scanner;

public class ExImcMetabolismoBasal {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 para IMC, 2 para Metabolismo Basal e 3 para sair do programa:");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                
                System.out.println("Informe seu peso em kg:");
                float peso = scanner.nextFloat();

                System.out.println("Informe sua altura em metros:");
                float altura = scanner.nextFloat();

                float imc = peso / (altura * altura);

                System.out.println("Seu IMC é: " + imc);
                break;

            case 2:
                
                System.out.print("Digite 1 para sexo Masculino e 2 para sexo Feminino: ");
                int sexo = scanner.nextInt();

                System.out.print("Digite sua idade: ");
                int idade = scanner.nextInt();

                System.out.print("Digite seu peso em kg: ");
                peso = scanner.nextFloat();

                double mb = 0.0;

                if (sexo == 1) { 
                   
                	if (idade >= 18 && idade < 30) {
                        mb = 15.057 * peso + 679;
                    } 
                    else if (idade >= 30 && idade < 60) {
                        mb = 11.6 * peso + 879;
                    } 
                    else if (idade >= 60) {
                        mb = 13.5 * peso + 487;
                    }
                } 
                else if (sexo == 2) { 
                    
                	if (idade >= 18 && idade < 30) {
                        mb = 14.7 * peso + 486.6;
                    } 
                	else if (idade >= 30 && idade < 60) {
                        mb = 8.7 * peso + 829;
                    } 
                	else if (idade >= 60) {
                        mb = 10.5 * peso + 596;
                    }
                } 
                else {
                    System.out.println("Gênero inválido.");
                    break;
                }

                System.out.println("Seu metabolismo basal é de: " + mb + " Kcal");
                break;

            case 3:
                
                System.out.println("Programa finalizado!");
                break;

            default:
                System.out.println("Opção inválida. Escolha entre 1, 2 ou 3.");
                break;
        }

        scanner.close();
	}
}
