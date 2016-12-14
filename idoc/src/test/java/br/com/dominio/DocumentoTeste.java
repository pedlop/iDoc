package br.com.dominio;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DocumentoTeste {

	private Documento documento;

	@Test
	public void testaDocumento() {
		this.documento = new Documento(null, new CabecalhoTeste().getCabecalho(), new IntroducaoTeste().getIntroducao(),
				new ListaUltimasAlteracoes().getListaAlteracoes(), new UltimaAlteracaoTeste().getUltimaAlteracao());
		assertEquals( false, this.documento.equals(null));
	}

	@Test
	public void testaGetCodigoUnico() {
		this.testaDocumento();
		assertEquals(false, this.documento.getCodigoUnico().equals(null));
		assertEquals(true, this.documento.getCodigoUnico().equals(0L));
	}

	@Test
	public void testaSetCodigoUnico() {
		this.testaDocumento();
		this.documento.setCodigoUnico(10l);
		assertEquals(true, this.documento.getCodigoUnico().equals(10l));
	}

	@Test
	public void testaGetCabecalho() {
		this.testaDocumento();
		assertEquals(false, this.documento.getCabecalho().equals(null));
	}

	@Test
	public void testaSetCabecalho() {
		this.testaDocumento();
		Cabecalho cabecalho;
		cabecalho = new CabecalhoTeste().getCabecalho();
		this.documento.setCabecalho(cabecalho);
		assertEquals( true, this.documento.getCabecalho().equals(cabecalho));
	}

	@Test
	public void testaGetIntroducao() {
		this.testaDocumento();
		assertEquals(false, this.documento.getIntroducao().equals(null));
	}

	@Test
	public void testaSetIntroducao() {
		this.testaDocumento();
		Introducao introducao;
		introducao = new IntroducaoTeste().getIntroducao();
		this.documento.setIntroducao(introducao);
		assertEquals( true, this.documento.getIntroducao().equals(introducao));
	}
	
	@Test
	public void testaSetPartesDocumento() {
		this.testaDocumento();
		List<Corpo> lista = new ArrayList<Corpo>();
		for( int i = 0; i < 10; i++ ){
			lista.add( new CorpoTeste().getCorpoCamposSimples());
			lista.add( new CorpoTeste().getCorpoCamposMedio());
			lista.add( new CorpoTeste().getCorpoCamposGrande());
		}
		this.documento.setPartesDocumento( lista );
	}
	

	@Test
	public void testaGetPartesDocumento() {
		this.testaDocumento();
		assertEquals( false, this.documento.getPartesDocumento().equals(null));
		assertEquals( true, this.documento.getPartesDocumento().size() == 0);
	}
	
	public Documento getDocumento(){
		this.testaDocumento();
		this.testaSetCabecalho();
		this.testaSetIntroducao();
		this.testaSetPartesDocumento();
		return this.documento;
	}
}
