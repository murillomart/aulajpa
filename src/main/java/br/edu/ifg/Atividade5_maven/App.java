package br.edu.ifg.Atividade5_maven;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jpa.Automovel;
import jpa.Marca;
import jpa.Modelo;


public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Atividade5_maven");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Marca m1 = new Marca(null, "FIAT");
		Marca m2 = new Marca(null, "VOLKSWAGEN");
		
		Modelo mod1 = new Modelo(null, "PUNTO", 85,m1);
		Modelo mod2 = new Modelo(null, "GOL", 84, m2);
		
		Automovel a1 = new Automovel(null, 2008, 2009, "proprietario Murillo Martins Coelho",22000.00, 135000,mod1);
		Automovel a2 = new Automovel(null, 2019, 2019, "proprietario Danilo Martins Coelho", 35000.00, 40000, mod2);
		
		em.persist(m1);
		em.persist(m2);
		em.persist(mod1);
		em.persist(mod2);
		em.persist(a1);
		em.persist(a2);
		
		em.getTransaction().commit();
		
		/* Lista os automoveis criados no banco*/
		
		Query query1 = em.createQuery("SELECT a FROM Automovel a");
		List<Automovel> autos = query1.getResultList();
		for (Automovel auto : autos) {
			System.out.println("\n*** " + auto.toString() + " ***");
			
		em.close();
		
		emf.close();
		
		
		
    }
    	}
    }