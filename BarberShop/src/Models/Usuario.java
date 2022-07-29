package Models;

import java.util.Date;

public class Usuario extends Pessoa {
	private int senha;
	private String nivelAcesso;
	
	public Usuario(int id, String nome, char sexo, Date dataNascimento, String email, int rg, String telefone, int senha, String nivelAcesso) {
		super(id, nome, sexo, dataNascimento, email, rg, telefone);
		this.senha = senha;
		this.nivelAcesso = nivelAcesso;
	}

	public Usuario(int id, String nome, int senha, String nivelAcesso) {
		super(id, nome);
		this.senha = senha;
		this.nivelAcesso = nivelAcesso;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(String nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}

	
	
		
}
