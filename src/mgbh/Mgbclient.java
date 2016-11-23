package mgbh;


import java.io.Serializable;

import daoh.Clientdao;
import test.Client;


public class Mgbclient implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Client c =new Client();
public Clientdao cl =new Clientdao() ;




public Client getC() {
	return c;
}
public void setC(Client c) {
	this.c = c;
}
public Clientdao getCl() {
	return cl;
}
public void setCl(Clientdao cl) {
	this.cl = cl;
}
public void ajout(){
	
	if(cl.ajout(c)==0)
	{System.out.print("nooooo");}
	else  System.out.print("yessss");

}
}
