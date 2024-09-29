package model;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CrearCliente {

	

		
		public static void main(String [] args) {
			
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("jpa");
			javax.persistence.EntityManager entitymanager = emfactory.createEntityManager();
			entitymanager.getTransaction().begin();
			
			Cliente cliente =new Cliente();
			cliente.setRfc(98958);
			cliente.setNombre("jose luis");
			cliente.setApellido("luza");
			cliente.setFn("1982/05/02");
			cliente.setTel("96857432");
			System.out.println("Persistencia de datos");
			entitymanager.persist(cliente);
			entitymanager.getTransaction().commit();
			
			entitymanager.close();
			emfactory.close();
		}
	}



