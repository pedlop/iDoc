package br.com.dominio.persistencia.idao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.dominio.persistencia.entidade.ModeloCorpoEntidade;

@Repository
public interface IModeloCorpoDao extends CrudRepository<ModeloCorpoEntidade, Long>{

}
