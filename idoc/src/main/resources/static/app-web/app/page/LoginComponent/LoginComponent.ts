import {Component}                     from '@angular/core';
import { Http, Response   }                  from '@angular/http';
import { Router }                      from '@angular/router';
/********************************************** */
import {Usuario}                       from '../../dominio/Usuario';
import {LoginLogoutSingleton}          from '../LoginLogoutSingleton/LoginLogoutSingleton';
/********************************************** */

@Component({
    selector:'login',
    templateUrl: 'app/page/LoginComponent/LoginComponent.html',
    providers:[  ]
})
export class LoginComponent{
  
  public usuario : Usuario;
  
  constructor(  public  router : Router, private http : Http ) {
     this.usuario = new Usuario();
  }
  
  public entrar(){
    this.http
        .get("http://localhost:10010/cadastrar/usuario/" + JSON.stringify(this.usuario))
        .subscribe((a : Response) => {
          let loginOk = JSON.parse(a.json());
          if( loginOk ){
            alert("Login com sucesso");
            LoginLogoutSingleton._instancia.comUsuario = true;
            LoginLogoutSingleton._instancia.semUsuario = false;
          }
          else{
            alert("Login inexistente, por favor cadastre-se");
            LoginLogoutSingleton._instancia.comUsuario = false;
            LoginLogoutSingleton._instancia.semUsuario = true;
          }
        });
  }
}

