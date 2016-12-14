package br.com.dominio;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class UltimaAlteracaoTeste {
	
	private UltimaAlteracao ultimaAlteracao;
	
	@Test
	public void testUltimaAlteracao() {
		this.ultimaAlteracao = new UltimaAlteracao( new UsuarioTeste().getUsuario(), new Date());
		assertEquals(false, this.ultimaAlteracao.equals(null));
	}

	@Test
	public void testGetUsuario() {
		this.testUltimaAlteracao();
		assertEquals(false, this.ultimaAlteracao.getUsuario().equals(null));
	}

	@Test
	public void testSetUsuario() {
		this.testUltimaAlteracao();
		this.ultimaAlteracao.setUsuario( new UsuarioTeste().getUsuario());
		assertEquals(false, this.ultimaAlteracao.getUsuario().equals(null));
	}

	@Test
	public void testGetDate() {
		this.testUltimaAlteracao();
		assertEquals(false, this.ultimaAlteracao.getDate().equals(null));
	}

	@Test
	public void testSetDate() {
		this.testUltimaAlteracao();
		this.ultimaAlteracao.setDate( new Date());
		assertEquals(false, this.ultimaAlteracao.getDate().equals(null));
	}
	
	public UltimaAlteracao getUltimaAlteracao(){
		this.testUltimaAlteracao();
		return this.ultimaAlteracao;
	}
}
