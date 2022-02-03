package br.com.gustavosantosgithub.loja.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "categorias")
@NoArgsConstructor()

public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private final Long id;
	
	@Getter @Setter private String nome;
	
	
	public Categoria(String nome)
	{
		this.nome = nome;
	}


	
	
	
	
}
