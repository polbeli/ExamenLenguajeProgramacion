package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class ConsultaCliente {

	
	@SuppressWarnings("unchecked")
	public static void main (String[] args) {
		
		
		
		EntityManagerFactory  emfactory = Persistence.createEntityManagerFactory("Evaluacion1");
		EntityManager entitymanager=emfactory.createEntityManager();
		entitymanager.getTransaction( ).begin();
		
		Query query =entitymanager.createQuery ("Select c from Cliente AS c");
		
	     List <Cliente> list=(List<Cliente>)query.getResultList();
	     for(Cliente c:list)
	     {
	    	 System.out.println("Cliente :"+c.getIdCliente()+"    "+c.getNombreCliente()+"   "+c.getDireccionCliente());
	     }
	
	
	
	}
}
