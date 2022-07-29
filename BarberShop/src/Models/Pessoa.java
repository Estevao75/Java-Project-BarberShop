package Models;

import java.util.Date;

public class Pessoa {
	
	protected  int id;
	protected String nome;
	protected char sexo;
	protected Date dataNascimento;
	protected String email;
	protected int rg;
	protected String telefone;
	
	public Pessoa(int id, String nome) {
		
		this.id = id;
		this.nome = nome;
	}

	public Pessoa(int id, String nome, char sexo, Date dataNascimento, String email, int rg, String telefone) {
		
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.rg = rg;
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
