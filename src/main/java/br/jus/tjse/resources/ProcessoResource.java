package br.jus.tjse.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import br.jus.tjse.dao.ProcessoDAO;
import br.jus.tjse.model.Processo;

@Path("/processo")
public class ProcessoResource {
	
	@POST
	@Path("/buscar/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.TEXT_PLAIN)
	public Response buscaProcesso(@PathParam("id") String numero) {
		ProcessoDAO processoDAO = new ProcessoDAO();
		Processo processo = processoDAO.obterProcessoPorNumero(numero);
		if (processo == null)
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Processo não encontrado!").build();
		
		ResponseBuilder builder = Response.status(Response.Status.OK);
		builder.status(Response.Status.OK).entity(processo);
		return builder.build();
	}

}
