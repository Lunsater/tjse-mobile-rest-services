package br.jus.tjse.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.jus.tjse.model.FaseProcesso;
import br.jus.tjse.persistence.ProducerEntityManager;

public class FaseProcessoDAO {

	private EntityManager entityManager;
	
	public FaseProcessoDAO() {
		super();		
		this.entityManager = new ProducerEntityManager().getEntityManager();
	}
	
	public List<FaseProcesso> obterFasesProcesso(String numProcesso) {
		String sql = "from FaseProcesso f where f.id.numProcesso = :numProcesso "
				+ "order by f.id.dtMovimento desc";
		TypedQuery<FaseProcesso> qry = entityManager.createQuery(sql, FaseProcesso.class);
		qry.setParameter("numProcesso", Long.parseLong(numProcesso));
		return qry.getResultList();  
	}
}
