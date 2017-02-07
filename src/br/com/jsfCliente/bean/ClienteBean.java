package br.com.jsfCliente.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.jsfCliente.model.Cliente;

@ManagedBean
public class ClienteBean {

	private Cliente cliente = new Cliente();
	
	
	public void gravarCliente() {

		
		 cliente.getId(); cliente.getNome(); cliente.getDt_nasc();
		 cliente.getEmail(); cliente.getEndereco(); cliente.getTel_celular();
		 cliente.getTel_residencial();
		  
		 EntityManagerFactory entityManagerFactory =
		 Persistence.createEntityManagerFactory("jsfCliente"); EntityManager
		 manager = entityManagerFactory.createEntityManager();
		 
		 manager.getTransaction().begin();
		 
		 manager.persist(this.cliente);
		 
		 manager.getTransaction().commit();
		 

		FacesContext.getCurrentInstance().addMessage("xxx", new FacesMessage("teste"));
		
		 manager.close();
		 
	}
	
	public ClienteBean(){
		
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteBean other = (ClienteBean) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		return true;
	}
	
	
	
	
	


}
