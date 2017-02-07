package br.com.jsfCliente.bean;


import javax.faces.bean.ManagedBean;

import br.com.jsfCliente.model.Usuario;


@ManagedBean
public class LoginBean {

	private Usuario usuario = new Usuario();
	String u = usuario.getLogin();
	String s = usuario.getSenha();
	
	public String verificaLogin(String u, String s){
		
		if("henrique".equals(u) &&
				"123".equals(s))
		{
		return "main";
		}
			return null;
		}
		
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUser(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}

