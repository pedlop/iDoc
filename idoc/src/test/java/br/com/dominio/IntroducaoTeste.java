package br.com.dominio;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntroducaoTeste {

	private Introducao introducao;

	@Test
	public void testaIntroducao() {
		this.introducao = new Introducao(null, new ListaUltimasAlteracoes().getListaAlteracoes(),
				new UltimaAlteracaoTeste().getUltimaAlteracao());
		assertEquals(false, this.introducao.equals(null));
	}

	@Test
	public void testaGetMarkdown() {
		this.testaIntroducao();
		assertEquals(false, this.introducao.getMarkdown().equals(null));
	}

	@Test
	public void testaGetAlteracoes() {
		this.testaIntroducao();
		assertEquals(false, this.introducao.getAlteracoes().equals(null));
	}

	@Test
	public void testaEscreverIntroducao() {
		this.testaIntroducao();
		this.introducao.escreverIntroducao("Texto da introducao, teste do test",
				new UltimaAlteracaoTeste().getUltimaAlteracao());
		assertEquals(false, this.introducao.getAlteracoes().equals(null));
	}
	
	public Introducao getIntroducao(){
		this.testaIntroducao();
		return this.introducao;
	}
}
