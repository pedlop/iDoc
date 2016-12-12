package br.com.dominio;

/**
 * @author  Gabriel Barbosa
 * @version 1.0
 * @see     2016-12-8
 * 
 * Classe para mapear usuario.
 */


public class Usuario {
	
	/**LOGIN UNICO DO USUARIO*/
	private String nome;
	
	/**SENHA DO USUARIO*/
	private String senha;
	
	public Usuario( String nome, String senha ){
		this.nome  = nome;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
