package br.com.dominio;

import static org.junit.Assert.*;

import org.junit.Test;

public class CabecalhoTeste {

	private Cabecalho cabecalho;

	@Test
	public void testaCricaoCabecalho() {		
		this.cabecalho = new Cabecalho(null, new ListaUltimasAlteracoes().getListaAlteracoes(),
				new UltimaAlteracaoTeste().getUltimaAlteracao(), new UsuarioTeste().getUsuario());
		assertEquals(false, this.cabecalho.equals(null));
		
	}

	@Test
	public void testaGetCabecalho() {
		this.testaCricaoCabecalho();
		assertEquals( false, this.cabecalho.getCabecalho().equals(null));
	}

	@Test
	public void testaGetMarkdown() {
		this.testaCricaoCabecalho();
		assertEquals( false, this.cabecalho.getMarkdown().equals(null));
	}

	@Test
	public void testaEditarCabecalho() {
		this.testaCricaoCabecalho();
		this.cabecalho.editarCabecalho( new UsuarioTeste().getUsuario());
		assertEquals( false, this.cabecalho.equals(null));
	}
	
	public Cabecalho getCabecalho(){
		this.testaCricaoCabecalho();
		return this.cabecalho;
	}

}
