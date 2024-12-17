package singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoConsultoriaTest {
    @Test
    void deveRetornarCustoServicoConsultoria() {
        assertEquals(100.0f,  ServicoConsultoria.getInstance().obterCusto(), 0.01f);
    }
}
