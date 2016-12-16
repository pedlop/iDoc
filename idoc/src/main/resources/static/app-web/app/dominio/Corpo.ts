import {Campo}             from './Campo';
import {ParteDocumento}    from './ParteDocumento';
import {UltimaAlteracao}   from './UltimaAlteracao';

export class Corpo extends ParteDocumento{
    
    public camposCorpo : Array<Campo>;
  
    constructor( codigoUnico: number, historicoAlteracao: Array<UltimaAlteracao>, 
                ultimaAlteracao : UltimaAlteracao ){
      super( codigoUnico, historicoAlteracao, ultimaAlteracao );
    }
}