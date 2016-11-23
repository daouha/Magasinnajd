	package daoh;

	import java.util.ArrayList;

	import javax.persistence.*;

import test.Categorie;

import java.util.List;

public class Categoriedao {











			Connex cn=new Connex();
			
		public int ajout(Categorie c)
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
		public int modif (Categorie c)
		{
			try
			{cn.getEntitymanager().getTransaction().begin();
			Categorie cl = cn.getEntitymanager().find(Categorie.class,c.getCodeCat());

		 cl.setNomcat(c.getNomcat());
		 
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
		if (cn.getEntitymanager()!= null) {
		cn.getEntitymanager().close();
		}}
		}

			public int supprimer (Categorie c)
			{
				try
				{cn.getEntitymanager().getTransaction().begin();
				Categorie cl = cn.getEntitymanager().find(Categorie.class,c.getCodeCat());

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
			if (cn.getEntitymanager()!= null) {
			cn.getEntitymanager().close();
			}}	
				
		}
			public List<Categorie> selc ()
			{	List<Categorie> l =new ArrayList<Categorie>();
				try
				{cn.getEntitymanager().getTransaction().begin();
				
				Query q1= cn.getEntitymanager().createNamedQuery("Categorie.findAll");



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



