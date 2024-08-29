package main;

import java.util.Scanner;
import java.util.UUID;

import entities.Funcionario;

public class Main {

	public static void main(String[] args) {

		System.out.println("***CADASTRO DE FUNCIONÁRIO***");
		
		Scanner scanner = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setId(UUID.randomUUID());
		
		System.out.println("\nInforme o Nome do Funcimonário:");
		funcionario.setNome(scanner.nextLine());
		
		System.out.println("\nInforme o CPF do Funcionário:");
		funcionario.setCpf(scanner.nextLine());
		
		System.out.println("\nInforme a Mátricula do Funcionário");
		funcionario.setMatricula(scanner.nextLine());
		
		System.out.println("\nInforme o Salário do Funcionario ");
		funcionario.setSalario(Double.parseDouble(scanner.nextLine()));
		
		System.out.println("\nDADOS DO FUNCIONÁRIO:");
		System.out.println("ID.......:" + funcionario.id);
		System.out.println("Nome.....:" + funcionario.nome);
		System.out.println("CPF......:" + funcionario.cpf);
		System.out.println("Matricula.......:" + funcionario.matricula);
		System.out.println("Salário......" + funcionario.salario );
		
		

	}

}
