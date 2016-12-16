import { UltimaAlteracao } from './UltimaAlteracao';

export abstract class ParteDocumento {

  public codigoUnico: number;
  public historicoAlteracao: Array<UltimaAlteracao>;

  constructor(codigoUnico: number, historicoAlteracao: Array<UltimaAlteracao>, 
                ultimaAlteracao : UltimaAlteracao) {
      if( codigoUnico != undefined && codigoUnico != null )
        this.codigoUnico = codigoUnico;
      else
        this.codigoUnico = 0;
      if( historicoAlteracao == undefined || historicoAlteracao == null )
          historicoAlteracao = new Array<UltimaAlteracao>();
      this.historicoAlteracao = historicoAlteracao;
      if( ultimaAlteracao != undefined && ultimaAlteracao != null )
        this.historicoAlteracao.push(ultimaAlteracao);
  }

}