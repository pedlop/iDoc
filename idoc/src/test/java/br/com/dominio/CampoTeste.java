package br.com.dominio;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CampoTeste {

	private Campo campo;
	
	@Test
	public void testaCampoSimples() {
		this.campo = new Campo("NomeCampo", "TextoAjuda Campo", TipoCampo.caixaTextoSimples );
		assertEquals( false, this.campo.equals(null));
	}

	@Test
	public void testaCampoMedio() {
		this.campo = new Campo("NomeCampo", "TextoAjuda Campo", TipoCampo.caixaTextoMedia );
		assertEquals( false, this.campo.equals(null));
	}
	
	@Test
	public void testaCampoGrande() {
		this.campo = new Campo("NomeCampo", "TextoAjuda Campo", TipoCampo.caixaTextoGrande );
		assertEquals( false, this.campo.equals(null));
	}

	@Test
	public void testaGetCodigoUnico() {
		this.testaCampoGrande();
		assertEquals( true, this.campo.getCodigoUnico().equals(0l));
	}

	@Test
	public void testaSetCodigoUnico() {
		this.testaCampoGrande();
		this.campo.setCodigoUnico(10l);
		assertEquals( true, this.campo.getCodigoUnico().equals(10l));
		
	}

	@Test
	public void testaSetTipoCampo() {
		this.testaCampoMedio();
		this.campo.setTipoCampo(TipoCampo.caixaTextoGrande);
		assertEquals( true, this.campo.getTipoCampo().equals(TipoCampo.caixaTextoGrande));
	}

	@Test
	public void testGetTipoCampo() {
		this.testaCampoSimples();
		assertEquals(true, this.campo.getTipoCampo().equals(TipoCampo.caixaTextoSimples));
	}

	@Test
	public void testGetNomeCampo() {
		this.testaCampoSimples();
		assertEquals( true, this.campo.getNomeCampo().equals("NomeCampo"));
	}

	@Test
	public void testSetNomeCampo() {
		this.testaCampoSimples();
		this.campo.setNomeCampo("OutroNomeCampo");
		assertEquals(true, this.campo.getNomeCampo().equals("OutroNomeCampo"));
	}

	@Test
	public void testGetTextoAjudaCampo() {
		this.testaCampoSimples();
		assertEquals( true, this.campo.getTextoAjudaCampo().equals("TextoAjuda Campo"));
	}

	@Test
	public void testSetTextoAjudaCampo() {
		this.testaCampoSimples();
		this.campo.setTextoAjudaCampo("OutroTextoAjuda Campo");
		assertEquals( true, this.campo.getTextoAjudaCampo().equals("OutroTextoAjuda Campo"));
	}

	@Test
	public void testGetConteudo() {
		this.testaCampoSimples();
		try{
		@SuppressWarnings("unused")
		String conteudo = this.campo.getConteudo();
		}
		catch( Exception e ){
			assertEquals(true, e instanceof java.lang.NullPointerException );
		}
	}

	@Test
	public void testSetConteudo() {
		this.testaCampoSimples();
		this.campo.setConteudo("Conteudo qualquer para preencher o campo.");
		assertEquals( true, this.campo.getConteudo().equals("Conteudo qualquer para preencher o campo."));
	}
	
    private Campo criaCampoSimples(){
    	return  new Campo(null,"NomeCampo", "TextoAjuda Campo", TipoCampo.caixaTextoSimples, "CONTEUDO DO SIMPLES");
	}
	
	private Campo criaCampoMedio(){
		 return new Campo(null,"NomeCampo", "TextoAjuda Campo", TipoCampo.caixaTextoMedia, "CONTEUDO DO MEDIO" );
	}
	
	private Campo criaCampoGrande(){
		return new Campo(null,"NomeCampo", "TextoAjuda Campo", TipoCampo.caixaTextoGrande, "CONTEUDO DO GRUPO" );
	}
	
	public List<Campo> listaCampo( int qtdCampo, TipoCampo tipo){
		List<Campo> lista = new ArrayList<Campo>();
		for( int i = 0; i < qtdCampo; i++ ){
			switch( tipo ){
				case caixaTextoSimples:
					lista.add(this.criaCampoSimples());
				break;
				case caixaTextoMedia:
					lista.add(this.criaCampoMedio());
				break;
				case caixaTextoGrande:
					lista.add(this.criaCampoGrande());
				break;
			}
		}
		return lista;
	}

}
