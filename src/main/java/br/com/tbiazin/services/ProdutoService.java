package main.java.br.com.tbiazin.services;

import java.util.Collection;

import main.java.br.com.tbiazin.dao.IProdutoDAO;
import main.java.br.com.tbiazin.domain.Produto;
import main.java.br.com.tbiazin.exceptions.TipoChaveNaoEncontradaException;
import main.java.br.com.tbiazin.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
