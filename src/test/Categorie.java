package test;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the categorie database table.
 * 
 */
@Entity
@NamedQuery(name="Categorie.findAll", query="SELECT c FROM Categorie c")
public class Categorie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String codeCat;

	private String nomcat;

	public Categorie() {
	}

	public String getCodeCat() {
		return this.codeCat;
	}

	public void setCodeCat(String codeCat) {
		this.codeCat = codeCat;
	}

	public String getNomcat() {
		return this.nomcat;
	}

	public void setNomcat(String nomcat) {
		this.nomcat = nomcat;
	}

}