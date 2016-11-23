package test;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the client database table.
 * 
 */
@Entity
@NamedQuery(name="Client.findAll", query="SELECT c FROM Client c")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_user")
	private int idUser;

	@Temporal(TemporalType.DATE)
	private Date dateNais;

	private String login;

	private String nom;

	private int pointUser;

	private String prenom;

	private String pwd;

	private String questSec;

	private String reponse;

	public Client() {
	}

	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public Date getDateNais() {
		return this.dateNais;
	}

	public void setDateNais(Date dateNais) {
		this.dateNais = dateNais;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPointUser() {
		return this.pointUser;
	}

	public void setPointUser(int pointUser) {
		this.pointUser = pointUser;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getQuestSec() {
		return this.questSec;
	}

	public void setQuestSec(String questSec) {
		this.questSec = questSec;
	}

	public String getReponse() {
		return this.reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

}