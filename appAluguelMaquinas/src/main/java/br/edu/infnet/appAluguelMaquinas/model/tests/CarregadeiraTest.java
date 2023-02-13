package br.edu.infnet.appAluguelMaquinas.model.tests;

import br.edu.infnet.appAluguelMaquinas.model.domain.Carregadeira;
import br.edu.infnet.appAluguelMaquinas.model.exceptions.ModeloInvalidoException;
import br.edu.infnet.appAluguelMaquinas.model.exceptions.ValorZeradoException;

public class CarregadeiraTest {

	public static void main(String[] args) {
				
		try {
			Carregadeira c1 = new Carregadeira("CarregadeirasP", "Pás carregadeiras sobre rodas", 5, "Caterpillar");
			c1.setGrand(false);
			c1.setTamanho(5);
			System.out.println(c1);
			System.out.println("Valor aluguel = R$" + c1.calcularValoraluguel());
		} catch (ValorZeradoException | ModeloInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Carregadeira c1 = new Carregadeira("CarregadeirasP", "Pás carregadeiras sobre esteiras", 5, "Caterpillar");
			c1.setGrand(false);
			c1.setTamanho(2);
			System.out.println(c1);
			System.out.println("Valor aluguel = R$" + c1.calcularValoraluguel());
		} catch (ValorZeradoException | ModeloInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Carregadeira c2 = new Carregadeira("CarregadeirasG", "Pás carregadeiras sobre rodas", -10, "Caterpillar");
			c2.setGrand(true);
			c2.setTamanho(3);
			System.out.println(c2);
			System.out.println("Valor aluguel = R$" + c2.calcularValoraluguel());
		} catch (ValorZeradoException | ModeloInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Carregadeira c3 = new Carregadeira("CarregadeiraS", "Pás carregadeiras sobre esteiras", 0, "Caterpillar");
			c3.setGrand(true);
			c3.setTamanho(10);
			System.out.println(c3);
			System.out.println("Valor aluguel = R$" + c3.calcularValoraluguel());
		} catch (ValorZeradoException | ModeloInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
	}
}