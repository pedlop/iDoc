package br.com;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.dominio.CabecalhoTeste;
import br.com.dominio.IntroducaoTeste;
import br.com.dominio.ListaUltimasAlteracoes;
import br.com.dominio.UltimaAlteracaoTeste;
import br.com.dominio.UsuarioTeste;

@RunWith(Suite.class)
@SuiteClasses({ UsuarioTeste.class, UltimaAlteracaoTeste.class, CabecalhoTeste.class,
	IntroducaoTeste.class, ListaUltimasAlteracoes.class })
public class TodosTestes {

}
