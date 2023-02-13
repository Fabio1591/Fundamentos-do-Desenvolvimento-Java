package br.edu.infnet.appAluguelMaquinas.model.tests;

import br.edu.infnet.appAluguelMaquinas.model.domain.Motoniveladora;
import br.edu.infnet.appAluguelMaquinas.model.exceptions.ModeloInvalidoException;
import br.edu.infnet.appAluguelMaquinas.model.exceptions.ValorZeradoException;

public class MotoniveladoraTest {

	public static void main(String[] args) {
				
		try {
			Motoniveladora m1 = new Motoniveladora("MotoniveladorasP", "Pás Motoniveladoras sobre rodas", 5, "Caterpillar");
			m1.setGrand(false);
			m1.setTamanho(5);
			System.out.println(m1);
			System.out.println("Valor aluguel = R$" + m1.calcularValoraluguel());
		} catch (ValorZeradoException | ModeloInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Motoniveladora m1 = new Motoniveladora("MotoniveladorasP", "Com Pá e implemento", 5, "Caterpillar");
			m1.setGrand(false);
			m1.setTamanho(2);
			System.out.println(m1);
			System.out.println("Valor aluguel = R$" + m1.calcularValoraluguel());
		} catch (ValorZeradoException | ModeloInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Motoniveladora m2 = new Motoniveladora("MotoniveladorasG", "Pás Motoniveladoras sobre rodas", -10, "Caterpillar");
			m2.setGrand(true);
			m2.setTamanho(3);
			System.out.println(m2);
			System.out.println("Valor aluguel = R$" + m2.calcularValoraluguel());
		} catch (ValorZeradoException | ModeloInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Motoniveladora m3 = new Motoniveladora("MotoniveladoraS", "Pás Motoniveladoras sobre esteiras", 0, "Caterpillar");
			m3.setGrand(true);
			m3.setTamanho(10);
			System.out.println(m3);
			System.out.println("Valor aluguel = R$" + m3.calcularValoraluguel());
		} catch (ValorZeradoException | ModeloInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
	}
}