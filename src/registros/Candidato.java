package registros;

import registros.Registro;

public class Candidato extends Registro{ //Classe para criacao de um objeto Candidato. Mais informacoes no classe Registro;
	
	private String nome;
	private int numero;
	private String municipio;
	private String partido;
	private char cargo;
	
	public Candidato(String linha) {
		String[] palavra = linha.split("; ");
		this.nome = palavra[0];
		this.numero = Integer.parseInt(palavra[1]);
		this.municipio = palavra[2];
		this.partido = palavra[3];
		this.cargo = palavra[4].charAt(0);
	}
	@Override
	public String getIndice() {
		return nome + ";" + numero + ";" + cargo;
	}

	@Override
	public String getNome() {
		return nome;
	}
	
	@Override
	public String getAssocia() {
		return municipio;
	}

	@Override
	public String toString(){
		return nome + ";" + numero + ";" + partido + ";" + cargo;
	}
}
