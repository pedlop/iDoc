package br.com.dominio;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author  Gabriel Barbosa
 * @version 1.0
 * @see     2016-12-8
 * 
 * Cabecalho necessario em todo documento criado pela ferramenta, 
 * este como a introducao e obrigatorio a todo documento.
 * */


public class Cabecalho extends ParteDocumento{
	
	private Campo cabecalho;
	
	/**
	 * Cosntroi cabecalho com todas as informacoes nexessarias
	 *  para comecar um novo documento.
	 * 
	 * */
	public Cabecalho( Long codigoUnico, List<UltimaAlteracao> historicoAlteracao, UltimaAlteracao ultimaAlteracao, Usuario usuario) {
		super(  codigoUnico , historicoAlteracao, ultimaAlteracao);
		this.cabecalho = new Campo("Cabeçalho ", "" , TipoCampo.caixaTextoSimples);
		this.editarCabecalho(usuario);
	}
	
	@Override
	public String getMarkdown() {
		String textoMarkdown = "Data|Autor\n";
		textoMarkdown += this.cabecalho.getConteudo();
		return textoMarkdown;
	}
	
	public void editarCabecalho( Usuario usuario ){
		Date data = new Date();
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		this.cabecalho.setConteudo( usuario.getNome() + " | " + formatador.format( data ));
	} 

}
