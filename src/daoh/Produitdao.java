	package daoh;

	import java.io.Serializable;
import java.util.ArrayList;

	import javax.persistence.*;

import test.Produit;

import java.util.List;

public class Produitdao implements Serializable {



			/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
			Connex cn=new Connex();
			
		public int ajout(Produit c)
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
		public int modif (Produit p)
		{
			try
			{cn.getEntitymanager().getTransaction().begin();
			Produit cl = cn.getEntitymanager().find(Produit.class,p.getNumProd());

		 cl.setCodeCat(p.getCodeCat());
		 cl.setLib(p.getLib());
		 cl.setPointProd(p.getPointProd());
		 cl.setPrixTTC(p.getPrixTTC());
		 cl.setStock(p.getStock());
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
		if (cn.getEntitymanager().isOpen()){
		cn.getEntitymanager().close();
		}}
		}

			public int supprimer (Produit c)
			{
				try
				{cn.getEntitymanager().getTransaction().begin();
				Produit cl = cn.getEntitymanager().find(Produit.class,c.getNumProd());

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
			public List<Produit> selc ()
			{	List<Produit> l =new ArrayList<Produit>();
				try
				{cn.getEntitymanager().getTransaction().begin();
				
				Query q1= cn.getEntitymanager().createNamedQuery("Produit.findAll");



				 l = q1.getResultList();
				cn.getEntitymanager().getTransaction().commit();
				
				
		}
				catch(Exception e) {
			e.printStackTrace();
			}
				finally{
					if (cn.getEntitymanager().getTransaction().isActive()) {
					cn.getEntitymanager().close();
					}}	
				return l;
			}
		}



