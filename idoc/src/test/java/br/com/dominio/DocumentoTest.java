package br.com.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class DocumentoTest {

	private Documento documento;

	@Before
	public void inicializaDocumento() {
		Usuario usuario = new Usuario("Usuario", "senhausuario");
		UltimaAlteracao ultimaAlteracao = new UltimaAlteracao(usuario, new Date());
		Cabecalho cabecalho = new Cabecalho(null, null, ultimaAlteracao, usuario);
		Introducao introducao = new Introducao(null, null, ultimaAlteracao);
		introducao.escreverIntroducao("INTRODUCAO DE TESTE");
		this.documento = new Documento(cabecalho, introducao, null, ultimaAlteracao);
	}

	@Test
	public void testAdicionaParteDocumento() {
		List<Campo> camposCorpo = new ArrayList<Campo>();
		camposCorpo.add(new Campo("ID", "Código de identificação único do campo.", TipoCampo.caixaTextoSimples));
		camposCorpo.add(new Campo("Atores", "Atores do caso de uso", TipoCampo.caixaTextoMedia));
		camposCorpo.add(new Campo("Fluxo Principal", "Coloque aqui o fluxo principal do caso de uso",
				TipoCampo.caixaTextoGrande));
		Corpo corpo = new Corpo(null, null, new UltimaAlteracao(new Usuario("Usuario", "senhausuario"), new Date()),
				camposCorpo);
		this.documento.adicionaParteDocumento(corpo);
		assert (true);
	}

	@Test
	public void testRemoveParteDocumento() {
		List<Campo> camposCorpo = new ArrayList<Campo>();
		camposCorpo.add(new Campo("ID", "Código de identificação único do campo.", TipoCampo.caixaTextoSimples));
		camposCorpo.add(new Campo("Atores", "Atores do caso de uso", TipoCampo.caixaTextoMedia));
		camposCorpo.add(new Campo("Fluxo Principal", "Coloque aqui o fluxo principal do caso de uso",
				TipoCampo.caixaTextoGrande));
		Corpo corpo = new Corpo(null, null, new UltimaAlteracao(new Usuario("Usuario", "senhausuario"), new Date()),
				camposCorpo);
		this.documento.adicionaParteDocumento(corpo);
		this.documento.removeParteDocumento(corpo);
		assert (true);
	}

}
