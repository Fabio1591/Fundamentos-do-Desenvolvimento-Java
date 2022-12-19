package br.edu.infnet.appAluguelMaquinas.model.tests;

import br.edu.infnet.appAluguelMaquinas.model.domain.Retroescavadeira;
import br.edu.infnet.appAluguelMaquinas.model.exceptions.ModeloInvalidoException;
import br.edu.infnet.appAluguelMaquinas.model.exceptions.ValorZeradoException;

public class RetroescavadeiraTest {

	public static void main(String[] args) {
				
		try {
			Retroescavadeira r1 = new Retroescavadeira("RetroescavadeiraP", "Retroescavadeira sobre rodas", 5, "Caterpillar");
			r1.setGrand(false);
			r1.setTamanho(5);
			System.out.println(r1);
			System.out.println("Valor aluguel = R$" + r1.calcularValoraluguel());
		} catch (ValorZeradoException | ModeloInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Retroescavadeira r1 = new Retroescavadeira("RetroescavadeiraP", "Retroescavadeira sobre rodas", 5, "Caterpillar");
			r1.setGrand(false);
			r1.setTamanho(2);
			System.out.println(r1);
			System.out.println("Valor aluguel = R$" + r1.calcularValoraluguel());
		} catch (ValorZeradoException | ModeloInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Retroescavadeira r2 = new Retroescavadeira("RetroescavadeiraG", "Retroescavadeira sobre steira", -10, "Caterpillar");
			r2.setGrand(true);
			r2.setTamanho(3);
			System.out.println(r2);
			System.out.println("Valor aluguel = R$" + r2.calcularValoraluguel());
		} catch (ValorZeradoException | ModeloInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Retroescavadeira r3 = new Retroescavadeira("MotoniveladoraS", "Retroescavadeira sobre esteiras", 0, "Caterpillar");
			r3.setGrand(true);
			r3.setTamanho(10);
			System.out.println(r3);
			System.out.println("Valor aluguel = R$" + r3.calcularValoraluguel());
		} catch (ValorZeradoException | ModeloInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
	}
}