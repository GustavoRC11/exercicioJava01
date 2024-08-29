package contollers;

import java.util.Scanner;
import java.util.UUID;

import entities.Categoria;
import entities.Produto;
import repositories.ProdutoRepositorie;

public class ProdutoContoller {

	public void cadastrarProduto() {

		Scanner scanner = new Scanner(System.in);

		try {

			Produto produto = new Produto();

			produto.setId(UUID.randomUUID());

			System.out.println("\nInsira o nome do produto:");
			produto.setNome(scanner.nextLine());

			System.out.println("\nInsira a descrição do produto:");
			produto.setDescricao(scanner.nextLine());

			System.out.println("\nInsira o preço do produto:");
			produto.setPreco(Double.parseDouble(scanner.nextLine()));

			System.out.println("\nInsira a quantidade do produto:");
			produto.setQuantidade(Integer.parseInt(scanner.nextLine()));

			produto.setCategoria(new Categoria());

			produto.getCategoria().setId(UUID.randomUUID());

			System.out.println("\nInsira o código do produto:");
			produto.getCategoria().setCodigo(scanner.nextLine());

			System.out.println("\nDescrição do produto:");
			produto.getCategoria().setDescricao(scanner.nextLine());

			ProdutoRepositorie produtoRepositorie = new ProdutoRepositorie();
			produtoRepositorie.exportarDados(produto);
			System.out.println("\nPRODUTO CADASTRADO COM SUCESSO.");

		}

		catch (Exception e) {

			System.out.println("\nFalha ao cadastrar produto:");
			System.out.println(e.getMessage());

		}

		scanner.close();

	}

}
