package projeto.app;

import java.util.Scanner;

public class ExImc {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu peso em kg: ");
        float peso = scanner.nextFloat();

        System.out.println("Digite sua altura em metros: ");
        float altura = scanner.nextFloat();

        float imc = peso / (altura * altura);

        if (imc < 19) {
			System.out.println(nome+",seu IMC é: "+ imc +". Cuidado! Você está abaixo do peso.");
		} 
		else if (imc >= 19 && imc < 25) {
			System.out.println(nome+",seu IMC é: "+ imc +". Parabéns! Você está no peso ideal.");
			} 
		else if (imc >= 25 && imc < 30) {
			System.out.println(nome+",seu IMC é: "+ imc +". Você está com sobrepeso.");
			}
		else if (imc >= 30 && imc < 40) {
			System.out.println(nome+",seu IMC é: "+ imc +". Cuidado! Você está com obesidade tipo 1.");
			}
		else if (imc >= 40) {
			System.out.println(nome+",seu IMC é: "+ imc +". Cuidado! Você está com obesidade mórbida.");
			}

        scanner.close();
       
	}
}
