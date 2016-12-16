import {Component}        from '@angular/core';
import {Http, Response}   from '@angular/http';
/********************************************/
import {Cabecalho}        from '../../dominio/Cabecalho';
import {MessagemUsuario}  from '../../dominio/MessagemUsuario';


@Component({
    selector:'cabecalho',
    templateUrl: 'app/page/CabecalhoComponent/CabecalhoComponent.html',
    providers: []
})
export class CabecalhoComponent {
  
  public cabecalho : Cabecalho;
  
  constructor(  private http : Http ) {
   
  }
  
}