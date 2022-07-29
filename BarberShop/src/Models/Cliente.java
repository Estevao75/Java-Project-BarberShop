package Models;

import java.util.Date;

public class Cliente extends Pessoa{
			
	private String endereço;
	private int cep;
	public Cliente(int id, String nome, char sexo, Date dataNascimento, String email, int rg, String telefone, String endereço, int cep) {
		super(id, nome, sexo, dataNascimento, email, rg, telefone);
		this.endereço = endereço;
		this.cep = cep;
	}
	
	
	
	public Cliente(int id, String nome, String endereço, int cep) {
		super(id, nome);
		this.endereço = endereço;
		this.cep = cep;
	}



	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	
	
	
}	