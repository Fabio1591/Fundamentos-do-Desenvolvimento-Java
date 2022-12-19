package br.edu.infnet.appAluguelMaquinas.model.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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

public class ArquivoTest {

	public static void main(String[] args) {
		
		try {
			String arq = "pedidos.txt";
			
			try {
				FileReader fileR = new FileReader(arq);
				BufferedReader leitura = new BufferedReader(fileR);
				
				FileWriter fileW = new FileWriter("out_"+arq);
				BufferedWriter escrita = new BufferedWriter(fileW);
				
				String linha = leitura.readLine();			
				String[] campos = null;
				
				List<Maquina> maquinas = new ArrayList<Maquina>();
				Frota frota = null;

				while(linha != null) {
					
					campos = linha.split(";");
					
					switch (campos[0].toUpperCase()) {
					case "P":					
						try {						
							frota = new Frota(new Locador(campos[5], campos[3], campos[4]), maquinas);
							frota.setDescricao(campos[1]);
							frota.setWeb(Boolean.valueOf(campos[2]));
						} catch (LocadorInvalidoException | FrotaSemLocadorException | FrotaSemMaquinaException e) {
							System.out.println("[ERRO] " + e.getMessage());
						}

						break;
					case "B":					
						try {
							Carregadeira carregadeira = new Carregadeira(campos[1], campos[2], Float.valueOf(campos[3]), campos[5]);
							carregadeira.setGrand(Boolean.valueOf(campos[4]));
							carregadeira.setTamanho(Integer.valueOf(campos[6]));

							maquinas.add(carregadeira);
						} catch (ValorZeradoException e) {
							System.out.println("[ERRO] " + e.getMessage());
						}

						break;
					case "C":					
						break;
					case "S":					
						break;

					default:
						System.out.println("Registro inválido!!!");
						break;
					}

					linha = leitura.readLine();
				}
				
				escrita.write(frota.obterLinha());
				
				escrita.close();
				leitura.close();
				fileR.close();
			} catch (IOException e) {
				System.out.println("[ERRO] " + e.getMessage());
			} 
			
		} finally {
			System.out.println("Processamento realizado com sucesso!!!");
		}		
	}
}