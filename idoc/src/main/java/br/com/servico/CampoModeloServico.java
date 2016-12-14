package br.com.servico;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dominio.Campo;
import br.com.dominio.TipoCampo;
import br.com.dominio.persistencia.entidade.ModeloCampoEntidade;
import br.com.dominio.persistencia.idao.IModeloCampoDao;

@Service
public class CampoModeloServico {
	
	private IModeloCampoDao iModeloCampoDao;
	
	@Autowired
	public CampoModeloServico( IModeloCampoDao iModeloCampoDao ){
		this.iModeloCampoDao = iModeloCampoDao;
	}
	
	public void cadastrarModeloCampo( String nomeCampo, String textoAjuda, TipoCampo tipoCampo) throws ExcecaoNegcio{
		if( nomeCampo == null )
			throw new ExcecaoNegcio(" Para cadastrar o campo e necessario informar o nome! ");
		if( textoAjuda == null )
			throw new ExcecaoNegcio(" Tetxo da de ajuda e obrigatorio! ");
		if( tipoCampo == null )
			throw new ExcecaoNegcio(" TIpo do campo nulo! ");
		Campo campo = new Campo(nomeCampo, textoAjuda, tipoCampo);
		ModeloCampoEntidade modelo = new ModeloCampoEntidade();
		modelo.setModelo(campo);
		this.iModeloCampoDao.save( modelo );
	}
	
	public List<Campo> buscaTodosModelos(){
		List<Campo> lista = new ArrayList<Campo>();
		this.iModeloCampoDao.findAll().forEach( a -> lista.add(a.getModelo()));
		return lista;
	}
	
	public void deletarCampo( Campo campo ){
		List<ModeloCampoEntidade> lista = (List<ModeloCampoEntidade>)this.iModeloCampoDao.findAll();
		lista.stream()
		.filter( a -> a.getModelo().getCodigoUnico().equals(campo.getCodigoUnico()))
	    .forEach( a -> this.iModeloCampoDao.delete(a));
	}
}
