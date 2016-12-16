import {Campo}             from './Campo';
import {ParteDocumento}    from './ParteDocumento';
import {UltimaAlteracao}   from './UltimaAlteracao';

export class Introducao extends ParteDocumento{
    
    public introducao : Introducao;
    
      constructor(codigoUnico: number, historicoAlteracao: Array<UltimaAlteracao>, 
                ultimaAlteracao : UltimaAlteracao){
        super( codigoUnico, historicoAlteracao, ultimaAlteracao );
      }
}