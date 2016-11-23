package test;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the commande database table.
 * 
 */
@Entity
@NamedQuery(name="Commande.findAll", query="SELECT c FROM Commande c")
public class Commande implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int numCmd;

	@Temporal(TemporalType.DATE)
	private Date dareCmd;

	@Column(name="id_user")
	private int idUser;

	private int pointstotal;

	private float prixtotal;

	public Commande() {
	}

	public int getNumCmd() {
		return this.numCmd;
	}

	public void setNumCmd(int numCmd) {
		this.numCmd = numCmd;
	}

	public Date getDareCmd() {
		return this.dareCmd;
	}

	public void setDareCmd(Date dareCmd) {
		this.dareCmd = dareCmd;
	}

	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public int getPointstotal() {
		return this.pointstotal;
	}

	public void setPointstotal(int pointstotal) {
		this.pointstotal = pointstotal;
	}

	public float getPrixtotal() {
		return this.prixtotal;
	}

	public void setPrixtotal(float prixtotal) {
		this.prixtotal = prixtotal;
	}

}