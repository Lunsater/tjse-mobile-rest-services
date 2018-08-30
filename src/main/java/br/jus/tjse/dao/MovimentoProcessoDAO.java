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
	
	public MovimentoResponse obterMovimentoProcessoDecisao(String numProcesso) {
		String sql = "from MovimentoProcesso mp "
				+ "where mp.id.codMovimento in (305, 371) and mp.id.numProcesso = :numProcesso "
				+ "order by mp.id.dtMovimento";
		TypedQuery<MovimentoProcesso> qry = entityManager.createQuery(sql, MovimentoProcesso.class);
		qry.setParameter("numProcesso", Long.parseLong(numProcesso));
		List<MovimentoProcesso> listaMovimentos = qry.getResultList();
		if (listaMovimentos != null && !listaMovimentos.isEmpty()) {
			MovimentoResponse movimentoResponse = new MovimentoResponse();
			movimentoResponse.setNumProcesso(numProcesso);
			for (MovimentoProcesso mp : listaMovimentos) {				
				DadosMovimento dadosMovimento = new DadosMovimento();
				dadosMovimento.setDataMovimento(mp.getId().getDtMovimento());
				dadosMovimento.setTxtMovimento(mp.getTxtMovimento());
				dadosMovimento.setTxtIntegra(mp.getTxtIntegra());
				dadosMovimento.setFlgSigiloso(mp.getFlgSigiloso());
				movimentoResponse.getListaMovimentos().add(dadosMovimento);
			}
			return movimentoResponse;
		}
		return null;
	}
	
	public MovimentoResponse obterMovimentoProcesso(String numProcesso) {
		//String sql = "select NEW br.jus.tjse.dominio.DadosMovimento(mp.id.dtMovimento, mp.txtMovimento, mp.txtIntegra, mp.flgSigiloso, am.nmArquivo) "
		String sql = "from MovimentoProcesso mp "
				+ "where mp.id.numProcesso = :numProcesso "
				+ "order by mp.id.dtMovimento desc";
		TypedQuery<MovimentoProcesso> qry = entityManager.createQuery(sql, MovimentoProcesso.class);
		qry.setParameter("numProcesso", Long.parseLong(numProcesso));
		List<MovimentoProcesso> listaMovimentoProcesso = qry.getResultList();
		if (listaMovimentoProcesso != null && !listaMovimentoProcesso.isEmpty()) {
			MovimentoResponse movimentoResponse = new MovimentoResponse();
			movimentoResponse.setNumProcesso(numProcesso);
			for(MovimentoProcesso mp : listaMovimentoProcesso) {
				DadosMovimento dadosMovimento = new DadosMovimento();
				dadosMovimento.setDataMovimento(mp.getId().getDtMovimento());
				if ("S".equals(dadosMovimento.getFlgSigiloso())) {
					dadosMovimento.setTxtMovimento("Movimento sigiloso");
					dadosMovimento.setTxtIntegra("Movimento sigiloso");					
				} else {
					dadosMovimento.setTxtMovimento(mp.getTxtMovimento());
					dadosMovimento.setTxtIntegra(mp.getTxtIntegra());
				}
				if (mp.getAnexosMovimentos() == null || mp.getAnexosMovimentos().isEmpty()) {
					dadosMovimento.setTemAnexo(true);
				}
				
				movimentoResponse.getListaMovimentos().add(dadosMovimento);
			}
			return movimentoResponse;
		}
		return null;
	}
	
}
