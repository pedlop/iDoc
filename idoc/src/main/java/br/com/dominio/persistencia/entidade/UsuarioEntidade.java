package br.com.dominio.persistencia.entidade;

/**
 * @author  Lucas Vinicios
 * @version 1.0
 * @see     2016-12-9
 * 
 * */

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.dominio.Usuario;

@Entity
@Table
public class UsuarioEntidade implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "id_usuario", sequenceName = "id_usurio_sequencia", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_usuario")
	private Long codigoUnico;
	
	@Column
	private String nome;
	
	@Column
	private String senha;
	
	@OneToMany
	private List<UltimaAlteracaoEntidade> ultimaAlteracao;
	
	public UsuarioEntidade(){
		
	}
	
	public UsuarioEntidade( Usuario usuario ){
		this.setUsuario(usuario);
	}
	
	public void setUsuario( Usuario usuario ){
		this.nome  = usuario.getNome();
		this.senha = usuario.getSenha(); 
	} 
	
	public Usuario getUsuario(){
		return new Usuario( this.nome, this.senha );
	}
	
}
