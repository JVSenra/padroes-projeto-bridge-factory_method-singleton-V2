
package singleton;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoTreinamentoTest {
    @Test
    void deveRetornarCustoServicoTreinamento() {
        assertEquals(70.0f,  ServicoTreinamento.getInstance().obterCusto(), 0.01f);
    }
}