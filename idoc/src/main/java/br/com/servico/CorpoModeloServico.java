package br.com.servico;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dominio.Campo;
import br.com.dominio.Corpo;
import br.com.dominio.UltimaAlteracao;
import br.com.dominio.persistencia.entidade.ModeloCorpoEntidade;
import br.com.dominio.persistencia.idao.IModeloCorpoDao;

@Service
public class CorpoModeloServico {
	
	private IModeloCorpoDao iModeloCorpoDao;
	
	@Autowired
	public CorpoModeloServico( IModeloCorpoDao iModeloCorpoDao ){
		this.iModeloCorpoDao = iModeloCorpoDao;
	}
	
	public void cadastrarModeloCorpo( UltimaAlteracao ultimaAlteracao, List<Campo> camposCorpo ){
		Corpo corpo = new Corpo(null, null, ultimaAlteracao, camposCorpo);
		ModeloCorpoEntidade modelo = new ModeloCorpoEntidade();
		modelo.setModelo(corpo);
		this.iModeloCorpoDao.save(modelo);
	}
	
	public List<Corpo> buscarTodosCorpos(){
		List<Corpo> lista = new ArrayList<Corpo>();
		this.iModeloCorpoDao
		.findAll().forEach( a -> lista.add(a.getCorpo()));
		return lista;
	}
	
	public void deletarModeloCorpo( Corpo corpo ){
		List<ModeloCorpoEntidade> lista = (List<ModeloCorpoEntidade>) this.iModeloCorpoDao.findAll();
		lista.stream()
		.filter( a -> a.getCorpo().getCodigoUnico().equals( corpo.getCodigoUnico()))
		.forEach( a -> this.iModeloCorpoDao.delete(a));
	}
}
