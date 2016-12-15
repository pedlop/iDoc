package br.com.servico.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dominio.Campo;
import br.com.dominio.Corpo;
import br.com.dominio.UltimaAlteracao;
import br.com.servico.CorpoModeloServico;


@RestController
public class CorpoModeloRest {
	
	private CorpoModeloServico corpoModeloServico;
	
	@Autowired
	public CorpoModeloRest( CorpoModeloServico corpoModeloServico ){
		this.corpoModeloServico = corpoModeloServico;
	}
	
	@RequestMapping( value = "/cadastrar/modelo/corpo", method = RequestMethod.POST )
	public MessagemUsuario cadastrarModeloCorpo( @RequestBody UltimaAlteracao ultimaAlteracao, 
			@RequestBody List<Campo> camposCorpo){
		this.corpoModeloServico.cadastrarModeloCorpo(ultimaAlteracao, camposCorpo);
		return new MessagemUsuario("Modelo de corpo de documento cadastrado com sucesso !");
	}
	
	@RequestMapping( value = "/buscarTodos/modelo/corpo", method = RequestMethod.GET )
	public List<Corpo> buscarTodosCorpos(){
		return this.corpoModeloServico.buscarTodosCorpos();
	}
	
	@RequestMapping( value = "/deletar/modelo/corpo", method = RequestMethod.POST )
	public MessagemUsuario deletarCorpo( @RequestBody Corpo corpo ){
		this.corpoModeloServico.deletarModeloCorpo(corpo);
		return new MessagemUsuario(" Modelo de corpo de documento alterado com sucesso!");
	}
}
