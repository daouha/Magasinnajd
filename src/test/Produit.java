package test;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the produit database table.
 * 
 */
@Entity
@NamedQuery(name="Produit.findAll", query="SELECT p FROM Produit p")
public class Produit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int numProd;

	private String codeCat;

	private String lib;

	private int pointProd;

	private float prixTTC;

	private int stock;

	public Produit() {
	}

	public int getNumProd() {
		return this.numProd;
	}

	public void setNumProd(int numProd) {
		this.numProd = numProd;
	}

	public String getCodeCat() {
		return this.codeCat;
	}

	public void setCodeCat(String codeCat) {
		this.codeCat = codeCat;
	}

	public String getLib() {
		return this.lib;
	}

	public void setLib(String lib) {
		this.lib = lib;
	}

	public int getPointProd() {
		return this.pointProd;
	}

	public void setPointProd(int pointProd) {
		this.pointProd = pointProd;
	}

	public float getPrixTTC() {
		return this.prixTTC;
	}

	public void setPrixTTC(float prixTTC) {
		this.prixTTC = prixTTC;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}