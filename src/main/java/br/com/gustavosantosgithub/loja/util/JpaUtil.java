package br.com.gustavosantosgithub.loja.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


// isolar a criação do entity manager e esconder o entitymaneger fatory
public class JpaUtil {

	private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("loja");
	
	public static EntityManager getEntityManager()
	{
		return FACTORY.createEntityManager();
	}
}
