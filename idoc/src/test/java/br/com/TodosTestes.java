package br.com;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.dominio.UltimaAlteracaoTeste;
import br.com.dominio.UsuarioTeste;

@RunWith(Suite.class)
@SuiteClasses({ UsuarioTeste.class, UltimaAlteracaoTeste.class})
public class TodosTestes {

}
