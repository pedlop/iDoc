package br.com.dominio;

import java.util.Date;

/**
 * @author  gabriel
 * @version 1.0
 * @see 	2016-12-8
 * 
 * Classe para mapear historico de alteracoes
 * dos usuarios, funcionalidade de auditagem 
 * dos documentos.
 * */

public class UltimaAlteracao {
	
	private Usuario usuario;
	
	private Date    date;
	
	public UltimaAlteracao( Usuario usuario, Date date ){
		this.usuario = usuario; 
		this.date = date; 
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
