package br.com.dominio;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProjetoTeste {
	
	private Projeto projeto;

	@Test
	public void testaProjetoLongStringModeloDocumentacaoListOfUltimaAlteracaoUltimaAlteracao() {
		this.projeto = new Projeto(null, "Nome teste de Projeto", new ModeloDocumentoTeste().getModelo()
				, new ListaUltimasAlteracoes().getListaAlteracoes());
		assertEquals( false, this.projeto.equals(null));
	}

	@Test
	public void testaProjetoLongStringModeloDocumentacaoListOfUltimaAlteracao() {
		this.projeto = new Projeto(null, "Nome teste de Projeto", new ModeloDocumentoTeste().getModelo()
				, new ListaUltimasAlteracoes().getListaAlteracoes(), new UltimaAlteracaoTeste().getUltimaAlteracao());
		assertEquals( false, this.projeto.equals(null));
	}

	@Test
	public void testaProjetoLongStringModeloDocumentacaoUltimaAlteracao() {
		this.projeto = new Projeto(null, "Nome teste de Projeto", new ModeloDocumentoTeste().getModelo()
				, new UltimaAlteracaoTeste().getUltimaAlteracao());
		assertEquals( false, this.projeto.equals(null));
	}
	
	public Projeto getProjeto(){
		this.testaProjetoLongStringModeloDocumentacaoUltimaAlteracao();
		return this.projeto;
	}

}
