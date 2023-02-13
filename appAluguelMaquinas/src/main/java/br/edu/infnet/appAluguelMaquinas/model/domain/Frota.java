package br.edu.infnet.appAluguelMaquinas.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import br.edu.infnet.appAluguelMaquinas.model.exceptions.FrotaSemMaquinaException;
import br.edu.infnet.appAluguelMaquinas.model.exceptions.FrotaSemLocadorException;

public class Frota {

	private String descricao;
	private boolean web;
	private LocalDateTime data;
	private Locador locador;
	private List<Maquina> maquinas;
	
	public Frota(Locador locador, List<Maquina> maquinas) throws FrotaSemLocadorException, FrotaSemMaquinaException {
		
		if(locador == null) {
			throw new FrotaSemLocadorException("Não existe nenhum locador associado ao pedido!");
		}
		
		if(maquinas == null) {
			throw new FrotaSemMaquinaException("Não existe nenhum produto associado ao pedido!");
		}

		this.locador = locador;
		this.maquinas = maquinas;
		
		data = LocalDateTime.now();
	}
	
	public void imprimir(){
		System.out.println("Frota: " + this);
		System.out.println("Locador: " + locador);
		System.out.println("Qtde Maquinas: " + maquinas.size());
		System.out.println("Maquinas:");
		for(Maquina p : maquinas) {
			System.out.println("- " + p.getNome());
		}
	}
	
	public String obterLinha() {	
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("MM/yyyy");
		
		return this.getData().format(formato)+";"+
			   this.getDescricao()+";"+
			   this.getSolicitante()+";"+
			   this.getProdutos().size()+"\r\n";
	}
	
	
	@Override
	public String toString() {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		return  String.format("%s;%s;%s", 
				descricao, 
				web ? "web" : "loja",  
				data.format(formato)
			);
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isWeb() {
		return web;
	}
	public void setWeb(boolean web) {
		this.web = web;
	}
	public Locador getSolicitante() {
		return locador;
	}
	public List<Maquina> getProdutos() {
		return maquinas;
	}
	public LocalDateTime getData() {
		return data;
	}
}