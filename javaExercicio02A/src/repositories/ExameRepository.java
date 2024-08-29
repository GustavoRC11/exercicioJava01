package repositories;

import java.io.PrintWriter;

import entities.Exame;

public class ExameRepository {

	public void exportarDados(Exame exame) throws Exception {

		PrintWriter printWriter = new PrintWriter("exame.xml");

		printWriter.write("<?xml version='1.0' encoding='iso-8859-1'?>");

		printWriter.write("<exame>");

	}

}
