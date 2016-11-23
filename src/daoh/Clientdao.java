package daoh;


import java.io.Serializable;

import test.Client;

public class Clientdao implements Serializable { 
	/**
}
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Connex cn=new Connex();
	public int ajout(Client c)
	{
		try
	{
			
		cn.getEntitymanager().getTransaction().begin();
		cn.getEntitymanager().persist(c);
		cn.getEntitymanager().getTransaction().commit();
		return 0;
	}
		catch(Exception e)
		{if(cn.getEntitymanager().getTransaction().isActive())
			cn.getEntitymanager().getTransaction().rollback();
		return 1;
		}
		}
}
