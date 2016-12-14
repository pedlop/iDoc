package br.com.dominio.persistencia.idao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.dominio.persistencia.entidade.ModeloDocumentoEntidade;

@Repository
public interface IModeloDocumentoDao extends CrudRepository<ModeloDocumentoEntidade, Long>{

}
