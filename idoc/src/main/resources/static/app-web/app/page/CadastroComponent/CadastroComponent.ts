import {Component}        from '@angular/core';
import {Http, Response}   from '@angular/http';
/********************************************/
import {Usuario}          from '../../dominio/Usuario';
import {MessagemUsuario}  from '../../dominio/MessagemUsuario';

@Component({
    selector:'cadastro',
    templateUrl: 'app/page/CadastroComponent/CadastroComponent.html',
    providers: []
})
export class CadastroComponent {
  
  public usuario   : Usuario;
  
  public confSenha : string;
  
  constructor( private http : Http ) {
    this.usuario   = new Usuario();
    this.confSenha = ""; 
  }

  public cadastrar(){
    if( this.usuario.senha != this.confSenha ){
       alert("Por favor as senhas não confirmam, digite as senhas novamente");
       this.usuario.senha = "";
       this.confSenha     = "";
    }
    this.http
        .get("http://localhost:10010/cadastrar/usuario/" + JSON.stringify(this.usuario))
        .subscribe((a : Response) => {
          let msg : MessagemUsuario  = JSON.parse(a.json());
          alert(msg.getMessagemUsuario());
        });
  }
}


