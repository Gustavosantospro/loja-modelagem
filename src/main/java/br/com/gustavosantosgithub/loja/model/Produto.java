package br.com.gustavosantosgithub.loja.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString.Exclude;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter(value = AccessLevel.NONE) @Setter(value = AccessLevel.NONE)
	private Long id;
	private String nome;
	private String descricao;
	private BigDecimal preco;
	private LocalDate dataCadastro = LocalDate.now();
	
	@ManyToOne(cascade = {CascadeType.ALL})
	private Categoria categoria;
	
}
