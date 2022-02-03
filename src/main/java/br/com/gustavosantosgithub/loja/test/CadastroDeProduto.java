package br.com.gustavosantosgithub.loja.test;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.gustavosantosgithub.loja.model.Categoria;
import br.com.gustavosantosgithub.loja.model.Produto;
import br.com.gustavosantosgithub.loja.produtoDao.ProdutoDao;
import br.com.gustavosantosgithub.loja.util.JpaUtil;

public class CadastroDeProduto {
	public static void main(String[] args) {
		//cadastrarProduto();
		//findById(1l);
		
		EntityManager em = JpaUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);
		
		produtoDao.findByName("Xiomi redphill");
		
		
	}

	private static void findById(Long id) {
		EntityManager em = JpaUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);
		Produto p = produtoDao.findById(1l);
		System.out.println(p.getPreco());
		
		List<Produto> todos = produtoDao.getAll();
		todos.forEach(p2-> System.out.println(p.getNome()));
	}

	private static void cadastrarProduto() {
		Categoria celulares = new Categoria("Celulares");
		Produto celular = new Produto(null, "Xiomi redphill", "muito top", new BigDecimal(900), null, celulares);
		
		
		EntityManager em = JpaUtil.getEntityManager();
		ProdutoDao dao = new ProdutoDao(em);
		
		em.getTransaction().begin();;
		dao.cadastrar(celular);
		em.getTransaction().commit();
		em.close();
	}
}
