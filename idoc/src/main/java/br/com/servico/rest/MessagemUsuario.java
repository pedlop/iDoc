package br.com.servico.rest;

public class MessagemUsuario {
	
	private String messagemUsuario;
	
	public MessagemUsuario(){
		
	}
	
	public MessagemUsuario( String msg ){
		this.messagemUsuario = msg;
	}

	public String getMessagemUsuario() {
		return messagemUsuario;
	}

	public void setMessagemUsuario(String messagemUsuario) {
		this.messagemUsuario = messagemUsuario;
	}
}
