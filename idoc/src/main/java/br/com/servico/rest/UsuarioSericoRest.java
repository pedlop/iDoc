package br.com.servico.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dominio.Usuario;
import br.com.servico.ExcecaoNegcio;
import br.com.servico.UsuarioServico;

@RestController
public class UsuarioSericoRest {
	
	private UsuarioServico usuarioServico;
	
	@Autowired
	public UsuarioSericoRest( UsuarioServico usuarioServico ){
		this.usuarioServico = usuarioServico;
	}
	
	@RequestMapping( value = "/cadastrar/usuario", method = RequestMethod.POST )
	public MessagemUsuario cadastarUsuario( @RequestBody Usuario usuario ){
		try {
			this.usuarioServico.cadastrarUsuario(usuario);
			return new MessagemUsuario("Usuario Cadastrado com sucesso !");
		} catch (ExcecaoNegcio e) {
			return new MessagemUsuario("Usuario ja cadastrado !");
		}
	}
	
	public boolean logarSitema( Usuario usuario ){
		return this.usuarioServico.logarSistema(usuario);
	}
}
