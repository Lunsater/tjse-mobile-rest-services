package br.jus.tjse.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.jus.tjse.dao.FaseProcessoDAO;
import br.jus.tjse.dominio.DadosFase;
import br.jus.tjse.dominio.FaseResponse;
import br.jus.tjse.model.FaseProcesso;

@Path("/fase")
public class FaseProcessoResource {
	
	@GET
	@Path("buscar/{id}")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscaFases(@PathParam("id") String numeroProcesso) {
		FaseProcessoDAO faseProcessoDAO = new FaseProcessoDAO();
		List<FaseProcesso> listaFases = faseProcessoDAO.obterFasesProcesso(numeroProcesso);
		if (listaFases != null && !listaFases.isEmpty()) {
			FaseResponse faseResponse = new FaseResponse();
			faseResponse.setNumProcesso(numeroProcesso);
			for (FaseProcesso fp : listaFases) {
				DadosFase dadosFase = new DadosFase();
				dadosFase.setDataFase(fp.getId().getDtMovimento());
				dadosFase.setDescricao(fp.getFase().getDsFase());
				
				faseResponse.getListaFases().add(dadosFase);
			}
			return Response.status(Response.Status.OK).entity(faseResponse).build();
		}
		return Response.status(Response.Status.OK).entity("Nenhuma fase encontrada.").build();
	}

}
