package br.jus.tjse.dao;

import javax.persistence.EntityManager;

import br.jus.tjse.model.NumeracaoUnica;
import br.jus.tjse.model.Processo;
import br.jus.tjse.persistence.ProducerEntityManager;

public class ProcessoDAO {
	
	private EntityManager entityManager;

	public ProcessoDAO() {
		super();		
		this.entityManager = new ProducerEntityManager().getEntityManager();
	}
	
	public Processo obterProcessoPorNumero(String numProcesso) {
		Processo processo = entityManager.find(Processo.class, Long.parseLong(numProcesso));
		return processo;
	}
	
	public Processo obterProcessoPorNumeroUnico(String numProcesso) {
		NumeracaoUnicaDAO numeracaoUnicaDAO = new NumeracaoUnicaDAO();
		NumeracaoUnica numeracaoUnica = numeracaoUnicaDAO.obterNumUnicoProcesso(numProcesso);
		if (numeracaoUnica == null)
			return null;
		
		Processo processo = entityManager.find(Processo.class, numeracaoUnica.getId().getNumProcesso());
		return processo;
	}

}
