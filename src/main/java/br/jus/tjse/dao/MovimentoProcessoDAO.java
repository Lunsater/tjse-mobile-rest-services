package br.jus.tjse.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.jus.tjse.model.MovimentoProcesso;
import br.jus.tjse.persistence.ProducerEntityManager;

public class MovimentoProcessoDAO {

	private EntityManager entityManager;

	public MovimentoProcessoDAO() {
		super();
		this.entityManager = new ProducerEntityManager().getEntityManager();
	}
	
	public List<MovimentoProcesso> obterMovimentoProcessoDecisao(String numProcesso) {
		String sql = "from MovimentoProcesso mp "
				+ "where mp.id.codMovimento in (305, 371) and mp.id.numProcesso = :numProcesso "
				+ "order by mp.id.dtMovimento";
		TypedQuery<MovimentoProcesso> qry = entityManager.createQuery(sql, MovimentoProcesso.class);
		qry.setParameter("numProcesso", Long.parseLong(numProcesso));
		return qry.getResultList();
	}
	
	public List<MovimentoProcesso> obterMovimentoProcesso(String numProcesso) {
		//String sql = "select m.id.dtMovimento, m.txtMovimento, txtIntegra, m.flgSigiloso "
		String sql = "from MovimentoProcesso mp "
				+ "where mp.id.numProcesso = :numProcesso "
				+ "order by mp.id.dtMovimento desc";
		TypedQuery<MovimentoProcesso> qry = entityManager.createQuery(sql, MovimentoProcesso.class);
		qry.setParameter("numProcesso", Long.parseLong(numProcesso));
		return qry.getResultList();
	}
}
