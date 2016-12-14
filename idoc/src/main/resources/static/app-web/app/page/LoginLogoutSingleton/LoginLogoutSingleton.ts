/***
 * autor: lucas
 * 
 * Classe que tem como objetivo alternar a visibilidade
 * dos botoes de entrar/cadastrar e sair de modo se há usuario 
 * logado ou não
*/

import {Observable}   from 'rxjs/Observable';

export class LoginLogoutSingleton {
     
     public semUsuario : boolean;  
     public comUsuario : boolean;
     
     
     //CLASSE PADRAO SINGLETON INSTANCIA ACESSADA SOMENTE ANTRAVES DESTA VARIAVEL.
     public static _instancia : LoginLogoutSingleton;

     constructor(){
        if( LoginLogoutSingleton._instancia ){
            throw new Error("Erro: Classe ja instanciada padrao Singleton! ");
        }
        LoginLogoutSingleton._instancia = this;    
        
        this.semUsuario = true;
        this.comUsuario = false;
     }

}