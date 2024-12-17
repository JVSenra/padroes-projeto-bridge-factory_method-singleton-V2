package singleton;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoSuporteTest {
    @Test
    void deveRetornarCustoServiceSuporte() {
        assertEquals(50.0f,  ServicoSuporte.getInstance().obterCusto(), 0.01f);
    }
}
