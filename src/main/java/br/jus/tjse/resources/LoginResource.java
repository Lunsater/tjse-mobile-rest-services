package br.jus.tjse.resources;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.jus.tjse.dao.AdvogadoDAO;
import br.jus.tjse.dao.UsuarioDAO;
import br.jus.tjse.dominio.LoginAdvogado;
import br.jus.tjse.dominio.LoginUsuario;
import br.jus.tjse.model.Advogado;
import br.jus.tjse.model.Usuario;
import br.jus.tjse.util.Util;

@Path("/login")
public class LoginResource {
	
	@POST
	@Path("/usuario")
	@Produces(MediaType.APPLICATION_FORM_URLENCODED)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response validaLoginUsuario(String loginStr) {
		LoginUsuario login = null;
		try {
			login = new ObjectMapper().readValue(loginStr, LoginUsuario.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.obterUsuarioPorLogin(login.getUsuario());
		if (usuario == null)
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Usuário não encontrado!").build();
		
		if (senhaConfere(usuario.getSenha(), login.getSenha()))
			return Response.status(Response.Status.OK).entity(usuario.getNome()).build();
		
		return null;
	}

	@POST
	@Path("/advogado")
	@Produces(MediaType.APPLICATION_FORM_URLENCODED)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response validaLoginAdvogado(String loginStr) {
		LoginAdvogado login = null;
		try {
			login = new ObjectMapper().readValue(loginStr, LoginAdvogado.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		AdvogadoDAO advogadoDAO = new AdvogadoDAO();
		Advogado advogado = advogadoDAO.obterAdvogadoPorOAB(login.getCodigo(), login.getLetra(), login.getUf());
		if (advogado == null)
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Advogado não encontrado!").build();
		
		if (senhaConfere(advogado.getCodSenhaInternet(), login.getSenha()))
			return Response.status(Response.Status.OK).entity(advogado.getNomeAdvogado()).build();
		
		return null;
	}

	private boolean senhaConfere(String senhaBanco, String senhaDigitada) {
		String senhaMD5;
		try {
			senhaMD5 = Util.geradorMD5(senhaDigitada);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		if (senhaBanco.equalsIgnoreCase(senhaMD5))
			return true;
		return false;
	}

}
