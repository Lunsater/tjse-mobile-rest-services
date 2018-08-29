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
import br.jus.tjse.dao.MovimentoProcessoDAO;
import br.jus.tjse.dao.NumeracaoUnicaDAO;
import br.jus.tjse.dao.ProcessoDAO;
import br.jus.tjse.dao.ProcessoTipoParteDAO;
import br.jus.tjse.dominio.MovimentoResponse;
import br.jus.tjse.dominio.ProcessoResponse;
import br.jus.tjse.model.AssuntoProcesso;
import br.jus.tjse.model.FaseProcesso;
import br.jus.tjse.model.MovimentoProcesso;
import br.jus.tjse.model.Processo;
import br.jus.tjse.model.ProcessoTipoParte;

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
		procResp.setAssunto(obterAssuntoPrincipal(processo.getAssuntoProcessos()));
		
		FaseProcessoDAO faseProcessoDAO = new FaseProcessoDAO();
		List<FaseProcesso> fases = faseProcessoDAO.obterFasesProcesso(processo.getNumProcesso().toString());
		if (fases.size() > 0)
			procResp.setUltimaFase(fases.get(fases.size()-1).getFase().getDsFase());
		procResp.setQtdFases(fases.size());
		
		MovimentoProcessoDAO movimentoProcessoDAO = new MovimentoProcessoDAO();
		List<MovimentoProcesso> decisoes = movimentoProcessoDAO.obterMovimentoProcessoDecisao(processo.getNumProcesso().toString()); 
		procResp.setQtdDecisoes(decisoes.size());
		MovimentoResponse movimentoResponse = movimentoProcessoDAO.obterMovimentoProcesso(processo.getNumProcesso().toString());
		procResp.setQtdMovimentos(movimentoResponse.getListaMovimentos().size());
		
		ProcessoTipoParteDAO processoTipoParteDAO = new ProcessoTipoParteDAO();
		List<ProcessoTipoParte> processoTipoPartes = processoTipoParteDAO.obterPartes(processo.getNumProcesso().toString());
		procResp.setQtdPartes(processoTipoPartes.size());
		
		/*ResponseBuilder builder = Response.status(Response.Status.OK);
		builder.status(Response.Status.OK).entity(processo);
		return builder.build();*/
		
		return Response.status(Response.Status.OK).entity(procResp).build();
	}

	private String obterAssuntoPrincipal(List<AssuntoProcesso> assuntoProcessos) {
		if (assuntoProcessos == null)
			return null;
		
		for (AssuntoProcesso assunto : assuntoProcessos) {
			if ("S".equals(assunto.getFlgAssuntoPrincipal()))
				return assunto.getAssunto().getDsAssuntoCompleto();
		}
		// Se não encontrar o assunto principal retorna o primeiro assunto
		return assuntoProcessos.get(0).getAssunto().getDsAssuntoCompleto();
	}

}
