package br.com.servico;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dominio.ModeloDocumentacao;
import br.com.dominio.Projeto;
import br.com.dominio.UltimaAlteracao;
import br.com.dominio.persistencia.entidade.ProjetoEntidade;
import br.com.dominio.persistencia.idao.IProjetoDao;

@Service
public class ProjetoServico {
	
	private IProjetoDao iProjetoDao;
	
	@Autowired
	public ProjetoServico( IProjetoDao iProjetoDao ){
		this.iProjetoDao = iProjetoDao;
	}
	
	public void cadastrarProjeto( String nomeProjeto, ModeloDocumentacao modelo, UltimaAlteracao ultimaAlteracao){
		ProjetoEntidade projetoEntidade = new ProjetoEntidade();
		projetoEntidade.setProjeto(nomeProjeto, modelo, ultimaAlteracao);
		this.iProjetoDao.save(projetoEntidade);
	}
	
	public List<Projeto> buscaTodosProjetos(){
		List<Projeto> listaProjeto = new ArrayList<Projeto>();
		this.iProjetoDao
		.findAll().forEach( a -> listaProjeto.add(a.getProjeto()));
		return listaProjeto;
	}
	
	public void deletarProjeto( Projeto projeto ){
		List<ProjetoEntidade> listaEntidade = (List<ProjetoEntidade>) this.iProjetoDao.findAll();
		listaEntidade.stream()
		.filter( a -> a.getProjeto().getCodigoUnico().equals(a.getProjeto().getCodigoUnico()))
		.forEach( a -> this.iProjetoDao.delete(a));
	}
	
	public void editarProjeto( Projeto projeto ){
		List<ProjetoEntidade> listaEntidade = (List<ProjetoEntidade>) this.iProjetoDao.findAll();
		listaEntidade.stream()
		.filter( a -> a.getProjeto().equals(a.getProjeto().getCodigoUnico()))
		.forEach(a -> this.iProjetoDao.save(a));
	}
	
}
