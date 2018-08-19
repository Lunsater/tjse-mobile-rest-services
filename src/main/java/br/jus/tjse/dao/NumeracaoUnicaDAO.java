package br.jus.tjse.dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.jus.tjse.model.NumeracaoUnica;
import br.jus.tjse.persistence.ProducerEntityManager;

public class NumeracaoUnicaDAO {
	
	private EntityManager entityManager;
	
	public NumeracaoUnicaDAO() {
		super();		
		this.entityManager = new ProducerEntityManager().getEntityManager();
	}
	
	public NumeracaoUnica obterNumUnicoProcesso(String numProcesso) {
		String sql = "from NumeracaoUnica nu where nu.id.numProcesso = :numProcesso";
		TypedQuery<NumeracaoUnica> qry = entityManager.createQuery(sql, NumeracaoUnica.class);
		qry.setParameter("numProcesso", Long.parseLong(numProcesso));
		return qry.getSingleResult();		
	}

}
