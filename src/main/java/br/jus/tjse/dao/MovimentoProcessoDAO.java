package br.jus.tjse.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
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
	
	@SuppressWarnings("unchecked")
	public MovimentoResponse obterMovimentoProcesso(String numProcesso) {
		String sql = "select mp.id.dtMovimento, mp.txtMovimento, mp.txtIntegra, mp.flgSigiloso "
				+ "from MovimentoProcesso mp "
				+ "where mp.id.numProcesso = :numProcesso "
				+ "order by mp.id.dtMovimento desc";
		Query qry = entityManager.createQuery(sql, DadosMovimento.class);
		qry.setParameter("numProcesso", Long.parseLong(numProcesso));
		List<DadosMovimento> listaDadosMovimento = qry.getResultList();
		if (listaDadosMovimento != null && !listaDadosMovimento.isEmpty()) {
			MovimentoResponse movimentoResponse = new MovimentoResponse();
			movimentoResponse.setListaMovimentos(listaDadosMovimento);
			return movimentoResponse;
			
			/*
			movimentoResponse.setNumProcesso(numProcesso);
			for (DadosMovimento dm : listaDadosMovimento) {				
				DadosMovimento dadosMovimento = new DadosMovimento();
				dadosMovimento.setDataMovimento(dm.getDataMovimento());
				if ("S".equals(dm.getFlgSigiloso())) {
					dadosMovimento.setTxtMovimento("Movimento sigiloso.");
					dadosMovimento.setTxtIntegra("Movimento sigiloso.");					
				} else {
					dadosMovimento.setTxtMovimento(dm.getTxtMovimento());
					dadosMovimento.setTxtIntegra(dm.getTxtIntegra());
				}
				dadosMovimento.setFlgSigiloso(dm.getFlgSigiloso());
				dadosMovimento.setListaAnexosMovimento(dm.getListaAnexosMovimento());
				
				movimentoResponse.getListaMovimentos().add(dadosMovimento);
			}
			*/
		}
		return null;

	}
}
