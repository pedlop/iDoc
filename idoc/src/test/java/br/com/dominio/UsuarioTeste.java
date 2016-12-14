package br.com.dominio;

import static org.junit.Assert.*;
import org.junit.Test;

public class UsuarioTeste {
	
	private Usuario usuario;
	
	@Test
	public void testUsuario() {
		this.usuario = new Usuario("Nometeste", "Senhateste");
		assertEquals(true, this.usuario.getNome().equals("Nometeste"));
		assertEquals(true, this.usuario.getSenha().equals("Senhateste"));
		this.usuario.setNome("OutroNometeste");
		assertEquals(true,this.usuario.getNome().equals("OutroNometeste"));
		this.usuario.setSenha("OutroSenhateste");
		assertEquals(true,this.usuario.getSenha().equals("OutroSenhateste"));
		
	}
	
	public Usuario getUsuario(){
		this.testUsuario();
		return this.usuario;
	}
}
