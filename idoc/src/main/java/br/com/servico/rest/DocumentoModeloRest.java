package br.com.servico.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dominio.Cabecalho;
import br.com.dominio.Documento;
import br.com.dominio.Introducao;
import br.com.dominio.UltimaAlteracao;
import br.com.servico.DocumentoModeloServico;

@RestController
public class DocumentoModeloRest {
	
	private DocumentoModeloServico documentoModeloServico;
	
	@Autowired
	public DocumentoModeloRest(DocumentoModeloServico documentoModeloServico ){
		this.documentoModeloServico = documentoModeloServico;
	}
	
	@RequestMapping( name = "/cadastrar/modelo/documento", method = RequestMethod.POST )
	public MessagemUsuario cadastarModeloDocumento( @RequestBody Cabecalho cabecalho,
			@RequestBody Introducao introducao, @RequestBody UltimaAlteracao ultimaAlteracao){
		this.documentoModeloServico.cadastrarModeloDocumento(cabecalho, introducao, ultimaAlteracao);
	    return new MessagemUsuario(" Modelo de documentacao cadastrado com sucesso !");
	}
	
	@RequestMapping( name = "/buscarTodos/modelo/documento", method = RequestMethod.GET )
	public List<Documento> buscarTodosModelos(){
		return this.documentoModeloServico.buscarTodosDocumento();
	}
	
	@RequestMapping( name = "/deletar/modelo/documento", method = RequestMethod.POST )
	public MessagemUsuario deletarModelo( @RequestBody Documento modelo ){
		this.documentoModeloServico.deletarModeloDocumento(modelo);
		return new MessagemUsuario("Modelo de documentacao deletado com sucesso!");
	}
}
