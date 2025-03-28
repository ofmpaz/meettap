package br.com.dio.model;

import java.io.Serializable;

public class Evento implements Serializable {

	private static final long serialVersionUID = 2083522035764530929L;

	private String nomeDoEvento;
	private String nomeDaOrganizadora;
	private String local;
	private String data;
	private String hora;

	public String getNomeDoEvento() {
		return nomeDoEvento;
	}

	public void setNomeDoEvento(String nomeDoEvento) {
		this.nomeDoEvento = nomeDoEvento;
	}

	public String getNomeDaOrganizadora() {
		return nomeDaOrganizadora;
	}

	public void setNomeDaOrganizadora(String nomeDaOrganizadora) {
		this.nomeDaOrganizadora = nomeDaOrganizadora;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

}
