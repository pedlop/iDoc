package br.com.dominio;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListaUltimasAlteracoes {
	
	private List<UltimaAlteracao> listaAlteracoes;
	
	@Test
	public void testaLista() {
		this.listaAlteracoes = new ArrayList<UltimaAlteracao>();
		for( int i = 0; i < 10; i++ )
			this.listaAlteracoes.add( new UltimaAlteracaoTeste().getUltimaAlteracao() );
	}
	
	public List<UltimaAlteracao> getListaAlteracoes(){
		this.testaLista();
		return this.listaAlteracoes;
	}
}
