package br.com.gustavosantosgithub.loja.produtoDao;

import javax.persistence.EntityManager;

import br.com.gustavosantosgithub.loja.model.Categoria;
import lombok.Data;


public class CategoriaDao {

	private EntityManager em;
	
	public CategoriaDao(EntityManager em)
	{
		this.em = em;
	}
	
	public void cadastrarCategoria(Categoria categoria)
	{
		this.em.persist(categoria);
	}
	
	public void atualizar(Categoria categoria)
	{
		this.em.merge(categoria);
	}
	
	public void deleteCategory(Categoria categoria)
	{
		categoria = this.em.merge(categoria);
		this.em.remove(categoria);
	}
}
