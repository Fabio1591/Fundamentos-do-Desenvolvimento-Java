package br.edu.infnet.appAluguelMaquinas.model.tests;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.appAluguelMaquinas.model.domain.Carregadeira;
import br.edu.infnet.appAluguelMaquinas.model.domain.Frota;
import br.edu.infnet.appAluguelMaquinas.model.domain.Maquina;
import br.edu.infnet.appAluguelMaquinas.model.domain.Locador;
import br.edu.infnet.appAluguelMaquinas.model.exceptions.FrotaSemMaquinaException;
import br.edu.infnet.appAluguelMaquinas.model.exceptions.FrotaSemLocadorException;
import br.edu.infnet.appAluguelMaquinas.model.exceptions.LocadorInvalidoException;
import br.edu.infnet.appAluguelMaquinas.model.exceptions.ValorZeradoException;

public class FrotaTest {

	public static void main(String[] args) {
		List<Maquina> produtosP1 = new ArrayList<Maquina>();
		List<Maquina> produtosP2 = new ArrayList<Maquina>();
		List<Maquina> produtosP3 = new ArrayList<Maquina>();
		List<Maquina> produtosP4 = new ArrayList<Maquina>();

		try {
			Carregadeira b1 = new Carregadeira("RetroescavadeiraP", "cafezin", 5, "Caterpillar");
			b1.setGrand(false);
			b1.setTamanho(500);

			produtosP1.add(b1);
			produtosP2.add(b1);
			produtosP4.add(b1);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Carregadeira b2 = new Carregadeira("RetroescavadeiraP", "Retroescavadeira sobre rodas", 5, "Caterpillar");
			b2.setGrand(true);
			b2.setTamanho(300);

			produtosP2.add(b2);
			produtosP3.add(b2);
			produtosP4.add(b2);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Carregadeira b3 = new Carregadeira("CarregadeirasP", "Pás carregadeiras sobre esteiras", 5, "Caterpillar");
			b3.setGrand(true);
			b3.setTamanho(1000);

			produtosP3.add(b3);
			produtosP4.add(b3);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Frota p1 = new Frota(new Locador("huguinho", "12312312312", "hugo@hugo.com"), produtosP1);
			p1.setDescricao("Primeiro pedido");
			p1.setWeb(false);
			p1.imprimir();
		} catch (LocadorInvalidoException | FrotaSemLocadorException | FrotaSemMaquinaException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Frota p2 = new Frota(new Locador("zezinho", "12312312312", "ze@ze.com"), produtosP2);
			p2.setDescricao("Segundo pedido");
			p2.setWeb(true);
			p2.imprimir();
		} catch (LocadorInvalidoException | FrotaSemLocadorException | FrotaSemMaquinaException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Frota p3 = new Frota(new Locador("luizinho", "12312312312", "luiz@luiz.com"), produtosP3);
			p3.setDescricao("Terceiro pedido");
			p3.setWeb(true);
			p3.imprimir();
		} catch (LocadorInvalidoException | FrotaSemLocadorException | FrotaSemMaquinaException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Frota p4 = new Frota(new Locador("mariazinha", "12312312312", "maria@maria.com"), produtosP4);
			p4.setDescricao("Quarto pedido");
			p4.setWeb(true);
			p4.imprimir();
		} catch (LocadorInvalidoException | FrotaSemLocadorException | FrotaSemMaquinaException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Frota p5 = new Frota(null, produtosP4);
			p5.setDescricao("Quinto pedido");
			p5.setWeb(true);
			p5.imprimir();
		} catch (FrotaSemLocadorException | FrotaSemMaquinaException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Locador s6 = new Locador("mariazinha", "12312312312", "maria@maria.com");
		
			Frota p6 = new Frota(s6, null);
			p6.setDescricao("Sexto pedido");
			p6.setWeb(true);
			p6.imprimir();
		} catch (LocadorInvalidoException | FrotaSemLocadorException | FrotaSemMaquinaException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
	}
}