package controllers;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Exame;
import entities.Medico;
import entities.Paciente;
import repositories.ExameRepository;

public class ExameController {

	public void cadastrarExame() {

		Scanner scanner = new Scanner(System.in);

		try {

			Medico medico = new Medico();

			System.out.println("\nNome do Médico:");
			medico.setNome(scanner.nextLine());

			System.out.println("\nEspecialidade:");
			medico.setEspecialidade(scanner.nextLine());

			System.out.println("\nCRM:");
			medico.setCrm(scanner.nextLine());

			System.out.println("\nID:");
			medico.setId(Integer.parseInt(scanner.nextLine()));

			Paciente paciente = new Paciente();

			System.out.println("\nNome do Paciente:");
			paciente.setNome(scanner.nextLine());

			System.out.println("\nIdade:");
			paciente.setIdade(Integer.parseInt(scanner.nextLine()));

			System.out.println("\nGênero (M/F):");
			String generoInput = scanner.nextLine().trim().toUpperCase();

			System.out.println("\nEndereço:");
			paciente.setEndereco(scanner.nextLine());

			System.out.println("\nID do Paciente:");
			paciente.setId(Integer.parseInt(scanner.nextLine()));

			Exame exame = new Exame();

			System.out.println("\nTipo de Exame:");
			exame.setTipo(scanner.nextLine());

			System.out.println("\nData do Exame:");
			exame.setData(new SimpleDateFormat("dd/mm/yyyy").parse(scanner.nextLine()));

			System.out.println("\nResultado do Exame:");
			exame.setResultado(scanner.nextLine());

			System.out.println("\nID:");
			exame.setId(Integer.parseInt(scanner.nextLine()));

			if (generoInput.length() == 1) {
				char genero = generoInput.charAt(0);
				if (genero == 'M' || genero == 'F') {
					paciente.setSexo(genero);
				} else {
					System.out.println("Gênero inválido. Por favor, insira 'M' ou 'F'.");
					return; // Sai do método se o gênero for inválido
				}
			} else {
				System.out.println("Gênero inválido. Por favor, insira 'M' ou 'F'.");
				return; // Sai do método se a entrada não for de um único caractere
				

			}

			ExameRepository exameRepository = new ExameRepository();

			exameRepository.exportarDados(exame);
			
			System.out.println("\nExame cadastrado com sucesso:");

		}

		catch (Exception e) {

			System.out.println("\n FALHA AO CADASTRAR EXAME!");
			System.out.println(e.getMessage());

		}

		scanner.close();

	}

}
