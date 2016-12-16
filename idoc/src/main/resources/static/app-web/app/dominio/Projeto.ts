import {UltimaAlteracao}      from './UltimaAlteracao'; 
import {ModeloDocumentacao}   from './ModeloDocumentacao';

export class Projeto {
   
   public codigoUnico : number;
  
   public nomeProjeto : string;
  
   public historicoAlteracao : Array<UltimaAlteracao>;
  
   public modelo : ModeloDocumentacao;
  
   constructor(){ }
       
     /**
     * Construtor a ser usado quando
     * se esta alterando modelo de documentacao 
     * de um projeto.
     * */
    public setProjeto( codigoUnico : number, nomeProjeto : string, modelo : ModeloDocumentacao,  
      historicoAlteracao : Array<UltimaAlteracao>, ultimaAlteracao : UltimaAlteracao) : void{
      this.codigoUnico = codigoUnico;
      this.nomeProjeto = nomeProjeto;
      this.modelo    = modelo; 
      this.historicoAlteracao = historicoAlteracao;
      this.historicoAlteracao.push(ultimaAlteracao);
    }
    
    /**
     * Construtor a ser usado quando
     * se esta consultado projeto da 
     * base dados.
     * */
     public setProjeto1( codigoUnico : number, nomeProjeto : string, modelo : ModeloDocumentacao,  
       historicoAlteracao : Array<UltimaAlteracao> ) : void{
      this.codigoUnico = codigoUnico;
      this.nomeProjeto = nomeProjeto;
      this.modelo    = modelo;
      this.historicoAlteracao = historicoAlteracao;
    }
    
    /**
     * Construtor a ser usado quando se esta criando 
     * um projeto pela primeira vez.
     * */
    public setProjeto2( codigoUnico : number, nomeProjeto : string, 
      modelo : ModeloDocumentacao, ultimaAlteracao : UltimaAlteracao ) : void{
      this.codigoUnico = codigoUnico;
      this.nomeProjeto = nomeProjeto;
      this.historicoAlteracao = new Array<UltimaAlteracao>();
      this.historicoAlteracao.push(ultimaAlteracao);
    }
  
}