package br.com.gustavosantosgithub.loja.produtoDao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.gustavosantosgithub.loja.model.Categoria;
import br.com.gustavosantosgithub.loja.model.Produto;

public class ProdutoDao {
	
	private EntityManager em;
	
	public ProdutoDao(EntityManager em)
	{
		this.em = em;
	}
	
	public void cadastrar(Produto produto)
	{
		this.em.persist(produto);
	}
	
	public void atualizarProduto(Produto produto)
	{
		this.em.merge(produto);
	}
	
	public void deleteProduct(Produto produto)
	{
		produto = this.em.merge(produto);
		this.em.remove(produto);
	}
	
	public Produto findById(Long id)
	{
		return em.find(Produto.class, id);
	}
	
	public List<Produto> getAll()
	{
		String jpql = "SELECT p FROM Produto p";
		return em.createQuery(jpql, Produto.class).getResultList();
	}
	
	public List<Produto> findByName(String name){
		String jpql = "SELECT p FROM Produto p WHERE p.nome = ?1";
		return em.createQuery(jpql, Produto.class).setParameter(1, name).getResultList();
	}
	public List<Produto> findByCategory(String nome) {
		String jpql = "SELECT p FROM Produto p WHERE p.nome = ?1";
		return em.createQuery(jpql, Produto.class).setParameter(1, nome).getResultList();
	}
}
