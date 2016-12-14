package br.com.servico.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dominio.Campo;
import br.com.dominio.TipoCampo;
import br.com.servico.CampoModeloServico;
import br.com.servico.ExcecaoNegcio;

@RestController
public class CampoModeloRest {
	
	private CampoModeloServico campoModeloServico;
	
	@Autowired
	public CampoModeloRest( CampoModeloServico campoModeloServico ){
		this.campoModeloServico = campoModeloServico;
	}
	
	@RequestMapping( name = "/cadastrar/modelo/campo", method = RequestMethod.POST )
	public MessagemUsuario cadastrarModeloCampo( @RequestBody String nomeCampo, 
			@RequestBody String textoAjuda, @RequestBody TipoCampo tipoCampo){
		try {
			this.campoModeloServico.cadastrarModeloCampo(nomeCampo, textoAjuda, tipoCampo);
			return new MessagemUsuario("Modelo de campo registrado com sucesso !");
		} catch (ExcecaoNegcio e) {
			return new MessagemUsuario(e.getMessage());
		}
	}
	
	@RequestMapping( name = "/buscaTodos/modelo/campo", method = RequestMethod.GET )
	public List<Campo> buscaModelosCampo(){
		return this.campoModeloServico.buscaTodosModelos();
	}
	
	@RequestMapping( name = "/deletar/modelo/campo", method = RequestMethod.GET )
	public MessagemUsuario deletarModeloCampo(@RequestBody Campo campo ){
		this.campoModeloServico.deletarCampo(campo);
		return new MessagemUsuario("Campo deletado com sucesso !!");
	}
}
