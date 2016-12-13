package br.com.dominio.persistencia.idao;
/**
 * @author  Lucas Vinicios
 * @version 1.0
 * @see     2016-12-10
 * 
 * */
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.dominio.persistencia.entidade.CampoEntidade;

@Repository
public interface ICampoDao extends CrudRepository<CampoEntidade, Long>{

}
