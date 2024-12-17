package bridge_factory_method;

import org.junit.jupiter.api.Test;
import singleton.ServicoConsultoria;
import singleton.ServicoSuporte;
import singleton.ServicoTreinamento;

import static org.junit.jupiter.api.Assertions.*;
public class OrdemServicoOnlineTest {
    @Test
    void deveRetornarCustoServicoSuporte() {
        OrdemServico ordemServico = OrdemServicoFactory.obterOrdemServico("Online");
        ordemServico.setServico(ServicoSuporte.getInstance());
        ordemServico.setQuantDias(10);
        assertEquals(500.0f, ordemServico.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoServicoTreinamento() {
        OrdemServico ordemServico = OrdemServicoFactory.obterOrdemServico("Online");
        ordemServico.setServico(ServicoTreinamento.getInstance());
        ordemServico.setQuantDias(10);
        assertEquals(700.0f, ordemServico.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoServicoConsultoria() {
        OrdemServico ordemServico = OrdemServicoFactory.obterOrdemServico("Online");
        ordemServico.setServico(ServicoConsultoria.getInstance());
        ordemServico.setQuantDias(10);
        assertEquals(1000.0f, ordemServico.calcularCusto(), 0.01f);
    }
}
