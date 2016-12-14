package br.com.dominio;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  Gabriel Barbosa
 * @version 1.0
 * @see     2016-12-10
 * 
 * Parte fundamental do sistema representa todos os 
 * documentos que fazem parte de um 
 * modelo de documentacao a ser adotado em um projeto.
 * */

public class Documento extends ParteDocumento{
	
	private Cabecalho cabecalho;
	
	private Introducao introducao;
	
	private List<Corpo> partesDocumento;
	
	/** Cria um novo documento com o cabecalho e 
	 *  introducao correspondentes mas caso o 
	 *  documento ja foi criado basta passar a 
	 *  lista das partes do documento.*/
	
	public Documento( Long codigoUnico,  Cabecalho cabecalho, Introducao introducao, List<UltimaAlteracao> historicoAlteracao, UltimaAlteracao ultimaAlteracao){
		super( codigoUnico, historicoAlteracao, ultimaAlteracao);
		this.partesDocumento = new ArrayList<Corpo>();
		this.cabecalho = cabecalho;
		this.introducao = introducao;
	}
	
	public Long getCodigoUnico() {
		return codigoUnico;
	}

	public void setCodigoUnico(Long codigoUnico) {
		this.codigoUnico = codigoUnico;
	}

	public Cabecalho getCabecalho() {
		return cabecalho;
	}

	public void setCabecalho(Cabecalho cabecalho) {
		this.cabecalho = cabecalho;
	}

	public Introducao getIntroducao() {
		return introducao;
	}

	public void setIntroducao(Introducao introducao) {
		this.introducao = introducao;
	}

	public List<Corpo> getPartesDocumento() {
		return partesDocumento;
	}

	public void setPartesDocumento(List<Corpo> partesDocumento) {
		this.partesDocumento = partesDocumento;
	}
	
	public List<UltimaAlteracao> getAlteracaoes(){
		return this.historicoAlteracao;
	}

	@Override
	public String getMarkdown() {
		StringBuilder textMarkdow = new StringBuilder();
		this.partesDocumento.forEach( a -> textMarkdow.append(a.getMarkdown()));
		return textMarkdow.toString();
	}
}
