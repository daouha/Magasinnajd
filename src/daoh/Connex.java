package daoh;
import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;
public class Connex implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EntityManager entitymanager;	

protected EntityManager getEntitymanager () 
{if(entitymanager==null){
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Magasin");
			entitymanager=emf.createEntityManager();
			
}
	return entitymanager;
}
public Connex ()
{
	
}

}
