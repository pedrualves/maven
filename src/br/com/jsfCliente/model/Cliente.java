package br.com.jsfCliente.model;


import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_cliente")
	private Integer id;

	@Column(length = 80, nullable = false)
	private String nome;
	
	@Column(length = 80, nullable = false)
	private String sexo;
	
	@Column(nullable = false)
	@Temporal(value = TemporalType.DATE)
	private Calendar dt_nasc;
	
	private String tel_residencial;
	
	@Column(nullable = false)
	private String tel_celular;
	
	@Column(length = 80, nullable = false)
	private String email;
	
	@Column(length = 150, nullable = false)
	private String endereco;
	
	@Column(nullable = false)
	@Temporal(value = TemporalType.DATE)
	private Calendar dt_in;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Calendar getDt_nasc() {
		return dt_nasc;
	}

	public void setDt_nasc(Calendar dt_nasc) {
		this.dt_nasc = dt_nasc;
	}

	public String getTel_residencial() {
		return tel_residencial;
	}

	public void setTel_residencial(String tel_residencial) {
		this.tel_residencial = tel_residencial;
	}

	public String getTel_celular() {
		return tel_celular;
	}

	public void setTel_celular(String tel_celular) {
		this.tel_celular = tel_celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Calendar getDt_in() {
		return dt_in;
	}

	public void setDt_in(Calendar dt_in) {
		this.dt_in = dt_in;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
}
