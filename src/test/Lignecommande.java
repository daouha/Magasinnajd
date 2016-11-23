package test;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the lignecommande database table.
 * 
 */
@Entity
@NamedQuery(name="Lignecommande.findAll", query="SELECT l FROM Lignecommande l")
public class Lignecommande implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int codeligne;

	private int numcmd;

	private int numprod;

	private int pointstotal;

	private int prixtotal;

	private int qte;

	public Lignecommande() {
	}

	public int getCodeligne() {
		return this.codeligne;
	}

	public void setCodeligne(int codeligne) {
		this.codeligne = codeligne;
	}

	public int getNumcmd() {
		return this.numcmd;
	}

	public void setNumcmd(int numcmd) {
		this.numcmd = numcmd;
	}

	public int getNumprod() {
		return this.numprod;
	}

	public void setNumprod(int numprod) {
		this.numprod = numprod;
	}

	public int getPointstotal() {
		return this.pointstotal;
	}

	public void setPointstotal(int pointstotal) {
		this.pointstotal = pointstotal;
	}

	public int getPrixtotal() {
		return this.prixtotal;
	}

	public void setPrixtotal(int prixtotal) {
		this.prixtotal = prixtotal;
	}

	public int getQte() {
		return this.qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

}