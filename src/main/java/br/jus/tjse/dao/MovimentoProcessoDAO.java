package br.jus.tjse.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.jus.tjse.dominio.DadosMovimento;
import br.jus.tjse.dominio.MovimentoResponse;
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
	
	public MovimentoResponse obterMovimentoProcesso(String numProcesso) {
		String sql = "select NEW br.jus.tjse.dominio.DadosMovimento(mp.id.dtMovimento, mp.txtMovimento, mp.txtIntegra, mp.flgSigiloso, mp.anexosMovimentos) "
				+ "from MovimentoProcesso mp "
				+ "where mp.id.numProcesso = :numProcesso "
				+ "order by mp.id.dtMovimento desc";
		TypedQuery<DadosMovimento> qry = entityManager.createQuery(sql, DadosMovimento.class);
		qry.setParameter("numProcesso", Long.parseLong(numProcesso));
		List<DadosMovimento> listaDadosMovimento = qry.getResultList();
		if (listaDadosMovimento != null && !listaDadosMovimento.isEmpty()) {
			MovimentoResponse movimentoResponse = new MovimentoResponse();
			movimentoResponse.setNumProcesso(numProcesso);
			movimentoResponse.setListaMovimentos(listaDadosMovimento);
			return movimentoResponse;			
		}
		return null;
	}
	
}
