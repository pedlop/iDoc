package br.com.servico;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dominio.Usuario;
import br.com.dominio.persistencia.entidade.UsuarioEntidade;
import br.com.dominio.persistencia.idao.IUsuarioDao;

@Service
public class UsuarioServico {

	private IUsuarioDao iUsuarioDao;

	@Autowired
	public UsuarioServico(IUsuarioDao iUsuarioDao) {
		this.iUsuarioDao = iUsuarioDao;
	}

	public void cadastrarUsuario(Usuario usuario) throws ExcecaoNegcio {
		if (this.logarSistema(usuario))
			throw new ExcecaoNegcio("Usuario ja cadastrado !!");
		UsuarioEntidade usuarioEntidade = new UsuarioEntidade();
		usuarioEntidade.setUsuario(usuario);
		this.iUsuarioDao.save(usuarioEntidade);
	}

	public boolean logarSistema(Usuario usuario) {
		List<UsuarioEntidade> lista = this.iUsuarioDao.findAll().equals(null) == true ? new ArrayList<UsuarioEntidade>()
				: (List<UsuarioEntidade>) this.iUsuarioDao.findAll();
		if (lista.stream().filter(a -> a.getUsuario().equals(usuario)).count() > 0)
			return true;
		return false;
	}
}
