package repositories;

import java.io.PrintWriter;

import entities.Produto;

public class ProdutoRepositorie {

	public void exportarDados(Produto produto) throws Exception {

		PrintWriter printWriter = new PrintWriter("produto.xml");

		printWriter.write("<?xml version='1.0' encoding='iso-8859-1'?>");

		printWriter.write("<produto>");

		printWriter.write("<id>" + produto.getId() + "</id>");
		printWriter.write("<nome>" + produto.getNome() + "</nome>");
		printWriter.write("<descricao>" + produto.getDescricao() + "</descricao>");
		printWriter.write("<preco>" + produto.getPreco() + "</preco>");
		printWriter.write("<quantidade>" + produto.getQuantidade() + "</quantidade>");
		printWriter.write("<id>" + produto.getCategoria().getId() + "</id>");
		printWriter.write("<codigo>" + produto.getCategoria().getCodigo() + "</codigo>");
		printWriter.write("<>" + produto.getCategoria().getDescricao() + "</descricao>");
		
		printWriter.flush();
		printWriter.close();

	}

}
