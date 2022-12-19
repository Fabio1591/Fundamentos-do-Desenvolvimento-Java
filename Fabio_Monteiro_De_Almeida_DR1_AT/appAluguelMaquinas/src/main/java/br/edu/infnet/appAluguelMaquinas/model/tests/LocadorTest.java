package br.edu.infnet.appAluguelMaquinas.model.tests;

import br.edu.infnet.appAluguelMaquinas.model.domain.Locador;
import br.edu.infnet.appAluguelMaquinas.model.exceptions.LocadorInvalidoException;

public class LocadorTest {

	public static void main(String[] args) {

		try {
			Locador s1 = new Locador("huguinho", "12312312312", "hugo@hugo.com");
			System.out.println(s1);
		} catch (LocadorInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Locador s2 = new Locador(null, "12312312312", "ze@ze.com");
			System.out.println(s2);
		} catch (LocadorInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Locador s3 = new Locador("luizinho", null, "luiz@luiz.com");
			System.out.println(s3);
		} catch (LocadorInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Locador s3 = new Locador("luizinho", "12312312312", null);
			System.out.println(s3);
		} catch (LocadorInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
	}
}