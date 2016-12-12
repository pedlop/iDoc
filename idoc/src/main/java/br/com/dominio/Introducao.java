package br.com.dominio;

import java.util.List;

/**
 * @author  Gabriel Barbosa
 * @version 1.0
 * @see     2016-12-10
 * 
 * Parte obrigatoria em todo documento, 
 * resumo da finalidade do documento,
 * publico cliente daquele documento e etc... 
 * 
 * */

public class Introducao extends ParteDocumento{
	
	private Campo introducao;
	
	public Introducao( Long codigoUnico, List<UltimaAlteracao> historicoAlteracao, UltimaAlteracao ultimaAlteracao) {
		super(codigoUnico, historicoAlteracao, ultimaAlteracao);
		this.introducao = new Campo("Introdução ", 
				"Escreva arqui o propósito deste documento o público "
				+ "a quem se destina e outras informações que considere essencial ao mesmo.", 
				TipoCampo.caixaTextoMedia);
	}

	@Override
	public String getMarkdown() {
		String  textoMarkdown = "##Introdução\n ----\n";
		textoMarkdown += this.introducao.getConteudo();
		return textoMarkdown;
	}
	
	public void escreverIntroducao( String textoIntroducao ){
		this.introducao.setConteudo(textoIntroducao);
	}
}
