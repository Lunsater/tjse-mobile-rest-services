package br.jus.tjse.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.jus.tjse.dominio.DadosFase;
import br.jus.tjse.dominio.FaseResponse;
import br.jus.tjse.model.FaseProcesso;
import br.jus.tjse.persistence.ProducerEntityManager;

public class FaseProcessoDAO {

	private EntityManager entityManager;
	
	public FaseProcessoDAO() {
		super();		
		this.entityManager = new ProducerEntityManager().getEntityManager();
	}
	
	public FaseResponse obterFasesProcesso(String numProcesso) {
		String sql = "from FaseProcesso f where f.id.numProcesso = :numProcesso "
				+ "order by f.id.dtMovimento desc";
		TypedQuery<FaseProcesso> qry = entityManager.createQuery(sql, FaseProcesso.class);
		qry.setParameter("numProcesso", Long.parseLong(numProcesso));				
		List<FaseProcesso> listaFases = qry.getResultList();  
		if (listaFases != null && !listaFases.isEmpty()) {
			FaseResponse faseResponse = new FaseResponse();
			faseResponse.setNumProcesso(numProcesso);
			for (FaseProcesso fp : listaFases) {
				DadosFase dadosFase = new DadosFase();
				dadosFase.setDataFase(fp.getId().getDtMovimento());
				dadosFase.setDescricao(fp.getFase().getDsFase());
				
				faseResponse.getListaFases().add(dadosFase);
			}
			return faseResponse;
		}
		return null;
	}
	
}
