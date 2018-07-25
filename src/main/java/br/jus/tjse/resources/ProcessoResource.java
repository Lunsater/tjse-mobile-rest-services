package br.jus.tjse.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.jus.tjse.dao.NumeracaoUnicaDAO;
import br.jus.tjse.dao.ProcessoDAO;
import br.jus.tjse.dominio.ProcessoResponse;
import br.jus.tjse.model.Processo;

@Path("/processo")
public class ProcessoResource {
	
	@GET
	@Path("/buscar/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.TEXT_PLAIN)
	public Response buscaProcesso(@PathParam("id") String numero) {
		ProcessoDAO processoDAO = new ProcessoDAO();
		Processo processo = processoDAO.obterProcessoPorNumero(numero);
		if (processo == null)
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Processo não encontrado!").build();
		
		ProcessoResponse procResp = new ProcessoResponse();
		procResp.setDataDistribuicao(processo.getDtDistribuicao());
		procResp.setNumProcesso(processo.getNumProcesso().toString());
		
		NumeracaoUnicaDAO numeracaoUnicaDAO = new NumeracaoUnicaDAO();
		procResp.setNumUnico(numeracaoUnicaDAO.obterNumUnicoProcesso(numero).getNumeroUnico());
		
		procResp.setCompetencia(processo.getCompetencia().getNome());
		
		
		/*ResponseBuilder builder = Response.status(Response.Status.OK);
		builder.status(Response.Status.OK).entity(processo);
		return builder.build();*/
		
		return Response.status(Response.Status.OK).entity(processo).build();
	}

}
