package br.com.servico;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dominio.Cabecalho;
import br.com.dominio.Documento;
import br.com.dominio.Introducao;
import br.com.dominio.UltimaAlteracao;
import br.com.dominio.persistencia.entidade.ModeloDocumentoEntidade;
import br.com.dominio.persistencia.idao.IModeloDocumentoDao;

@Service
public class DocumentoModeloServico {
	
	private IModeloDocumentoDao iModeloDocumentoDao;

	@Autowired
	public DocumentoModeloServico( IModeloDocumentoDao iModeloDocumentoDao ){
		this.iModeloDocumentoDao = iModeloDocumentoDao;
	}
	
	public void cadastrarModeloDocumento( Cabecalho cabecalho, Introducao introducao, UltimaAlteracao ultimaAlteracao){
		Documento documento    = new Documento(null, cabecalho, introducao, null, ultimaAlteracao);
		ModeloDocumentoEntidade docEntidade = new ModeloDocumentoEntidade();
		docEntidade.setModelo(documento);
	}
	
	public List<Documento> buscarTodosDocumento(){
		List<Documento> lista = new ArrayList<Documento>();
		this.iModeloDocumentoDao
		.findAll().forEach( a -> lista.add(a.getModelo()));
		return lista;
	}
	
	public void deletarModeloDocumento( Documento documento ){
		List<ModeloDocumentoEntidade> lista = (List<ModeloDocumentoEntidade>) this.iModeloDocumentoDao.findAll();
		lista.stream()
		.filter( a -> a.getModelo().getCodigoUnico().equals(documento.getCodigoUnico()))
		.forEach( a -> this.iModeloDocumentoDao.delete(a));
	}
}
