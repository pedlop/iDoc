package br.com.dominio;

import static org.junit.Assert.*;

import org.junit.Test;

public class CorpoTeste {

	public Corpo corpo;

	@Test
	public void testaCamposCorpoSimples() {
		this.corpo = new Corpo(null, new ListaUltimasAlteracoes().getListaAlteracoes(), 
				new UltimaAlteracaoTeste().getUltimaAlteracao(), new CampoTeste().listaCampo(10, TipoCampo.caixaTextoSimples));
		assertEquals(false, this.corpo.equals(null));
	}
	
	@Test
	public void testaCamposCorpoMedio() {
		this.corpo = new Corpo(null, new ListaUltimasAlteracoes().getListaAlteracoes(), 
				new UltimaAlteracaoTeste().getUltimaAlteracao(), new CampoTeste().listaCampo(10, TipoCampo.caixaTextoMedia));
		assertEquals(false, this.corpo.equals(null));
	}
	
	@Test
	public void testaCamposCorpoGrande() {
		this.corpo = new Corpo(null, new ListaUltimasAlteracoes().getListaAlteracoes(), 
				new UltimaAlteracaoTeste().getUltimaAlteracao(), new CampoTeste().listaCampo(10, TipoCampo.caixaTextoGrande));
		assertEquals(false, this.corpo.equals(null));
	}
	
	@Test
	public void testaCamposTamanhoVariavel(){
		this.corpo = new Corpo(null, new ListaUltimasAlteracoes().getListaAlteracoes(), 
				new UltimaAlteracaoTeste().getUltimaAlteracao(), new CampoTeste().listaCampo(10, TipoCampo.caixaTextoGrande));
		this.corpo.camposCorpo().addAll(new CampoTeste().listaCampo(10, TipoCampo.caixaTextoSimples));
		this.corpo.camposCorpo().addAll(new CampoTeste().listaCampo(10, TipoCampo.caixaTextoMedia));
		assertEquals(false, this.corpo.equals(null));
	}

	@Test
	public void testaSetCodigoUnico() {
		this.testaCamposCorpoSimples();
		this.corpo.setCodigoUnico(10l);
		assertEquals( true, this.corpo.getCodigoUnico().equals(10l));
	}

	@Test
	public void testaGetCodigoUnico() {
		this.testaCamposCorpoSimples();
		assertEquals( true, this.corpo.getCodigoUnico().equals(0l));
	}

	@Test
	public void testaGetMarkdown() {
		this.testaCamposCorpoSimples();
		assertEquals( false, this.corpo.getMarkdown().equals(null));
	}

	
	public  Corpo getCorpoCamposSimples(){
		this.testaCamposCorpoSimples();
		return this.corpo;
	}
	
	public Corpo getCorpoCamposMedio(){
		this.testaCamposCorpoMedio();
		return this.corpo;
	}
	
	
	public Corpo getCorpoCamposGrande(){
		this.testaCamposCorpoGrande();
		return this.corpo;
	}
	
	public Corpo getCorpoTamanhoVariavel(){
		this.testaCamposTamanhoVariavel();
		return this.corpo;
	}
}
