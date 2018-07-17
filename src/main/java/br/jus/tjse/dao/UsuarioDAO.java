package br.jus.tjse.dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.jus.tjse.model.Usuario;
import br.jus.tjse.persistence.ProducerEntityManager;

public class UsuarioDAO {
	
	private EntityManager entityManager;

	public UsuarioDAO() {
		super();		
		this.entityManager = new ProducerEntityManager().getEntityManager();
	}
	
	public Usuario obterUsuarioPorLogin(String login) {
		String sql = "from Usuario u where u.login = :login";
		TypedQuery<Usuario> qry = this.entityManager.createQuery(sql, Usuario.class);
		qry.setParameter("login", login);
		try {
			return qry.getSingleResult();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} 
	}
	
	public Usuario obterUsuarioPorMatricula(Integer matricula) {
		String sql = "from Usuario u where u.numMatricula = :matricula";
		TypedQuery<Usuario> qry = this.entityManager.createQuery(sql, Usuario.class);
		qry.setParameter("matricula", matricula);
		try {
			return qry.getSingleResult();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} 
	}

}
