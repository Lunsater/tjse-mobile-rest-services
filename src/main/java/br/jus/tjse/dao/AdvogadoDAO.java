package br.jus.tjse.dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.jus.tjse.model.Advogado;
import br.jus.tjse.persistence.ProducerEntityManager;

public class AdvogadoDAO {

	private EntityManager entityManager;

	public AdvogadoDAO() {
		super();		
		this.entityManager = new ProducerEntityManager().getEntityManager();
	}
	
	public Advogado getAdvogadoPorOAB(String codigo, String letra, String uf) {
		String sql = "from Advogado adv where adv.codOAB = :codigo and adv.codUFOAB = :uf "
				+ "and adv.tipoInscricao = :letra";
		TypedQuery<Advogado> qry = this.entityManager.createQuery(sql, Advogado.class);
		qry.setParameter("codigo", codigo);
		qry.setParameter("uf", uf);
		qry.setParameter("letra", letra);
		
		try {
			return qry.getSingleResult();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} 
	}
	
	public Advogado getUsuarioPorId(Integer id) {
		String sql = "from Advogado adv where adv.id = :id";
		TypedQuery<Advogado> qry = this.entityManager.createQuery(sql, Advogado.class);
		qry.setParameter("id", id);
		return qry.getSingleResult(); 
	}

}
