import {Campo}             from './Campo';
import {ParteDocumento}    from './ParteDocumento';
import {UltimaAlteracao}   from './UltimaAlteracao';

export class Cabecalho extends ParteDocumento{
  
  public cabecalho : Campo;
  
  constructor( codigoUnico: number, historicoAlteracao: Array<UltimaAlteracao>, 
                ultimaAlteracao : UltimaAlteracao ){
      super( codigoUnico, historicoAlteracao, ultimaAlteracao );
  }
}