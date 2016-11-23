package mgbh;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;





import daoh.Categoriedao;
import daoh.Produitdao;
import test.Categorie;
import test.Produit;





public class mgbprod  implements Serializable{







			
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Produit> prod=new ArrayList<Produit>();
	private List<Categorie> categ=new ArrayList<Categorie>();
			private Produit  p =new Produit();
			private Produitdao po=new Produitdao();
			private Categoriedao cat=new Categoriedao();
			private Categorie c=new Categorie();
			public Categorie getC() {
				return c;
			}

			public void setC(Categorie c) {
				this.c = c;
			}
		

			public List<Categorie> getCateg() {
				categ=cat.selc();
				return categ;
			}

			public void setCateg(List<Categorie> categ) {
				this.categ = categ;
			}

			public Categoriedao getCat() {
				return cat;
			}

			public void setCat(Categoriedao cat) {
				this.cat = cat;
			}

			public List<Produit> getProd() {
				prod=po.selc();
				return prod;
			}

			public void setProd(List<Produit> prod) {
				this.prod = prod;
			}

			public List<Categorie> getCmd() {
				return cmd;
			}

			public void setCmd(List<Categorie> cmd) {
				this.cmd = cmd;
			}
			private List<Categorie> cmd=new ArrayList<Categorie>();


			public Produit getP() {
				return p;
			}

			public void setP(Produit p) {
				this.p = p;
			}

			public Produitdao getPo() {
				return po;
			}

			public void setPo(Produitdao po) {
				this.po = po;
			}

			public String insert()
			{
				if(po.ajout(p)==0)
					{
					System.out.println("valider");
					
					}
				else
				{
					System.out.println("valider");
					
					}
				
				return "mmm";
				
				
			}
			
			public String modifier_Categorie()
			{
				if(po.modif(p)==0)
					{System.out.println("valider");
				}
				else
					{
				System.out.println("non valider");
					}
				
				return "ok";
				
				
			}
			public String  supprimer_categorie()
			{
				if(po.supprimer(p)==0)
					{System.out.println("valider");
				}
				else
					{
					System.out.println("non valider");
					}
				
				return "ok";
				
				
			}
			
			
			
			
			
		}



