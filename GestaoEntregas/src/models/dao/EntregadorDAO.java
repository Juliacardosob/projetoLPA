package models.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import models.Entregador;

public class EntregadorDAO {

	BufferedWriter bw;
	BufferedReader br;
	String arquivo = ".\\bd\\entregador.csv";

	public boolean salvar(ArrayList<Entregador> entregadores) {

		boolean retorno = false;
		try {
			bw = new BufferedWriter(new FileWriter(arquivo,false));

			for(Entregador entregador: entregadores) {
				bw.write(entregador.toCSV());
			}

			bw.close();
			retorno = true;
		} catch (IOException e) {
			System.out.println("Erro ao salvar:"+e);
		}

		return retorno;
	}

	public ArrayList<Entregador> retornar(){
		ArrayList<Entregador> entregadores = new ArrayList<Carteira>();
		String[] campos;
		Entregador entregador;

		try {
			br = new BufferedReader(new FileReader(arquivo));
			String linha;

				linha = br.readLine();

			while(linha!=null) {
				campos = linha.split(";");
				entregador = new Entregador();
				entregador.setId(Integer.parseInt(campos[0]));
				entregador.setNome(campos[1]);
				entregador.setPerfilDeInvestimento(campos[2]);
				entregador.setLucroEsperado(Double.parseDouble(campos[3]));
				entregador.setPrejuizoMaximo(Double.parseDouble(campos[4]));
				entregadores.add(entregador);
				linha = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao retornar, arquivo não encontrado:"+e);
		} catch (IOException e) {
			System.out.println("Erro ao retornar, erro na leitura da linha:"+e);
		} 

		return entregadores;

	}

}