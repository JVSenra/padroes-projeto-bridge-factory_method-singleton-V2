package bridge_factory_method;

import org.junit.jupiter.api.Test;
import singleton.ServicoConsultoria;
import singleton.ServicoSuporte;
import singleton.ServicoTreinamento;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrdemServicoPresencialTest {
    @Test
    void deveRetornarCustoServicoSuporte() {
        OrdemServico ordemServico = OrdemServicoFactory.obterOrdemServico("Presencial");
        ordemServico.setServico(ServicoSuporte.getInstance());
        ordemServico.setQuantDias(10);
        assertEquals(600.0f, ordemServico.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoServicoTreinamento() {
        OrdemServico ordemServico = OrdemServicoFactory.obterOrdemServico("Presencial");
        ordemServico.setServico(ServicoTreinamento.getInstance());
        ordemServico.setQuantDias(10);
        assertEquals(840.0f, ordemServico.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoServicoConsultoria() {
        OrdemServico ordemServico = OrdemServicoFactory.obterOrdemServico("Presencial");
        ordemServico.setServico(ServicoConsultoria.getInstance());
        ordemServico.setQuantDias(10);
        assertEquals(1200.0f, ordemServico.calcularCusto(), 0.01f);
    }
}
