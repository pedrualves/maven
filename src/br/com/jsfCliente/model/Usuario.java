package br.com.jsfCliente.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario {

		@Id
		@GeneratedValue
		private String id;
		private String login;
		private String senha;
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		
		
		@Override
		public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
		}
	
}