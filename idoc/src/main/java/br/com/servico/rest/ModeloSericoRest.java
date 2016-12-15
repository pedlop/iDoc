package br.com.servico.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dominio.Documento;
import br.com.dominio.ModeloDocumentacao;
import br.com.dominio.UltimaAlteracao;
import br.com.servico.ModeloServico;

@RestController
public class ModeloSericoRest {
	
	private ModeloServico modeloServico;
	
	@Autowired
	public ModeloSericoRest( ModeloServico modeloServico ){
		this.modeloServico = modeloServico;
	}
	
	@RequestMapping( value = "/cadastrar/modelo/modeloDocumentacao", method = RequestMethod.POST )
	public MessagemUsuario cadastrarModeloDocumentacao( @RequestBody List<Documento> documentacaoModelo, 
			@RequestBody UltimaAlteracao ultimaAlteracao){
		this.modeloServico.cadastrarModelo(documentacaoModelo, ultimaAlteracao);
		return new MessagemUsuario(" Modelo de documentacao cadastrado com sucesso !");
	}
	
	@RequestMapping( value = "/buscarTodos/modelo/modeloDocumentacao", method = RequestMethod.GET )
	public List<ModeloDocumentacao> buscarTodosModelos(){
		return this.modeloServico.buscarTodosModelos();
	}
	
	@RequestMapping( value = "/deletar/modelo/modeloDocumentacao", method = RequestMethod.POST )
	public MessagemUsuario deletarModelo( @RequestBody ModeloDocumentacao modelo ){
		this.modeloServico.deletarModelo(modelo);
		return new MessagemUsuario("Modelo de documentacao deletado com sucesso!");
	}
}