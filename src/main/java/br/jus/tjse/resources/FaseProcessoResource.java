package br.jus.tjse.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.jus.tjse.dao.FaseProcessoDAO;
import br.jus.tjse.dominio.FaseResponse;

@Path("/fase")
public class FaseProcessoResource {
	
	@GET
	@Path("buscar/{id}")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscaFases(@PathParam("id") String numeroProcesso) {
		FaseProcessoDAO faseProcessoDAO = new FaseProcessoDAO();
		FaseResponse faseResponse = faseProcessoDAO.obterFasesProcesso(numeroProcesso);
		if (faseResponse != null)
			return Response.status(Response.Status.OK).entity(faseResponse).build();
		
		return Response.status(Response.Status.OK).entity("Nenhuma fase encontrada.").build();
	}

}
