package daoh;

import java.util.ArrayList;

import javax.persistence.*;

import test.Commande;

import java.util.List;

public class Commandedao {








		Connex cn=new Connex();
		
	public int ajout(Commande c)
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
	public int modif (Commande c)
	{
		try
		{cn.getEntitymanager().getTransaction().begin();
		Commande cl = cn.getEntitymanager().find(Commande.class,c.getNumCmd());

	 cl.setIdUser(c.getIdUser());
	 cl.setPointstotal(c.getPointstotal());
	 cl.setPrixtotal(c.getPrixtotal());
	cn.getEntitymanager().merge(cl);
	cn.getEntitymanager().getTransaction().commit();
	return 0;
	}catch(Exception e) {
	if ( cn.getEntitymanager().getTransaction()!=null) {
	cn.getEntitymanager().getTransaction().rollback();
	}
	e.printStackTrace();
	return 1;}
	finally{
	if (cn.getEntitymanager().isOpen()) {
	cn.getEntitymanager().close();
	}}
	}

		public int supprimer (Commande c)
		{
			try
			{cn.getEntitymanager().getTransaction().begin();
			Commande cl = cn.getEntitymanager().find(Commande.class,c.getNumCmd());

		cn.getEntitymanager().remove(cl);

		cn.getEntitymanager().getTransaction().commit();
		return 0;
		}catch(Exception e) {
		if ( cn.getEntitymanager().getTransaction()!=null) {
		cn.getEntitymanager().getTransaction().rollback();
		}
		e.printStackTrace();
		return 1;}
		finally{
		if (cn.getEntitymanager().isOpen()) {
		cn.getEntitymanager().close();
		}}	
			
	}
		public List<Commande> selc ()
		{	List<Commande> l =new ArrayList<Commande>();
			try
			{cn.getEntitymanager().getTransaction().begin();
			
			Query q1= cn.getEntitymanager().createNamedQuery("Commande.findAll");



			 l = q1.getResultList();
			cn.getEntitymanager().getTransaction().commit();
			
			
	}
			catch(Exception e) {
		e.printStackTrace();
		}
			finally{
				if (cn.getEntitymanager().isOpen()) {
				cn.getEntitymanager().close();
				}}	
			return l;
		}
	}

