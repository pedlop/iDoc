import {UltimaAlteracao} from './UltimaAlteracao';
import {Documento}       from './Documento';

export class ModeloDocumentacao {
    
    public codigoUnico : number;
    
    public historicoAlteracao: Array<UltimaAlteracao>;
    
    public documentacaoModelo: Array<Documento>;
  
      public ModeloDocumentacao( codigoUnico : number, documentacaoModelo : Array<Documento>, 
            historicoAlteracao : Array<UltimaAlteracao>, ultimaAlteracao : UltimaAlteracao ) {
        this.codigoUnico        = codigoUnico == null ||  codigoUnico == undefined ? 0 : codigoUnico;
        this.documentacaoModelo = documentacaoModelo == null || documentacaoModelo == undefined ? new Array<Documento>() : documentacaoModelo; 
        this.historicoAlteracao = historicoAlteracao == null || historicoAlteracao == undefined ? new Array<UltimaAlteracao>() : historicoAlteracao;
        if( ultimaAlteracao == null || ultimaAlteracao == undefined )
          this.historicoAlteracao.push(ultimaAlteracao); 
  }
}