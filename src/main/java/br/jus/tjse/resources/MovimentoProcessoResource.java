package br.jus.tjse.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.jus.tjse.dao.MovimentoProcessoDAO;
import br.jus.tjse.dominio.DadosMovimento;
import br.jus.tjse.dominio.MovimentoResponse;
import br.jus.tjse.model.MovimentoProcesso;

@Path("/movimento")
public class MovimentoProcessoResource {

	@GET
	@Path("/buscar/{id}")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscaMovimentos(@PathParam("id") String numeroProcesso) {
		MovimentoProcessoDAO movimentoProcessoDAO = new MovimentoProcessoDAO();
		List<MovimentoProcesso> listaMovimentos = movimentoProcessoDAO.obterMovimentoProcesso(numeroProcesso);
		if (listaMovimentos != null && !listaMovimentos.isEmpty()) {
			MovimentoResponse movimentoResponse = new MovimentoResponse();
			movimentoResponse.setNumProcesso(numeroProcesso);
			for (MovimentoProcesso mp : listaMovimentos) {				
				DadosMovimento dadosMovimento = new DadosMovimento();
				dadosMovimento.setDataMovimento(mp.getId().getDtMovimento());
				dadosMovimento.setTxtMovimento(mp.getTxtMovimento());
				dadosMovimento.setTxtIntegra(mp.getTxtIntegra());
				dadosMovimento.setFlgSilgiloso(mp.getFlgSigiloso());
				movimentoResponse.getListaMovimentos().add(dadosMovimento);
			}
			return Response.status(Response.Status.OK).entity(movimentoResponse).build();
		}
		return Response.status(Response.Status.OK).entity("Nenhum movimento encontrado.").build();
	}
}
