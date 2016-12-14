package br.com.dominio.persistencia.idao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.dominio.persistencia.entidade.ModeloCampoEntidade;

@Repository
public interface IModeloCampoDao extends CrudRepository<ModeloCampoEntidade, Long>{

}
