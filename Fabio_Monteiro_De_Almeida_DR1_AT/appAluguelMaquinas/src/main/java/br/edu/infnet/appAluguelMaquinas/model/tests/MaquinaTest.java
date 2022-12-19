package br.edu.infnet.appAluguelMaquinas.model.tests;

import br.edu.infnet.appAluguelMaquinas.model.domain.Carregadeira;
import br.edu.infnet.appAluguelMaquinas.model.domain.Motoniveladora;
import br.edu.infnet.appAluguelMaquinas.model.exceptions.ValorZeradoException;

public class MaquinaTest {

	public static void main(String[] args) {
		
		try {
			Carregadeira b1 = new Carregadeira("b1caf5", "cafezin", 5, "Cooooffeeee");
			b1.setGrand(false);
			b1.setTamanho(500);
			System.out.println(b1);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Carregadeira b2 = new Carregadeira("b2cho10", "chopin", 10, "Brahhh");
			b2.setGrand(true);
			b2.setTamanho(300);
			System.out.println(b2);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Carregadeira b3 = new Carregadeira("b3suc8", "Suquin", 8, "Dafruta");
			b3.setGrand(true);
			b3.setTamanho(1000);
			System.out.println(b3);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			Motoniveladora m1 = new Motoniveladora("b1caf5", "cafezin", 5, "Cooooffeeee");
			m1.setGrand(false);
			m1.setTamanho(500);
			System.out.println(m1);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Motoniveladora m2 = new Motoniveladora("b2cho10", "chopin", 10, "Brahhh");
			m2.setGrand(true);
			m2.setTamanho(300);
			System.out.println(m2);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Motoniveladora m3 = new Motoniveladora("b3suc8", "Suquin", 8, "Dafruta");
			m3.setGrand(true);
			m3.setTamanho(1000);
			System.out.println(m3);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		
	}
}
