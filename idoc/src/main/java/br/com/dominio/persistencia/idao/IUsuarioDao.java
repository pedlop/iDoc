package br.com.dominio.persistencia.idao;

/**
 * @author  Lucas Vinicios
 * @version 1.0
 * @see     2016-12-9
 * 
 * */

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.dominio.persistencia.entidade.UsuarioEntidade;

@Repository
public interface IUsuarioDao extends CrudRepository<UsuarioEntidade, Long>{

}
