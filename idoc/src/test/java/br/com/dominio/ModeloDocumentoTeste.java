package br.com.dominio;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ModeloDocumentoTeste {

	private ModeloDocumentacao modelo;

	@Test
	public void testModeloDocumentacao() {
		List<Documento> lista = new ArrayList<Documento>();
		for (int i = 0; i < 10; i++)
			lista.add(new DocumentoTeste().getDocumento());
		this.modelo = new ModeloDocumentacao(null, lista, new ListaUltimasAlteracoes().getListaAlteracoes(),
				new UltimaAlteracaoTeste().getUltimaAlteracao());
		assertEquals(false, this.modelo.equals(null));
	}
	
	public ModeloDocumentacao getModelo(){
		return this.modelo;
	}
}
