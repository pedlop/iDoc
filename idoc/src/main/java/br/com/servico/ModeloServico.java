package br.com.servico;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dominio.Documento;
import br.com.dominio.ModeloDocumentacao;
import br.com.dominio.UltimaAlteracao;
import br.com.dominio.persistencia.entidade.ModeloEntidade;
import br.com.dominio.persistencia.idao.IModeloDao;

@Service
public class ModeloServico {
	
	private IModeloDao iModeloDao;
	
	@Autowired
	public ModeloServico( IModeloDao iModeloDao){
		this.iModeloDao = iModeloDao;
	}
	
	public void cadastrarModelo( List<Documento> documentacaoModelo, UltimaAlteracao ultimaAlteracao){
		ModeloEntidade modEntidade = new ModeloEntidade();
		modEntidade.setDocumento(documentacaoModelo, ultimaAlteracao);
		this.iModeloDao.save(modEntidade);
	}
	
	public List<ModeloDocumentacao> buscarTodosModelos(){
		List<ModeloDocumentacao> lista = new ArrayList<ModeloDocumentacao>();
		List<ModeloEntidade> listaEntidade = (List<ModeloEntidade>) this.iModeloDao.findAll();
		for( ModeloEntidade modEntidade :  listaEntidade ){
			List<UltimaAlteracao> listaUltimasAlteacoes = new ArrayList<UltimaAlteracao>();
			modEntidade.getUltimasAlteracoes().forEach( a -> listaUltimasAlteacoes.add(a.getUltimaAlteracao()));
			lista.add( new ModeloDocumentacao( modEntidade.getCodigoUnico(),
					modEntidade.getDocumento(), 
					listaUltimasAlteacoes, 
					null));
		}
		return lista;
	}
	
	public void deletarModelo( ModeloDocumentacao modelo ){
		List<ModeloEntidade> lista = (List<ModeloEntidade>) this.iModeloDao.findAll();
		lista.stream()
		.filter( a -> a.getCodigoUnico().equals(modelo.getCodigoUnico()))
		.forEach( a -> this.iModeloDao.delete(a));
	}
	
	
}
