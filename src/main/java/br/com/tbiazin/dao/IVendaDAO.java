package main.java.br.com.tbiazin.dao;

import main.java.br.com.tbiazin.dao.generic.IGenericDAO;
import main.java.br.com.tbiazin.domain.Venda;
import main.java.br.com.tbiazin.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}