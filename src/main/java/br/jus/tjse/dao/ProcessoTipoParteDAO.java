package br.jus.tjse.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.jus.tjse.model.ProcessoTipoParte;
import br.jus.tjse.persistence.ProducerEntityManager;

public class ProcessoTipoParteDAO {
	private EntityManager entityManager;

	public ProcessoTipoParteDAO() {
		super();
		this.entityManager = new ProducerEntityManager().getEntityManager();
	}
	
	public List<ProcessoTipoParte> obterPartes(String numProcesso) {
		String sql = "from ProcessoTipoParte ptp where ptp.id.numProcesso = :numProcesso";
		TypedQuery<ProcessoTipoParte> qry = entityManager.createQuery(sql, ProcessoTipoParte.class);
		qry.setParameter("numProcesso", Long.parseLong(numProcesso));
		return qry.getResultList();
	}
}
