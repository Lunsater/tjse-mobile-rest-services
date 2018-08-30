package br.jus.tjse.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.jus.tjse.dao.MovimentoProcessoDAO;
import br.jus.tjse.dominio.MovimentoResponse;

@Path("/movimento")
public class MovimentoProcessoResource {

	@GET
	@Path("/buscar/{id}")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscaMovimentos(@PathParam("id") String numeroProcesso) {
		MovimentoProcessoDAO movimentoProcessoDAO = new MovimentoProcessoDAO();
		MovimentoResponse movimentoResponse = movimentoProcessoDAO.obterMovimentoProcesso(numeroProcesso);
		if (movimentoResponse != null)
			return Response.status(Response.Status.OK).entity(movimentoResponse).build();
		else
			return Response.status(Response.Status.OK).entity("Nenhum movimento encontrado.").build();
	}
	
	@GET
	@Path("/buscar/decisao/{id}")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscaMovimentosDecisao(@PathParam("id") String numeroProcesso) {
		MovimentoProcessoDAO movimentoProcessoDAO = new MovimentoProcessoDAO();
		MovimentoResponse movimentoResponse = movimentoProcessoDAO.obterMovimentoProcessoDecisao(numeroProcesso);
		if (movimentoResponse != null)
			return Response.status(Response.Status.OK).entity(movimentoResponse).build();
		
		return Response.status(Response.Status.OK).entity("Nenhuma decisão encontrada.").build();
	}

}
