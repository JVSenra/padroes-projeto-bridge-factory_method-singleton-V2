package bridge_factory_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class OrdemServicoFactoryTest {
    @Test
    void deveRetornarExcecaoParaOrdemServicoInexistente() {
        try {
            OrdemServico ordemServico = OrdemServicoFactory.obterOrdemServico("Refatoracao");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Ordem de serviço inexistente", e.getMessage());
        }
    }
}